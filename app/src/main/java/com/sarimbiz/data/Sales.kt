package com.sarimbiz.data

import java.util.Date

data class Sale(
    val id: String,
    val shopkeeperId: String,
    val salesmanId: String,
    val items: List<Item>,
    val totalAmount: Double,
    val amountPaid: Double,
    val date: Date
)

data class Item(
    val id: String,
    val name: String,
    val quantity: Int,
    val price: Double
)

data class Invoice(
    val id: String,
    val saleId: String,
    val date: Date
)
