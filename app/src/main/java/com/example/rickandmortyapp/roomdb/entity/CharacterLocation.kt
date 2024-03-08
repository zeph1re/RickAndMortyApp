package com.example.rickandmortyapp.roomdb.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.rickandmortyapp.models.Character
import com.example.rickandmortyapp.models.Location

@Entity(tableName = "character_location")
data class CharacterLocation (
    @PrimaryKey(autoGenerate = true) val id : Int,
    val character: Character,
    val location: Location
)