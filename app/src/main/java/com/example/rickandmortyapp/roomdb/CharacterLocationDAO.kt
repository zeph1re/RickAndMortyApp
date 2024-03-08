package com.example.rickandmortyapp.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rickandmortyapp.models.Character
import com.example.rickandmortyapp.roomdb.entity.CharacterLocation

@Dao
interface CharacterLocationDAO {

    @Insert
    suspend fun insertData(data: CharacterLocation)

    @Query("SELECT * FROM character_location ")
    fun getAllData() : List<CharacterLocation>
}