package com.yongdd.refrigerator.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "RefrigeratorFoods")
data class RefrigeratorFood(
    @PrimaryKey val id : Long,
    val category : String,
    val subCategory : String?,
    val name : String,
    val nickName : String,
    val count : Int,
    val isFrozenFood : Boolean,
    val validDate : String,
    val dateAdded : String
)