package com.bdleess.cyoowb.GGG

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.bdleess.cyoowb.R
import kotlinx.android.synthetic.main.activity_stgaa.*

class STGAA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stgaa)
        window.addFlags(1024)
        kiiq.visibility = WebView.VISIBLE
        kiiq.loadUrl("https://www.privacypolicyonline.com/live.php?token=N7pdU0HgXn0xEEGNPjw4zH4kqRGQZmM8")
    }
}