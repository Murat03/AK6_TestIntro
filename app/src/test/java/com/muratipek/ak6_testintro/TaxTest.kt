package com.muratipek.ak6_testintro

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TaxTest {
    fun calculateTaxTest(){
        val tax = Tax()
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }
    @Test
    fun calculateIncomeTest(){
        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}