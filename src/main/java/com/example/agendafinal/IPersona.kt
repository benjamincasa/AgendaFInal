package com.example.agendafinal

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface IPersona {
    @GET("wsLeer.php")
    fun getListaPersonas(): Call<List<Persona>>
    @POST("agrega.php")
    fun agregarPersona(@Body persona: Persona): Call<Resultado>
}