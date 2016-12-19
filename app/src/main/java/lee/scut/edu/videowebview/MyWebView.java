package lee.scut.edu.videowebview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created by zhengxian.lzx@alibaba-inc.com on 2016-12-19.
 */

public class MyWebView extends WebView {
    public MyWebView(Context context) {
        super(context);
        init();
    }

    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setWebChromeClient(new MyWebChromeClient());
        setWebViewClient(new MyWebViewClient());
    }

    @Override
    public void loadUrl(String url) {
        super.loadUrl(url);
        WebViewControlller.getInstance().onUrlLoaded(this, url);
    }
}
