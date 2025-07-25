package com.sarimbiz.data

sealed class User {
    data class Admin(val id: String, val name: String) : User()
    data class Salesman(val id: String, val name: String) : User()
    data class GodownManager(val id: String, val name: String) : User()
    data class Shopkeeper(val id: String, val name: String) : User()
}
