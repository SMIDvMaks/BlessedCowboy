package com.bdleess.cyoowb.GGG

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.bdleess.cyoowb.R
import com.bdleess.cyoowb.papapa
import kotlinx.android.synthetic.main.activity_stgaa.*
import kotlinx.coroutines.DelicateCoroutinesApi

@DelicateCoroutinesApi
class STGAA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stgaa)
        window.addFlags(1024)
        kiiq.visibility = WebView.VISIBLE
        kiiq.loadUrl(papapa.Height("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49TjdwZFUwSGdYbjB4RUVHTlBqdzR6SDRrcVJHUVptTTg="))
    }

}