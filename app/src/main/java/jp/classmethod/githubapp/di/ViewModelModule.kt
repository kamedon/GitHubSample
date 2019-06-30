package jp.classmethod.githubapp.di

import jp.classmethod.githubapp.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelModule {
    fun module() = module {
        viewModel {
            MainViewModel(get())
        }
    }
}