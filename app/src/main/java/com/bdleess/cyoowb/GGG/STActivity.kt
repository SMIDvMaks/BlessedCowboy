package com.bdleess.cyoowb.GGG

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bdleess.cyoowb.R
import kotlinx.android.synthetic.main.activity_stactivity.*

class STActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stactivity)
        window.addFlags(1024)
        stG.setOnClickListener {
           val ipq = Intent(this,GAA::class.java)
            startActivity(ipq)
        }
        PRS.setOnClickListener {
            val oqoo = Intent(this,STGAA::class.java)
            startActivity(oqoo)
        }
        EXG.setOnClickListener {
              finishAffinity()
        }
    }
}