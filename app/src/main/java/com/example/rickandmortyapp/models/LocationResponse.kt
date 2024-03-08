package com.example.rickandmortyapp.models

data class LocationResponse(
    val info : Info,
    val results : List<Location>
)
