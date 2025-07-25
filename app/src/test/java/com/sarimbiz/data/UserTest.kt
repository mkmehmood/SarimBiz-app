package com.sarimbiz.data

import org.junit.Test
import org.junit.Assert.*

class UserTest {
    @Test
    fun adminUser_isCorrect() {
        val admin = User.Admin("1", "Admin")
        assertEquals("1", admin.id)
        assertEquals("Admin", admin.name)
    }

    @Test
    fun salesmanUser_isCorrect() {
        val salesman = User.Salesman("2", "Salesman")
        assertEquals("2", salesman.id)
        assertEquals("Salesman", salesman.name)
    }

    @Test
    fun godownManagerUser_isCorrect() {
        val godownManager = User.GodownManager("3", "Godown Manager")
        assertEquals("3", godownManager.id)
        assertEquals("Godown Manager", godownManager.name)
    }

    @Test
    fun shopkeeperUser_isCorrect() {
        val shopkeeper = User.Shopkeeper("4", "Shopkeeper")
        assertEquals("4", shopkeeper.id)
        assertEquals("Shopkeeper", shopkeeper.name)
    }
}
