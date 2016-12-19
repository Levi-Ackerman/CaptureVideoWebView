package lee.scut.edu.videowebview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private MyWebView mWebview;
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mWebview.loadUrl("http://www.hao123.com");
    }

    private void initView() {
        mWebview = (MyWebView) findViewById(R.id.webview);
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn3 = (Button) findViewById(R.id.btn3);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:

                break;
            case R.id.btn2:

                break;
            case R.id.btn3:

                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (mWebview != null && mWebview.canGoBack()){
            mWebview.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
