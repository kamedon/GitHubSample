package jp.classmethod.githubapp.repository

import jp.classmethod.githubapp.api.github.IGitHubApi
import jp.classmethod.githubapp.api.github.UserResponse

interface IGitHubRepository {
    suspend fun user(name: String): UserResponse?
}

class GitHubRepository(private val api: IGitHubApi) : IGitHubRepository {

    override suspend fun user(name: String): UserResponse? {
        return api.user(name)
    }

}
