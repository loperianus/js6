package com.example.myapplication.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object apiConfig {
    const val baseUrl = "https://rickandmortyapi.com/api/"

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService() : apiService{
        return getRetrofit().create(apiService::class.java)
    }

}
