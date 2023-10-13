package com.yongdd.refrigerator.data.firestore

sealed class FirestoreResponse<out T> {
    class Success<T>(
        val data: T
    ) :FirestoreResponse<T>()
    class Fail<T>(
        val error: Throwable
    ) :FirestoreResponse<Nothing>()
}