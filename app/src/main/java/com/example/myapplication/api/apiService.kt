package com.example.myapplication.api

import com.example.myapplication.ResponseMorty
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET

interface apiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>


}