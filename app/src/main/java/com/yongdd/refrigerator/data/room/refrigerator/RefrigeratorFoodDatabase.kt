package com.yongdd.refrigerator.data.room.refrigerator

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RefrigeratorFoodDatabase::class], version = 1, exportSchema = false)
abstract class RefrigeratorFoodDatabase : RoomDatabase() {
    abstract fun refrigeratorFoodDao() : RefrigeratorFoodDao

    companion object {
        const val DATABASE_NAME = "RefrigeratorFoods.db"
    }
}