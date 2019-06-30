package jp.classmethod.githubapp.di

import com.squareup.moshi.Moshi
import jp.classmethod.githubapp.network.ApiGenerator
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkModule {
    fun module() = module {

        single {
            Moshi.Builder().build()
        }

        single<Converter.Factory> {
            MoshiConverterFactory.create(get())
        }

        single {
            OkHttpClient.Builder().build()
        }

        single {
            Retrofit.Builder()
                .addConverterFactory(get())
                .client(get())
        }

        single {
            ApiGenerator(get())
        }


    }
}
