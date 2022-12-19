package com.example.appstructure.util

import java.text.NumberFormat

object TextUtils {
    fun formatCustomerName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }

    fun formatCurrency(price: Double): String {
        return NumberFormat.getCurrencyInstance().format(price)
    }

    fun formatPercent(discount: Double): String {
        return "${NumberFormat.getPercentInstance().format(discount)} discount"
    }
}