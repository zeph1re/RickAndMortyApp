package com.example.rickandmortyapp.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rickandmortyapp.roomdb.entity.CharacterLocation


@Database (entities = [CharacterLocation::class], version = 1, exportSchema = true)

abstract class CharacterLocationDB : RoomDatabase() {

    abstract fun characterlocationDao(): CharacterLocationDAO


    companion object {
        private const val DB_NAME = "characterlocation_database.db"
        @Volatile private var instance: CharacterLocationDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            CharacterLocationDB::class.java,
            DB_NAME
        ).build()
    }

}