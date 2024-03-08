package com.example.rickandmortyapp.models

import androidx.resourceinspection.annotation.Attribute.IntMap

data class Location(
    val created : String,
    val dimension : String,
    val id : Int,
    val name : String,
    val resident : Character,
    val type : String
)
