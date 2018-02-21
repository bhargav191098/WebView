package com.example.webcrawl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //WebView myWebView;
        WebView browser = (WebView) findViewById(R.id.webView);
        //myWebView.loadUrl("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=nESMWsuzB6mdX9Lfp-gO");
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("http://www.guindytimes.com/articles/simplifying-engineering-an-interview-with-lmes");
    }
}
