package com.yongdd.refrigerator.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CartItem")
data class CartItem (
    val category : String,
    val subCategory : String?,
    val name : String,
    val foodInfoId : Int
) {
    @PrimaryKey(autoGenerate = true) val id : Int = 0
}