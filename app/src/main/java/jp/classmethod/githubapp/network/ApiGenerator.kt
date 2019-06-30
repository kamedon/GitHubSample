package jp.classmethod.githubapp.network

import retrofit2.Retrofit
import kotlin.reflect.KClass

class ApiGenerator(val builder: Retrofit.Builder) {

    fun <T> api(clazz: Class<T>) = builder.baseUrl("https://api.github.com/").build().create(clazz)

}