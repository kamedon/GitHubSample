package jp.classmethod.githubapp

import android.app.Application
import jp.classmethod.githubapp.di.*
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    NetworkModule.module(),
                        ApiModule.module(),
                        RepositoryModule.module(),
                        ViewModelModule.module(),
                        UseCaseModule.module()
                )
            )
        }
    }

}