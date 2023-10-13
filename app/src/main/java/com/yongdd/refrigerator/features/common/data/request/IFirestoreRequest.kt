package com.yongdd.refrigerator.features.common.data.request

import com.yongdd.refrigerator.features.common.data.model.Food
import com.yongdd.refrigerator.data.firestore.FirestoreResult
import kotlinx.coroutines.flow.Flow

interface IFirestoreRequest {
    suspend fun getVegetables(result :(Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getSeaFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getFreshFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getFrozenFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getFruits(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getGrainNuts(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getMeats(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getRefrigeratedFood(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
    suspend fun getRoomTemperatureFood(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit)
}