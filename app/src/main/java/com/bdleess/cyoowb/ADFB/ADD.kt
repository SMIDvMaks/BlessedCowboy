package com.bdleess.cyoowb.ADFB

import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.bdleess.cyoowb.PPPA.adverID
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ADD {
    @DelicateCoroutinesApi
    fun getAdvertId(context:Context){
        GlobalScope.launch {
            val getid : AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(context)
            adverID = getid.id
            Log.e("TAG","AdvertID: $adverID")
        }
    }
}