package com.yongdd.refrigerator.data.room.foodInfo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yongdd.refrigerator.data.room.entity.FoodInfo
import com.yongdd.refrigerator.data.room.entity.RefrigeratorFood

@Dao
interface FoodInfoDao {

    // 추가
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFoodInfo(foodInfo: FoodInfo)

    // 모든 식품들
    @Query("SELECT * FROM FoodInfo")
    fun getAllFoodInfo() : List<FoodInfo>

    // 카테고리별
    @Query("SELECT * FROM FoodInfo WHERE category = :category")
    fun getFoodInfoByCategory(category:String) : List<RefrigeratorFood>

    // 장바구니 추가 횟수 추가
    @Query("UPDATE FoodInfo SET cartAddCount = :cartCount WHERE id = :id")
    fun addCartCount(id:Int, cartCount:Int)

    // 장바구니 추가 횟수 상위권
    @Query("SELECT * FROM FoodInfo ORDER BY cartAddCount DESC LIMIT :limit")
    fun getTopCartCount(limit:Int)

    // 냉장고 소비 횟수 추가
    @Query("UPDATE FoodInfo SET takeOutRefrigeratorCount = :takeOutCount WHERE id = :id")
    fun addTakeOutRefrigeratorCount(id:Int, takeOutCount:Int)

    // 냉장고 소비 횟수 상위권
    @Query("SELECT * FROM FoodInfo ORDER BY takeOutRefrigeratorCount DESC LIMIT :limit")
    fun getTopTakeOutRefrigeratorCount(limit:Int)

    // 냉장고 추가 횟수 추가
    @Query("UPDATE FoodInfo SET addRefrigeratorCount = :addCount WHERE id = :id")
    fun addRefrigeratorCount(id:Int, addCount:Int)

    // 냉장고 추가 횟수 상위권
    @Query("SELECT * FROM FoodInfo ORDER BY addRefrigeratorCount DESC LIMIT :limit")
    fun getTopAddRefrigeratorCount(limit:Int)

}