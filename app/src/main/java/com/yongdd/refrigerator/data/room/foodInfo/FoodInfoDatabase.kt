package com.yongdd.refrigerator.data.room.foodInfo

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yongdd.refrigerator.data.room.entity.FoodInfo

@Database(entities = [FoodInfo::class], version = 1, exportSchema = false)
abstract class FoodInfoDatabase : RoomDatabase() {
    abstract fun foodInfoDao() : FoodInfoDao

    companion object {
        const val DATABASE_NAME = "foodInfo.db"
    }
}