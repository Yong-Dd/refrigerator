package com.yongdd.refrigerator.features.common.data.request

import com.google.firebase.firestore.FirebaseFirestore
import com.yongdd.refrigerator.features.common.data.model.Food
import com.yongdd.refrigerator.data.firestore.FirestoreResponse
import com.yongdd.refrigerator.data.firestore.FirestoreResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FirestoreRequest(
    private val db : FirebaseFirestore
) : IFirestoreRequest {
    override suspend fun getVegetables(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("vegetables")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getVegetables failed"))
                        )
                    }
                )
            }
    }


    override suspend fun getSeaFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("seafood")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getSeaFoods failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getFreshFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("freshFood")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getFreshFoods failed "))
                        )
                    }
                )
            }
    }

    override suspend fun getFrozenFoods(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("frozenFood")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getFrozenFoods failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getFruits(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("fruits")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getFruits failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getGrainNuts(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("grainNuts")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getGrainNuts failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getMeats(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("meat")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getMeats failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getRefrigeratedFood(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("refrigeratedFood")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getRefrigeratedFood failed"))
                        )
                    }
                )
            }
    }

    override suspend fun getRoomTemperatureFood(result: (Flow<FirestoreResult<MutableList<Food>>>) -> Unit) {
        db.collection("roomTemperatureFood")
            .get()
            .addOnSuccessListener { list ->
                val resultList = mutableListOf<Food>()

                for (food in list.documents) {
                    val item = food.toObject(Food::class.java)
                    item?.let { resultList.add(it) }
                }

                result(
                    flow{
                        FirestoreResult(
                            response = FirestoreResponse.Success(resultList)
                        )
                    }
                )
            }
            .addOnFailureListener {
                result(
                    flow {
                        FirestoreResult(
                            response = FirestoreResponse.Fail<Throwable>(Throwable("getRoomTemperatureFood failed"))
                        )
                    }
                )
            }
    }

}