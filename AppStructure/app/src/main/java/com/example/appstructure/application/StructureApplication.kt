package com.example.appstructure.application

import android.app.Application
import com.example.appstructure.model.Order

class StructureApplication: Application() {
    val order = Order()
    override fun onCreate() {
        super.onCreate()
    }
}