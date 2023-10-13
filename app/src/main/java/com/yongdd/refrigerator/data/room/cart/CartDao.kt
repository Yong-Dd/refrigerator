package com.yongdd.refrigerator.data.room.cart

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yongdd.refrigerator.data.room.entity.CartItem

@Dao
interface CartDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFoodInfo(cartItem: CartItem)

    @Query("SELECT * FROM CartItem")
    fun getCartList() : List<CartItem>

}