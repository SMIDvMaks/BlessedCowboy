package com.bdleess.cyoowb.PPPA

import android.content.Context
import android.provider.Settings

class DDDEV {
    var dd = 0
    fun Dev(context: Context):Int{
        val dev = Settings.Secure.getInt(
            context.contentResolver,Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,dd
        )
        return dev
    }
}