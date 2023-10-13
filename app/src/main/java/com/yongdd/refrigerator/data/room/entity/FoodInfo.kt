package com.yongdd.refrigerator.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FoodInfo")
data class FoodInfo (
    @PrimaryKey val id : Int,
    val category : String,
    val subCategory : String?,
    val name : String,
    val userAdded : Boolean = false,

    val cartAddCount : Int, // 장바구니 추가 횟수
    val takeOutRefrigeratorCount : Int, // 냉장고에서 소비한 횟수
    val addRefrigeratorCount : Int // 냉장고에 추가한 횟수
)