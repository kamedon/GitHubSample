package jp.classmethod.githubapp.di

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import jp.classmethod.githubapp.network.ApiGenerator
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    fun module() = module {

        single {
            GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create()
        }

        single<Converter.Factory> {
            GsonConverterFactory.create(get())
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
