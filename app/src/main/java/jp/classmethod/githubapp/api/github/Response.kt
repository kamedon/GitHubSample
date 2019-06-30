package jp.classmethod.githubapp.api.github

import androidx.annotation.Keep

@Keep
data class UserResponse(val id: String, val reposUrl: String, val createdAt: String)

