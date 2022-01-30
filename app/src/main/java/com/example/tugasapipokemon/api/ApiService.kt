package com.example.tugasapipokemon.api

import com.example.tugasapipokemon.model.ResponsePokemon
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("cards")
    fun getPokemon() : Call<ResponsePokemon>
}