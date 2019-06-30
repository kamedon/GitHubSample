package jp.classmethod.githubapp.di

import jp.classmethod.githubapp.usecase.GitHubUseCase
import jp.classmethod.githubapp.usecase.IGitHubUseCase
import org.koin.dsl.module

object UseCaseModule {
    fun module() = module {
        factory<IGitHubUseCase> {
            GitHubUseCase(get())
        }
    }
}