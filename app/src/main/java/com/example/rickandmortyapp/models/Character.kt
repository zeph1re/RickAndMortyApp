package com.example.rickandmortyapp.models

data class Character(
    val id : Int,
    val name : String,
    val status : String,
    val species : String,
    val gender : String,
    val imageUrl: String,
    val created : String,
    val episode : Episode,
    val location : Location,
    val origin : Location
)
