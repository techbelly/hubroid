/**
 * Hubroid - A GitHub app for Android
 *
 * Copyright (c) 2010 Eddie Ringle.
 *
 * Licensed under the New BSD License.
 */

package org.idlesoft.android.hubroid;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import com.flurry.android.FlurryAgent;
import org.idlesoft.libraries.ghapi.User;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

public class Hubroid extends Activity {
    public static final String PREFS_NAME = "HubroidPrefs";
    // Time format used by GitHub in their responses
    public static final String GITHUB_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZZZZ";
    // Time format used by GitHub in their issue API. Inconsistent, tsk, tsk.
    public static final String GITHUB_ISSUES_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss ZZZZ";
    private SharedPreferences m_prefs;
    private SharedPreferences.Editor m_editor;
    private String m_username;
    private String m_token;
    public ListView m_menuList;
    public JSONObject m_userData;
    public ProgressDialog m_progressDialog;
    public boolean m_isLoggedIn;
    private Thread m_thread;

    public static final String[] MAIN_MENU = new String[]{
            "Watched Repos",
            "Followers/Following",
            "Activity Feeds",
            "My Repositories",
            "Search",
            "My Profile"
    };

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (!menu.hasVisibleItems()) {
            menu.add(0, 1, 0, "Clear Preferences");
            menu.add(0, 2, 0, "Clear Cache");
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                m_editor.clear().commit();
                Intent intent = new Intent(Hubroid.this, Hubroid.class);
                startActivity(intent);
                return true;
            case 2:
                File root = Environment.getExternalStorageDirectory();
                if (root.canWrite()) {
                    File hubroid = new File(root, "hubroid");
                    if (!hubroid.exists() && !hubroid.isDirectory()) {
                        return true;
                    } else {
                        hubroid.delete();
                        return true;
                    }
                }
        }
        return false;
    }

    private OnItemClickListener onMenuItemSelected = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> pV, View v, int pos, long id) {
            Intent intent;
            switch (pos) {
                case 0:
                    intent = new Intent(Hubroid.this, WatchedRepositories.class);
                    startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(Hubroid.this, FollowersFollowing.class);
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(Hubroid.this, ActivityFeeds.class);
                    intent.putExtra("username", m_username);
                    startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(Hubroid.this, RepositoriesList.class);
                    startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(Hubroid.this, Search.class);
                    startActivity(intent);
                    break;
                case 5:
                    intent = new Intent(Hubroid.this, UserInfo.class);
                    intent.putExtra("username", m_username);
                    startActivity(intent);
                    break;
                default:
                    Toast.makeText(Hubroid.this, "Umm...", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m_prefs = getSharedPreferences(PREFS_NAME, 0);
        m_editor = m_prefs.edit();
        m_username = m_prefs.getString("login", "");
        m_token = m_prefs.getString("token", "");
        m_isLoggedIn = m_prefs.getBoolean("isLoggedIn", false);

        // Check to see if the user is already logged in
        if (!m_isLoggedIn) {
            // Launch the splash screen if not logged in so the user can do so
            Intent intent = new Intent(Hubroid.this, SplashScreen.class);
            startActivity(intent);
            Hubroid.this.finish();
        } else {
            // Start the show.
            setContentView(R.layout.main_menu);

            m_menuList = (ListView) findViewById(R.id.lv_main_menu_list);
            m_menuList.setAdapter(new ArrayAdapter<String>(Hubroid.this, R.layout.main_menu_item, MAIN_MENU));
            m_menuList.setOnItemClickListener(onMenuItemSelected);

            m_thread = new Thread(new Runnable() {
                public void run() {
                    try {
                        JSONObject result = new JSONObject(User.info(m_username, m_token).resp);
                        m_userData = result.getJSONObject("user");

                        runOnUiThread(new Runnable() {
                            public void run() {
                                ImageView gravatar = (ImageView) findViewById(R.id.iv_main_gravatar);
                                try {
                                    gravatar.setImageBitmap(GravatarCache.getGravatar(m_userData.getString("gravatar_id"), 36));
                                    TextView username = (TextView) findViewById(R.id.tv_main_username);
                                    if (m_userData.getString("name").length() > 0) {
                                        username.setText(m_userData.getString("name"));
                                    } else {
                                        username.setText(m_username);
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                                // Unhide the screen
                                ((RelativeLayout) findViewById(R.id.rl_main_menu_root)).setVisibility(View.VISIBLE);
                            }
                        });
                    } catch (JSONException e) {
                        runOnUiThread(new Runnable() {
                            public void run() {
                                Toast.makeText(Hubroid.this, "Error gathering user data.", Toast.LENGTH_SHORT).show();

                                // Unhide the screen
                                ((RelativeLayout) findViewById(R.id.rl_main_menu_root)).setVisibility(View.VISIBLE);
                            }
                        });
                        e.printStackTrace();
                    }
                }
            });
            m_thread.start();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        FlurryAgent.onStartSession(this, "K8C93KDB2HH3ANRDQH1Z");
    }

    @Override
    public void onStop() {
        super.onStop();
        FlurryAgent.onEndSession(this);
    }

    @Override
    public void onPause() {
        if (m_thread != null && m_thread.isAlive())
            m_thread.stop();
        if (m_progressDialog != null && m_progressDialog.isShowing())
            m_progressDialog.dismiss();
        super.onPause();
    }
}