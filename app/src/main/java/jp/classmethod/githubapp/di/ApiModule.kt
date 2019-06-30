package jp.classmethod.githubapp.di

import jp.classmethod.githubapp.api.github.IGitHubApi
import jp.classmethod.githubapp.network.ApiGenerator
import org.koin.dsl.module

object ApiModule {
    fun module() = module {
        single {
            get<ApiGenerator>().api(IGitHubApi::class.java)
        }
    }
}
