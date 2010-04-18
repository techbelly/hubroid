package org.idlesoft.android.hubroid;

import android.content.Context;
import android.test.AndroidTestCase;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class ActivityFeedAdapterTest extends AndroidTestCase {
    Mockery mockery = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    @Test
    public void testLoadGravatars() throws Exception {
        JSONObject jsonObject = new JSONObject(json_from_github);
        JSONArray json = jsonObject.getJSONObject("query").getJSONObject("results").getJSONArray("entry");
        Context c = mockery.mock(Context.class);

        ActivityFeedAdapter adaptor = new ActivityFeedAdapter(c, json, false);


    }

    public void testGetCount() throws Exception {
    }

    public void testGetItem() throws Exception {
    }

    public void testGetItemId() throws Exception {
    }

    public void testGetView() throws Exception {
    }

    String json_from_github = "{\n" +
            " \"query\": {\n" +
            "  \"count\": \"35\",\n" +
            "  \"created\": \"2010-04-18T01:06:32Z\",\n" +
            "  \"lang\": \"en-US\",\n" +
            "  \"results\": {\n" +
            "   \"entry\": [\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:ForkEvent/186759168\",\n" +
            "     \"published\": \"2010-04-17T17:21:15-07:00\",\n" +
            "     \"updated\": \"2010-04-17T17:21:15-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/hubroid/\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly forked eddieringle/hubroid\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      Forked repository is at <a href=\\\"http://github.com/techbelly/hubroid\\\">techbelly/hubroid</a>\\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/182966941\",\n" +
            "     \"published\": \"2010-04-12T13:52:51-07:00\",\n" +
            "     \"updated\": \"2010-04-12T13:52:51-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/scraperwikiyql/compare/bc9d9c3a6c...6b9650decf\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/scraperwikiyql\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/scraperwikiyql/commit/6b9650decff299c8f48bb2b6c32358c63ec518cc\\\">6b9650d</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Different path for scraperwiki api if no filters requested</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/scraperwikiyql/commit/16d937dc21c62a34b63edd4b88b593a691511cca\\\">16d937d</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Different path for scraperwiki api if no filters requested</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/182753478\",\n" +
            "     \"published\": \"2010-04-12T09:28:17-07:00\",\n" +
            "     \"updated\": \"2010-04-12T09:28:17-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/scraperwikiyql/compare/07a41b295a...bc9d9c3a6c\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/scraperwikiyql\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/scraperwikiyql/commit/bc9d9c3a6cac4c0956b0febff50057c8f36a773c\\\">bc9d9c3</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>XML typo</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/scraperwikiyql/commit/a221a907863c29c30ebbfbb88951dcd4cc02bc80\\\">a221a90</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Trying to use latest version of sinatra on heroku</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/scraperwikiyql/commit/6310347b9a08eaeaab7f26da39f25b346dac0e39\\\">6310347</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Require builder explicitly</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/182704282\",\n" +
            "     \"published\": \"2010-04-12T07:52:43-07:00\",\n" +
            "     \"updated\": \"2010-04-12T07:52:43-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/scraperwikiyql/compare/master\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created branch master at techbelly/scraperwikiyql\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      New branch is at\\n      <a href=\\\"http://github.com/techbelly/scraperwikiyql/tree/master\\\">techbelly/scraperwikiyql/tree/master</a>\\n      \\n        <br/>\\n        <a href=\\\"http://github.com/techbelly/scraperwikiyql/compare/master\\\" class=\\\"compare-link\\\">Compare master branch with master &raquo;</a>\\n      \\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/182703952\",\n" +
            "     \"published\": \"2010-04-12T07:51:48-07:00\",\n" +
            "     \"updated\": \"2010-04-12T07:51:48-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/scraperwikiyql\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created repository scraperwikiyql\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      Automatically make yql open data tables from scraper wiki scrapes\\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/181293346\",\n" +
            "     \"published\": \"2010-04-09T19:37:47-07:00\",\n" +
            "     \"updated\": \"2010-04-09T19:37:47-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/twitter_book/compare/726ee72eb2...a94195fc81\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/twitter_book\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/twitter_book/commit/a94195fc81fcc5690f7503e142a2546c4abe0b00\\\">a94195f</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Begone regexps. Hello some nicer intentional stuff.</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/180819639\",\n" +
            "     \"published\": \"2010-04-09T08:29:58-07:00\",\n" +
            "     \"updated\": \"2010-04-09T08:29:58-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/twitter_book/compare/ec15bcf2bb...726ee72eb2\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/twitter_book\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/h-lame\\\" class=\\\"committer\\\">h-lame</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/twitter_book/commit/726ee72eb239c582f599c3a49c08af2f1ae9f305\\\">726ee72</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Fix the example of using xsltproc in the README.<br>\\n<br>\\nAlso provide a link to FOP.</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/h-lame\\\" class=\\\"committer\\\">h-lame</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/twitter_book/commit/3d9d37b7b555fb3268293e47739ddbd63fb17123\\\">3d9d37b</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Allow for URLs with querystrings in them.<br>\\nProperly check for &amp;gt; and &amp;lt; and not escaping them (but still escaping other entities that start with g or l).</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/179956943\",\n" +
            "     \"published\": \"2010-04-08T08:59:10-07:00\",\n" +
            "     \"updated\": \"2010-04-08T08:59:10-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/twitter_book/compare/80c02dce27...ec15bcf2bb\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/twitter_book\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/twitter_book/commit/ec15bcf2bbb93a1081605006df3e94febe4edbcc\\\">ec15bcf</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Added link to pdf example</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/179939937\",\n" +
            "     \"published\": \"2010-04-08T08:37:18-07:00\",\n" +
            "     \"updated\": \"2010-04-08T08:37:18-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/twitter_book/compare/30904898ec...80c02dce27\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/twitter_book\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/twitter_book/commit/80c02dce2784d4277affbded3a448a61c7315e55\\\">80c02dc</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Missed sort stage. Whoops</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PublicEvent/179921177\",\n" +
            "     \"published\": \"2010-04-08T08:19:18-07:00\",\n" +
            "     \"updated\": \"2010-04-08T08:19:18-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly open sourced twitter_book\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n    Create a book from twitter\\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176333932\",\n" +
            "     \"published\": \"2010-04-02T17:11:22-07:00\",\n" +
            "     \"updated\": \"2010-04-02T17:11:22-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/5d79a02ae4...b208de4625\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/b208de4625850f007ef275736aa496a770b671a2\\\">b208de4</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Let's try paging now</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176331309\",\n" +
            "     \"published\": \"2010-04-02T17:06:08-07:00\",\n" +
            "     \"updated\": \"2010-04-02T17:06:08-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/48b3e4ee94...5d79a02ae4\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/5d79a02ae429c2dd924ae6effab3c14454b743b8\\\">5d79a02</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Let's try paging now</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176328996\",\n" +
            "     \"published\": \"2010-04-02T17:01:03-07:00\",\n" +
            "     \"updated\": \"2010-04-02T17:01:03-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/699b984b4f...48b3e4ee94\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/48b3e4ee942329e3542d41e781a84e7501237624\\\">48b3e4e</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Wrong name</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176328542\",\n" +
            "     \"published\": \"2010-04-02T16:58:35-07:00\",\n" +
            "     \"updated\": \"2010-04-02T16:58:35-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/9ba722ce58...699b984b4f\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/699b984b4fbea3a2701034cc1d7db6db833dac7d\\\">699b984</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Wrong name</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176327947\",\n" +
            "     \"published\": \"2010-04-02T16:55:11-07:00\",\n" +
            "     \"updated\": \"2010-04-02T16:55:11-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/8fadbd0623...9ba722ce58\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/9ba722ce58dff308043024c21eb2f9889462b973\\\">9ba722c</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Added NewsArticleList</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/176306922\",\n" +
            "     \"published\": \"2010-04-02T16:25:07-07:00\",\n" +
            "     \"updated\": \"2010-04-02T16:25:07-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/d93fc914d8...8fadbd0623\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/NHSChoices-YQL/commit/8fadbd062313d4204c4ec5258c4ba576d2591707\\\">8fadbd0</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Teach me to copy and paste from Yahoo docs</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/176304654\",\n" +
            "     \"published\": \"2010-04-02T16:21:41-07:00\",\n" +
            "     \"updated\": \"2010-04-02T16:21:41-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL/compare/master\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created branch master at techbelly/NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      New branch is at\\n      <a href=\\\"http://github.com/techbelly/NHSChoices-YQL/tree/master\\\">techbelly/NHSChoices-YQL/tree/master</a>\\n      \\n        <br/>\\n        <a href=\\\"http://github.com/techbelly/NHSChoices-YQL/compare/master\\\" class=\\\"compare-link\\\">Compare master branch with master &raquo;</a>\\n      \\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/176303170\",\n" +
            "     \"published\": \"2010-04-02T16:19:49-07:00\",\n" +
            "     \"updated\": \"2010-04-02T16:19:49-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/NHSChoices-YQL\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created repository NHSChoices-YQL\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      YQL XML bindings for NHS Choices API\\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171588785\",\n" +
            "     \"published\": \"2010-03-27T10:12:18-07:00\",\n" +
            "     \"updated\": \"2010-03-27T10:12:18-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/b24044f443...4b475d0fd1\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/4b475d0fd19391d6228c7f0aa4be863c68e7823f\\\">4b475d0</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>break lists by category</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171587279\",\n" +
            "     \"published\": \"2010-03-27T10:03:56-07:00\",\n" +
            "     \"updated\": \"2010-03-27T10:03:56-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/d589ee3f21...d1f804a024\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/d1f804a024be0ca54e8f08d008f745dc76bd33a2\\\">d1f804a</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Partial for artworks</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171570398\",\n" +
            "     \"published\": \"2010-03-27T09:29:46-07:00\",\n" +
            "     \"updated\": \"2010-03-27T09:29:46-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/1bd968ab4d...d589ee3f21\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/d589ee3f217cd3de409325a648c93f9afe194ef0\\\">d589ee3</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Moved email check</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171569305\",\n" +
            "     \"published\": \"2010-03-27T09:22:22-07:00\",\n" +
            "     \"updated\": \"2010-03-27T09:22:22-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/258c18bcdf...c7b048acb0\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/c7b048acb0e0322109ad8bbd492d9d71af8ec2a2\\\">c7b048a</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Other artworks</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171568564\",\n" +
            "     \"published\": \"2010-03-27T09:16:32-07:00\",\n" +
            "     \"updated\": \"2010-03-27T09:16:32-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/267e8617d8...258c18bcdf\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/258c18bcdfec8e6da34b896ad9e535735a6d0c70\\\">258c18b</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Cosmetic changes</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171563064\",\n" +
            "     \"published\": \"2010-03-27T08:49:53-07:00\",\n" +
            "     \"updated\": \"2010-03-27T08:49:53-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/028144b8e0...ab86900056\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/ab8690005601aa1e187b23c2d66dbe5fac33a1fd\\\">ab86900</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Merge branch 'master' of github.com:aubergene/HMRC-Artworks</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/d768a56c93b8b7890c355e058fc8dd6b486c49ae\\\">d768a56</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>DESCRIPTION WITH AN I</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171553012\",\n" +
            "     \"published\": \"2010-03-27T08:28:06-07:00\",\n" +
            "     \"updated\": \"2010-03-27T08:28:06-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/91f1acd0ce...47471c6897\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/47471c6897f8764adef0dfceb023044e9a581bcc\\\">47471c6</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Merge branch 'master' of github.com:aubergene/HMRC-Artworks</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/44a34f0059dc211fa16f4c10180fc70527ebdddc\\\">44a34f0</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Scraped</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171546840\",\n" +
            "     \"published\": \"2010-03-27T08:03:24-07:00\",\n" +
            "     \"updated\": \"2010-03-27T08:03:24-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/c72365b0d5...708785a307\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/708785a30725ad6ade852d9264113282a0339acc\\\">708785a</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Sample parse set 1</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/171512527\",\n" +
            "     \"published\": \"2010-03-27T06:27:03-07:00\",\n" +
            "     \"updated\": \"2010-03-27T06:27:03-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/aubergene/HMRC-Artworks/compare/1e22ffb764...c72365b0d5\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at aubergene/HMRC-Artworks\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/c72365b0d5dd9061e436ccad71436e58b311e264\\\">c72365b</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Merge branch 'master' of github.com:aubergene/HMRC-Artworks</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/aubergene/HMRC-Artworks/commit/026ca58518556aff57517c51d384247fee89cd6e\\\">026ca58</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Scrape sample</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/166573236\",\n" +
            "     \"published\": \"2010-03-19T10:54:51-07:00\",\n" +
            "     \"updated\": \"2010-03-19T10:54:51-07:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/gma/nhs-toolbar/compare/4ed21847b9...3207559034\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at gma/nhs-toolbar\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/gma/nhs-toolbar/commit/3207559034dfea80fadf73be54773f4065b7a5d3\\\">3207559</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Where I've got to</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/159227678\",\n" +
            "     \"published\": \"2010-03-12T08:30:06-08:00\",\n" +
            "     \"updated\": \"2010-03-12T08:30:06-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/thespesius/compare/22f5f7ed4b...837620b00f\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/thespesius\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/thespesius/commit/837620b00fc8b9c9d75773128f7cc9b63d0041fb\\\">837620b</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Screenshots used in presentation</blockquote>\\n        </div>\\n      </li>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/thespesius/commit/e474624b84358f64996ee3216cb6ddcfd41ebe5c\\\">e474624</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>scripts as presented</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/159221186\",\n" +
            "     \"published\": \"2010-03-12T08:19:40-08:00\",\n" +
            "     \"updated\": \"2010-03-12T08:19:40-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/thespesius/compare/master\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created branch master at techbelly/thespesius\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      New branch is at\\n      <a href=\\\"http://github.com/techbelly/thespesius/tree/master\\\">techbelly/thespesius/tree/master</a>\\n      \\n        <br/>\\n        <a href=\\\"http://github.com/techbelly/thespesius/compare/master\\\" class=\\\"compare-link\\\">Compare master branch with master &raquo;</a>\\n      \\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:CreateEvent/159220996\",\n" +
            "     \"published\": \"2010-03-12T08:18:38-08:00\",\n" +
            "     \"updated\": \"2010-03-12T08:18:38-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/thespesius\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly created repository thespesius\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n  <div class=\\\"message\\\">\\n    \\n      Rewired State thingy to inject data.gov.uk papers into BBC news.\\n    \\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:PushEvent/112673493\",\n" +
            "     \"published\": \"2009-12-16T18:50:20-08:00\",\n" +
            "     \"updated\": \"2009-12-16T18:50:20-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/techbelly/dotfiles/compare/eb65372182...f30b103357\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly pushed to master at techbelly/dotfiles\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n\\n\\n\\n\\n\\n\\n<div class=\\\"details\\\">\\n  \\n\\n  \\n    <div class=\\\"commits\\\">\\n    <ul>\\n    \\n      \\n      <li>\\n        \\n          <a href=\\\"http://github.com/techbelly\\\" class=\\\"committer\\\">techbelly</a>\\n        \\n        committed\\n        <code><a href=\\\"http://github.com/techbelly/dotfiles/commit/f30b103357dffc49c6e0ab7694e7faabff290dd9\\\">f30b103</a></code>\\n\\n        <div class=\\\"message\\\">\\n          <blockquote>Added a couple of scripts. Changed barchart scripts for ruby manor</blockquote>\\n        </div>\\n      </li>\\n    \\n\\n    \\n    </ul>\\n    </div>\\n  \\n</div>\\n\\n\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:FollowEvent/112070871\",\n" +
            "     \"published\": \"2009-12-15T15:37:12-08:00\",\n" +
            "     \"updated\": \"2009-12-15T15:37:12-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/ja\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly started following ja\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n<div class=\\\"details\\\">\\n  \\n    \\n  \\n  <div class=\\\"message\\\">\\n    ja has\\n    4\\n    public repos\\n    and 15\\n   followers.\\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:FollowEvent/112070848\",\n" +
            "     \"published\": \"2009-12-15T15:37:10-08:00\",\n" +
            "     \"updated\": \"2009-12-15T15:37:10-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/crowbot\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly started following crowbot\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n<div class=\\\"details\\\">\\n  \\n    \\n  \\n  <div class=\\\"message\\\">\\n    crowbot has\\n    1\\n    public repos\\n    and 8\\n   followers.\\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    },\n" +
            "    {\n" +
            "     \"id\": \"tag:github.com,2008:FollowEvent/112070800\",\n" +
            "     \"published\": \"2009-12-15T15:37:01-08:00\",\n" +
            "     \"updated\": \"2009-12-15T15:37:01-08:00\",\n" +
            "     \"link\": {\n" +
            "      \"href\": \"http://github.com/rarepleasures\",\n" +
            "      \"rel\": \"alternate\",\n" +
            "      \"type\": \"text/html\"\n" +
            "     },\n" +
            "     \"title\": \"techbelly started following rarepleasures\",\n" +
            "     \"content\": {\n" +
            "      \"type\": \"html\",\n" +
            "      \"content\": \"\\n<div class=\\\"details\\\">\\n  \\n    \\n  \\n  <div class=\\\"message\\\">\\n    rarepleasures has\\n    8\\n    public repos\\n    and 1\\n   follower.\\n  </div>\\n</div>\\n\"\n" +
            "     },\n" +
            "     \"author\": {\n" +
            "      \"name\": \"techbelly\"\n" +
            "     }\n" +
            "    }\n" +
            "   ]\n" +
            "  }\n" +
            " }\n" +
            "}";
}
