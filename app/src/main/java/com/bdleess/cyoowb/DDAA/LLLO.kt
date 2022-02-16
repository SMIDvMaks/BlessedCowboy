package com.bdleess.cyoowb.DDAA

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory


val ur = "https://gist.githubusercontent.com/SMIDvMaks/f9e77ce9e5f6cbb44d729933f744b9c0/raw/Blessed%2520Cowboy/"
var link: String? = null
var KeyGist: String? = null
var FbIF: String? = null

//var rrr = RRR()


class LLLO {
    val retro = Retrofit.Builder()
        .baseUrl(ur)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    suspend fun DD() {
        val getDDD: DDD = retro.create(DDD::class.java)
        val body = getDDD.downloadUR().body()
        val ArrayGist = body!!.split("|").toTypedArray()
        link = ArrayGist[0]
        KeyGist = ArrayGist[1]
        FbIF = ArrayGist[2]
        Log.e("TAG","$link")
        Log.e("TAG","$KeyGist")
        Log.e("TAG","$FbIF")
    }
}