package com.example.rickandmortyapp.api

import com.example.rickandmortyapp.models.APIResponse
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    suspend fun getCharacter() : APIResponse

}