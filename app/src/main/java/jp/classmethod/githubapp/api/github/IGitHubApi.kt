package jp.classmethod.githubapp.api.github

import retrofit2.http.GET
import retrofit2.http.Path

interface IGitHubApi {
    @GET("users/{name}")
    suspend fun user(@Path("name") name: String): UserResponse?
}

