package com.sarimbiz.data

data class Shopkeeper(
    val id: String,
    val name: String,
    val contactNumber: String,
    val address: String,
    val location: String, // GPS coordinates
    val shopPhotoUrl: String,
    val creditLimit: Double,
    val outstandingDues: Double
)
