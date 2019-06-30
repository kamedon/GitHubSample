package jp.classmethod.githubapp.repository

import jp.classmethod.githubapp.api.github.IGitHubApi
import jp.classmethod.githubapp.api.github.UserResponseBody

interface IGitHubRepository {
    suspend fun user(name: String): UserResponseBody?
}

class GitHubRepository(private val api: IGitHubApi) : IGitHubRepository {

    override suspend fun user(name: String): UserResponseBody? {
        return api.user(name)
    }

}
