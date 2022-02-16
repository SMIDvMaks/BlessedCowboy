package com.bdleess.cyoowb

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.DelicateCoroutinesApi

@SuppressLint("StaticFieldLeak")
@DelicateCoroutinesApi
var w2 = BC2()

@DelicateCoroutinesApi
class WWB : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    fun startWEB(webView: WebView) {
        krop.visibility = View.VISIBLE
        webView.settings.apply {
            setAppCacheEnabled(true)
            allowFileAccessFromFileURLs = true
            saveFormData = true
            mixedContentMode = 0
            savePassword = true
            allowContentAccess = true
            setRenderPriority(WebSettings.RenderPriority.HIGH)
            setEnableSmoothTransition(true)
            loadsImagesAutomatically = true
            allowUniversalAccessFromFileURLs = true
            databaseEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            javaScriptCanOpenWindowsAutomatically = true
            domStorageEnabled = true
            allowFileAccess = true
            javaScriptEnabled = true
        }
     //   webView.webViewClient = w2.webVV
        webView.webChromeClient = w2.webViewCH

    }
}