package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class GoogleMaps extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);
        webView=findViewById(R.id.maps);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webView.setInitialScale(2);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.google.com/maps/place/Independent+University,+Bangladesh/@23.8155093,90.4253548,17z/data=!3m1!4b1!4m5!3m4!1s0x3755c64be6744a57:0xeacead51ebe2bf60!8m2!3d23.8155044!4d90.4275435");
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}