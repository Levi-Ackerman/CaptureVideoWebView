package lee.scut.edu.videowebview;

import android.util.Log;
import android.webkit.WebView;

/**
 * Created by zhengxian.lzx@alibaba-inc.com on 2016-12-19.
 */

public class WebViewControlller {
    private WebViewControlller() {
    }

    public static WebViewControlller getInstance() {
        return SingleTon.INSTANCE;
    }

    private static class SingleTon {
        private static final WebViewControlller INSTANCE = new WebViewControlller();
    }

    public void onUrlLoaded(WebView webView, String url){
        Log.i("lee..",url);
    }
}
