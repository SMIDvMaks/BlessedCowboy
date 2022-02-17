package com.bdleess.cyoowb.ADFB

import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.bdleess.cyoowb.PPPA.aciva
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ADD {
    @DelicateCoroutinesApi
    fun Yeyeye(context:Context){
        GlobalScope.launch {
            val getid : AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(context)
            aciva = getid.id
        }
    }
}