package com.yongdd.refrigerator.data.room.cart

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yongdd.refrigerator.data.room.entity.CartItem
import com.yongdd.refrigerator.data.room.entity.FoodInfo

@Database(entities = [CartItem::class], version = 1, exportSchema = false)
abstract class CartDatabase : RoomDatabase() {
    abstract fun cartDao() : CartDao

    companion object {
        const val DATABASE_NAME = "cart.db"
    }
}