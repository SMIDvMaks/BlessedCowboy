package com.bdleess.cyoowb.DDAA

import retrofit2.Response
import retrofit2.http.GET

interface DDD {
    @GET("https://gist.githubusercontent.com/SMIDvMaks/f9e77ce9e5f6cbb44d729933f744b9c0/raw/Blessed%2520Cowboy/")
    suspend fun downloadUR():Response<String>

}