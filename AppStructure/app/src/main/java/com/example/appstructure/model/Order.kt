package com.example.appstructure.model

import java.util.Date

class Order (
    val orderDate: Date = Date(),
    val price:Double = 123.45,
    val tax: Double = price * 0.085,
    val discount: Double = .10,
    val customerFirstName: String = "Clark",
    val custumerLastName: String = "Kent"
        )