package com.example.agendafinal
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class Retrofit {
    companion object{
        fun getRetrofit():retrofit2.Retrofit{
            val retrofit = Retrofit.Builder().baseUrl("http://187.217.234.227/7mo/crud/")
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit
        }
    }
}
