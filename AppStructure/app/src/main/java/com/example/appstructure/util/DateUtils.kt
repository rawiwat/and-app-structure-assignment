package com.example.appstructure.util

import java.text.SimpleDateFormat
import java.util.*

fun formatdate(date: Date): String{
    val format = SimpleDateFormat("dd/MM/yyyy")
    return format.format(date)
}