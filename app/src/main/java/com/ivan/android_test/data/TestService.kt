package com.ivan.android_test.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface TestService {

    @GET("users?")
    fun getUser(
        @Query("since") since: Int
    ) : Single<TestResponse>
}
