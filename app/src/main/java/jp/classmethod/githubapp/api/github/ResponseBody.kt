package jp.classmethod.githubapp.api.github

import androidx.annotation.Keep

@Keep
data class UserResponseBody(val id: String, val reposUrl: String, val createdAt: String)

@Keep
data class HogeResponseBody(val foo: String)
