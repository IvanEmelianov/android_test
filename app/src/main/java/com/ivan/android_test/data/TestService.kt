package com.ivan.android_test.data

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface TestService {

    @GET("/users")
    fun getUsers(
        @Query("since") since: Int,
        appid: String
    ): Single<Users>

    @GET
    fun getUserImg(@Url url: String): Single<ResponseBody>

}