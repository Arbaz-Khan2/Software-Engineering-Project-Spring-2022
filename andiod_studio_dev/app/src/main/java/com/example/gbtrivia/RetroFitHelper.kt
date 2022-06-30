package com.example.gbtrivia

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface RetroFitHelper {
    companion object
    {
        const val Base_URL = "https://gorest.co.in/public-api/"
        fun getRetrofitObject() : Retrofit {
            val login = HttpLoggingInterceptor()
            login.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder()
            client.addInterceptor(login)
            return Retrofit.Builder()
                .baseUrl(Base_URL)
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}