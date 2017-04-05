package rbsl.e_iq;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnamazone,btnflipkart,btnsnapdeal,btngoogle;
    String token;
    public static final String TAG = "InMain";
    WebView browser;
    String URL1 = "http://www.amazon.in/";
    String URL2 = "https://www.flipkart.com/";
    String URL3 = "https://www.snapdeal.com/";
    String URL4 = "https://www.google.com/";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btnamazone = (Button)findViewById(R.id.amazone);
        btnflipkart = (Button)findViewById(R.id.flipkart);
        btnsnapdeal = (Button)findViewById(R.id.snapdeal);
        btngoogle = (Button)findViewById(R.id.google);
        browser = (WebView) findViewById(R.id.web_iq);
        browser.getSettings().setJavaScriptEnabled(true);
       browser.getSettings().setLoadWithOverviewMode(true);
        /*   browser.getSettings().setBuiltInZoomControls(true);*/



       browser.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Toast.makeText(getApplicationContext(), url, Toast.LENGTH_SHORT).show();
                Log.v("TEST", url);
                view.loadUrl(url);

              /*  if (url.equals("http://stackoverflow.com/questions")) {
                    Toast.makeText(getApplicationContext(), "SKIP", Toast.LENGTH_SHORT).show();
                } else {

                }*/
                return true;
            }
        });

        btnflipkart.setOnClickListener(this);
        btnamazone.setOnClickListener(this);
        btngoogle.setOnClickListener(this);
        btnsnapdeal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.amazone:
                callmethod(URL1);
                break;
            case  R.id.flipkart:
                callmethod(URL2);
                break;
            case  R.id.snapdeal:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                //callmethod(URL3);
                break;
            case  R.id.google:
                callmethod(URL4);
                break;
        }
    }

    private void callmethod(String URL) {
        browser.loadUrl(URL);


    }
}