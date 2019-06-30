package jp.classmethod.githubapp.usecase

import jp.classmethod.githubapp.repository.IGitHubRepository
import jp.classmethod.githubapp.ui.main.UserPresentModel

interface IGitHubUseCase {
    suspend fun user(name: String): UserPresentModel
}

class GitHubUseCase(private val repository: IGitHubRepository) : IGitHubUseCase {

    override suspend fun user(name: String): UserPresentModel {
        val response = repository.user(name)
        return if (response != null) {
            UserPresentModel(response.id, response.reposUrl)
        } else {
            UserPresentModel.NONE
        }
    }


}