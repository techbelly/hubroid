package org.idlesoft.android.hubroid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import org.idlesoft.libraries.ghapi.User;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class GravatarCache {

    /**
     * Returns a Bitmap of the Gravatar associated with the provided ID.
     * This image will be scaled according to the provided size.
     *
     * @param id
     * @param size
     * @return a scaled Bitmap
     */
    public static Bitmap getGravatar(String id, int size) {
        Bitmap bm = null;
        try {
            File gravatars = ensure_directory(ROOT_DIR);
            hideMediaFromGallery(gravatars);

            File image = new File(gravatars, id + ".png");
            bm = BitmapFactory.decodeFile(image.getPath());
            if (bm == null) {
                bm = downloadGravatar(id);
                bm.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(image));
            }
            bm = Bitmap.createScaledBitmap(bm, size, size, true);
        } catch (IOException e) {
            Log.e("debug", "Error saving bitmap", e);
            e.printStackTrace();
        }
        return bm;
    }

    /**
     * Returns a Gravatar ID associated with the provided name
     *
     * @param name
     * @return the gravatar ID associated with the name
     */
    public static String getGravatarID(String name) {
        String id = "";
        try {
            File gravatars = ensure_directory(ROOT_DIR);
            File gravatar_id = new File(gravatars, name + ".id");

            if (gravatar_id.isFile()) {
                FileReader fr = new FileReader(gravatar_id);
                BufferedReader in = new BufferedReader(fr);
                id = in.readLine();
                in.close();
            } else {
                id = getGravatarIdFromGithub(name);
                if (!id.equals("")) {
                    FileWriter fw = new FileWriter(gravatar_id);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(id);
                    bw.flush();
                    bw.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    private final static String ROOT_DIR = "hubroid/gravatars";

    private static File ensure_directory(String path) throws IOException {
        File root = Environment.getExternalStorageDirectory();
        if (!root.canWrite()) {
            throw new IOException("External storage directory is not writable");
        }
        String[] parts = path.split("/");
        for (String part : parts) {
            File f = new File(root, part);
            if (!f.exists()) {
                boolean created = f.mkdir();
                if (!created) {
                    throw new IOException("Unable to create directory " + part);
                }
            } else {
                if (!f.isDirectory()) {
                    throw new IOException("Unable to create directory " + part);
                }
            }
            root = f;
        }
        return root;
    }

    private static String getGravatarIdFromGithub(String name) {
        try {
            return new JSONObject(User.info(name).resp).getJSONObject("user").getString("gravatar_id");
        } catch (NullPointerException e) {
            return "";
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }


    private static void hideMediaFromGallery(File gravatars) throws IOException {
        File nomedia = new File(gravatars, ".nomedia");
        if (!nomedia.exists()) {
            nomedia.createNewFile();
        }
    }

    private static Bitmap downloadGravatar(String id) throws IOException {
        URL aURL = new URL(
                "http://www.gravatar.com/avatar.php?gravatar_id="
                        + URLEncoder.encode(id) + "&size=50&d="
                        // Get the default 50x50 gravatar from GitHub if ID doesn't exist
                        + URLEncoder.encode("http://github.com/eddieringle/hubroid/raw/master/res/drawable/default_gravatar.png"));
        URLConnection conn = aURL.openConnection();
        conn.connect();
        InputStream is = conn.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        Bitmap bm = BitmapFactory.decodeStream(bis);
        bis.close();
        is.close();
        return bm;
    }
}
