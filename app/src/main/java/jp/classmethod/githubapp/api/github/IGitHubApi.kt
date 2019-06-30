package jp.classmethod.githubapp.api.github

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface IGitHubApi {
    @GET("users/{name}")
    suspend fun user(@Path("name") name: String): UserResponseBody?

    @POST("hoge")
    suspend fun hoge(@Body data: HogeRequestBody): HogeResponseBody

}

