package com.kyotobytes.iubca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Library extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        setter();
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                if(url.endsWith(".pdf")){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                }
                return false;
            }
        });
        webView.loadUrl("https://lib.iub.edu.bd/");
        Toast.makeText(this, "Please zoom in/out to navigate to your desired destination. Since the page obviously does not have a phone view. :3", Toast.LENGTH_LONG).show();
    }

    private void setter() {
        webView=findViewById(R.id.libraryWebsite_id);
        webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setUseWideViewPort(true);
        webView.setInitialScale(1);
        webView.setWebViewClient(new WebViewClient());
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