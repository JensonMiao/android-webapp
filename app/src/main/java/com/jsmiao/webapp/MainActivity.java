package com.jsmiao.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jsmiao.webapp.controls.MWebView;

public class MainActivity extends AppCompatActivity {
    private MWebView mWebView; // webView 控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取控件
        mWebView = (MWebView) findViewById(R.id.mWebView);
        mWebView.setActivity(this);

        String url;
        // 设置url地址
        url = "https://blog.jsmiao.com";
        // 加载url
        mWebView.loadUrl(url);
    }

    /*
     * 接管返回键
     */
    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}