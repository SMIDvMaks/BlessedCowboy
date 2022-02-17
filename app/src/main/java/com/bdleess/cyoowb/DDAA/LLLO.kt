package com.bdleess.cyoowb.DDAA

import com.bdleess.cyoowb.papapa
import kotlinx.coroutines.DelicateCoroutinesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory


val anderson = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvZjllNzdjZTllNWY2Y2JiNDRkNzI5OTMzZjc0NGI5YzAvcmF3L0JsZXNzZWQlMjUyMENvd2JveS8="
var reperes: String? = null
var reperes2: String? = null
var reperes3: String? = null
@DelicateCoroutinesApi
class LLLO {
    val recruter = Retrofit.Builder()
        .baseUrl(papapa.Height(anderson))
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    suspend fun DD() {
        val getDDD: DDD = recruter.create(DDD::class.java)
        val bobik = getDDD.Tostere().body()
        val REPERESS = bobik!!.split("|").toTypedArray()
        reperes = REPERESS[0]
        reperes2 = REPERESS[1]
        reperes3 = REPERESS[2]
    }
}