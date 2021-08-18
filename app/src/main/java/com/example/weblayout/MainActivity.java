package com.example.weblayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    Button youtube,facebook,wschool,qau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtube=findViewById(R.id.youtube);
        facebook=findViewById(R.id.facebook);
        wschool=findViewById(R.id.w3school);
        qau=findViewById(R.id.qau_cs);
        webview=findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        final int color=Color.parseColor("#66b3ff");
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("https://www.youtube.com/");
                facebook.setBackgroundColor(color);
                wschool.setBackgroundColor(color);
                qau.setBackgroundColor(color);
                youtube.setBackgroundColor(Color.RED);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("https://www.facebook.com/");
                youtube.setBackgroundColor(color);
                wschool.setBackgroundColor(color);
                qau.setBackgroundColor(color);
                facebook.setBackgroundColor(Color.RED);
            }
        });

        wschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("https://www.w3schools.com/");
                facebook.setBackgroundColor(color);
                youtube.setBackgroundColor(color);
                qau.setBackgroundColor(color);
                wschool.setBackgroundColor(Color.RED);
            }
        });

        qau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("https://cs.qau.edu.pk/");
                facebook.setBackgroundColor(color);
                wschool.setBackgroundColor(color);
                youtube.setBackgroundColor(color);
                qau.setBackgroundColor(Color.RED);
            }
        });
    }
}
