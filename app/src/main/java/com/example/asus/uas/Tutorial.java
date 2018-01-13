package com.example.asus.uas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Tutorial extends AppCompatActivity {
    Button Link;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        Link = (Button) findViewById(R.id.link);
        text = (EditText) findViewById(R.id.edit_text);
        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = text.getText().toString();
                WebView URL = (WebView) findViewById(R.id.webview);
                URL.setWebViewClient(new WebViewClient());
                URL.loadUrl(s);
            }
        });
    }
}
