package com.example.rickandmortyapp.models

data class GetCharacters(
    val info : Info,
    val results : List<Character>
)
