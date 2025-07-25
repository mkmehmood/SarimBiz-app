package com.sarimbiz.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User.Admin::class, User.Salesman::class, User.GodownManager::class, User.Shopkeeper::class, Store::class, Godown::class, Sale::class, Item::class, Invoice::class, DailyLedger::class, Transaction::class, MonthlySummary::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    // TODO: Add DAOs here
}
