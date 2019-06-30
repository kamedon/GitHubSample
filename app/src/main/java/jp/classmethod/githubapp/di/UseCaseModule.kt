package jp.classmethod.githubapp.di

import jp.classmethod.githubapp.ui.main.GitHubUseCase
import jp.classmethod.githubapp.ui.main.IGitHubUseCase
import org.koin.dsl.module

object UseCaseModule {
    fun module() = module {
        factory<IGitHubUseCase> {
            GitHubUseCase(get())
        }
    }
}