package com.sarimbiz.data

import java.util.Date

data class DailyLedger(
    val date: Date,
    val transactions: List<Transaction>
)

data class Transaction(
    val id: String,
    val type: String, // e.g., "sale", "return", "payment"
    val amount: Double
)

data class MonthlySummary(
    val month: Int,
    val year: Int,
    val totalSales: Double,
    val totalPayments: Double,
    val totalReturns: Double
)
