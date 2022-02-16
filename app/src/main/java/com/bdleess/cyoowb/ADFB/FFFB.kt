package com.bdleess.cyoowb.ADFB

import android.app.Activity
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.bdleess.cyoowb.PPPA.fbData

class FFFB {
    fun startFB(id:String,context: Context):String?{
        FacebookSdk.setApplicationId(id)
        FacebookSdk.sdkInitialize(context)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        AppLinkData.fetchDeferredAppLinkData(context) { appLinkData ->
            var apicheq = appLinkData
            if (apicheq == null) {
                apicheq = AppLinkData.createFromActivity(context as Activity?)
            }
            if (apicheq != null) {
                val uejq = apicheq.targetUri
                val webaiq = uejq?.query
                fbData = com.bdleess.cyoowb.papapa.ParseLine(webaiq.toString())
            } else { }
        }
        return fbData
    }
}