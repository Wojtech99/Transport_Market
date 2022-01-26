package com.example.transportmarket

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        //pokazanie toolbara
        val toolbarInWebView: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarInDetail)
        setSupportActionBar(toolbarInWebView)
        supportActionBar?.apply {
            title = "OTOMOTO"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        // zamknięcie toolbara
        toolbarInWebView.setNavigationOnClickListener {
            finish()
        }

        val url = getString(R.string.addressUrl)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(url)
    }
}