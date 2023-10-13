package com.yongdd.refrigerator.data.room.refrigerator

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yongdd.refrigerator.data.room.entity.RefrigeratorFood

@Dao
interface RefrigeratorFoodDao {

    // 추가
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFood(refrigeratorItem: RefrigeratorFood)

    // 삭제
    @Query("DELETE FROM RefrigeratorFoods WHERE id = :id")
    fun deleteFood(id:Long)

    // 전체 리스트
    @Query("SELECT * FROM RefrigeratorFoods")
    fun getAllFoods() : List<RefrigeratorFood>

    // 냉장 or 냉동
    @Query("SELECT * FROM RefrigeratorFoods WHERE isFrozenFood = :isFrozenFood")
    fun getRefrigeratedOrFrozenFoods(isFrozenFood:Boolean) : List<RefrigeratorFood>

    // 카테고리별
    @Query("SELECT * FROM RefrigeratorFoods WHERE category = :category")
    fun getFoodsByCategory(category:String) : List<RefrigeratorFood>

}