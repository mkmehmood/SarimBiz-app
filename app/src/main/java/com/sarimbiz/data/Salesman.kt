package com.sarimbiz.data

data class Salesman(
    val id: String,
    val name: String,
    val username: String,
    val dailyStockQuota: Int,
    val assignedShopkeepers: List<String>
)
