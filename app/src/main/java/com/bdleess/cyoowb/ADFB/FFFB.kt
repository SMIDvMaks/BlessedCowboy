package com.bdleess.cyoowb.ADFB

import android.app.Activity
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.bdleess.cyoowb.PPPA.firocika
import kotlinx.coroutines.DelicateCoroutinesApi

@DelicateCoroutinesApi
class FFFB {
    fun startFB(uyo:String, pesik: Context):String?{
        FacebookSdk.setApplicationId(uyo)
        FacebookSdk.sdkInitialize(pesik)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        AppLinkData.fetchDeferredAppLinkData(pesik) { deperes ->
            var tetrasa = deperes
            if (tetrasa == null) {
                tetrasa = AppLinkData.createFromActivity(pesik as Activity?)
            }
            if (tetrasa != null) {
                val jojo = tetrasa.targetUri
                val toto = jojo?.query
                firocika = com.bdleess.cyoowb.papapa.Yeti(toto.toString())
            } else { }
        }
        return firocika
    }
}