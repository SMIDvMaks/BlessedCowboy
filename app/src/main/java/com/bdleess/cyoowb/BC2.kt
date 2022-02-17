package com.bdleess.cyoowb

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
import com.bdleess.cyoowb.DDAA.reperes3
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
lateinit var poncika: ProgressBar

var parur: String? = null
var ppinge: String = "a2dBbUpqQ0xIcE5ZWEtacjh2dVhIQw=="

@DelicateCoroutinesApi
class BC2 : AppCompatActivity() {
    private var CallAr: ValueCallback<Array<Uri>>? = null
    private var rtyq = 100
    var Dd = DDDEV()
    var ad = ADD()
    var ll = LLLO()
    var ffb = FFFB()
    var apicaca: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(1024)
        krop = findViewById(R.id.kroy)
        poncika = findViewById(R.id.progressBar)
        val septik = getSharedPreferences(packageName, MODE_PRIVATE).getString("LovkoTu", null)
        relo = AppsFlyerLib.getInstance ().getAppsFlyerUID(this@BC2)
        val kkkind = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(byblik: MutableMap<String, Any>) {
                for (ipsa in byblik.keys)
                    apicaca =
                        Objects.requireNonNull(byblik[papapa.Height("YWZfc3RhdHVz")]).toString()
                if (apicaca == papapa.Height("Tm9uLW9yZ2FuaWM=")) {
                    val laylo =
                        Objects.requireNonNull(byblik[papapa.Height("Y2FtcGFpZ24=")]).toString()
                    parur = papapa.Yeti(laylo)
                }
            }
            override fun onConversionDataFail(p078: String?) {}
            override fun onAppOpenAttribution(p0484: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p04343: String?) {}
        }
        AppsFlyerLib.getInstance().run {
            init(papapa.Height(ppinge), kkkind, this@BC2)
            start(this@BC2)
        }
        ad.Yeyeye(this)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(papapa.Height(operol))


        krop.webViewClient = object : WebViewClient() {
            override fun onPageStarted(inne: WebView?, krend: String?, chempik: Bitmap?) {
                super.onPageStarted(inne, krend, chempik)
                if (krend?.contains(papapa.Height("NDA0")) == true) {
                    val ipet = Intent(this@BC2, STActivity::class.java)
                    startActivity(ipet)
                    finish()
                }
                poncika.visibility = View.INVISIBLE
            }

            override fun onPageFinished(yuq: WebView?, ow: String?) {
                super.onPageFinished(yuq, ow)
                getSharedPreferences(packageName, MODE_PRIVATE).edit().putString("LovkoTu", ow)
                    .apply()
            }
        }
        krop.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                kicha: WebView?,
                cara: ValueCallback<Array<Uri>>?,
                tara: FileChooserParams?
            ): Boolean {
                if (CallAr != null) {
                    CallAr!!.onReceiveValue(null)
                    CallAr = null
                }
                CallAr = cara
                try {
                    startActivityForResult(tara!!.createIntent(), rtyq)
                } catch (e: ActivityNotFoundException) {
                    CallAr = null
                    return false
                }
                return true
            }
        }
        if (Dd.RANGE(this) == 0) {
            GlobalScope.launch {
                ll.DD()
                ffb.startFB(reperes3!!, this@BC2)
                if (septik != null) {
                    runOnUiThread(Runnable {
                        wwb.startWEB(kroy)
                        kroy.loadUrl(septik.toString())
                    })
                } else {
                    Handler(Looper.getMainLooper()).postDelayed({
                        papapa.geHA(this@BC2,apicaca.toString())
                    }, 5000)
                }
            }
        } else {
            val igravo = Intent(this, STActivity::class.java)
            startActivity(igravo)
        }
    }
    override fun onActivityResult(tosik: Int, toxic: Int, tende: Intent?) {
        super.onActivityResult(tosik, toxic, tende)
        if (tosik == rtyq) {
            if (CallAr == null) return
            CallAr!!.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(toxic, tende))
            CallAr = null
        }
    }
    override fun onKeyDown(chike: Int, epea: KeyEvent): Boolean {
        if (epea.action == KeyEvent.ACTION_DOWN) {
            if (chike == KeyEvent.KEYCODE_BACK) {
                if (kroy.canGoBack()) {
                    kroy.goBack()
                }
                return true
            }
        }
        return super.onKeyDown(chike, epea)
    }


}