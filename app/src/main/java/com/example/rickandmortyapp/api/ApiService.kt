package com.example.rickandmortyapp.api

import com.example.rickandmortyapp.models.CharacterResponse
import com.example.rickandmortyapp.models.Character
import com.example.rickandmortyapp.models.LocationResponse
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    suspend fun getCharacter() : CharacterResponse

    @GET("character/{id}")
    suspend fun getCharacterById(id:Int) : Character

    @GET ("location")
    suspend fun getAllLocation() : LocationResponse

}