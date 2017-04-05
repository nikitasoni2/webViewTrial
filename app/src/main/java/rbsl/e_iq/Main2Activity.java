package rbsl.e_iq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView =(WebView)findViewById(R.id.web_iq);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.snapdeal.com/");

    }
}
