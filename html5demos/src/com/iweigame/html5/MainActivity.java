package com.iweigame.html5;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	
	  WebView myWebView ;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Log.v("tag", ">>>>>>>getUserAgentString is :"+ webSettings.getUserAgentString());
        webSettings.setUserAgent(0);
        webSettings.setBuiltInZoomControls(true); //显示放大缩小 controler
        webSettings.setSupportZoom(true); //可以缩放
        webSettings.setDefaultZoom(ZoomDensity.CLOSE);//默认缩放模式 是 ZoomDensity.MEDIUM
//        myWebView.loadUrl("http://www.html5test.com/");
        myWebView.loadUrl("file:///android_asset/myhtml5.html"); 
//        myWebView.loadUrl("file:///android_asset/index.html"); 
    }
}