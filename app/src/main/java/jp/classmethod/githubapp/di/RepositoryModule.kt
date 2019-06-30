package jp.classmethod.githubapp.di

import jp.classmethod.githubapp.repository.GitHubRepository
import jp.classmethod.githubapp.repository.IGitHubRepository
import org.koin.dsl.module

object RepositoryModule {
    fun module() = module {
        single<IGitHubRepository> {
            GitHubRepository(get())
        }

    }
}