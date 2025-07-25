package com.sarimbiz.data

data class Store(
    val id: String,
    val name: String,
    val address: String,
    val location: String // GPS coordinates
)

data class Godown(
    val id: String,
    val name: String,
    val address: String,
    val location: String // GPS coordinates
)
