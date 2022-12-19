package com.example.appstructure.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstructure.util.TextUtils
import com.example.appstructure.R
import com.example.appstructure.application.StructureApplication
import com.example.appstructure.model.Order
import com.example.appstructure.util.DateUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Order Detail"
        displayOrderDetail((application as StructureApplication).order)
    }
    private fun displayOrderDetail(order:Order) {
        discount_view.text = TextUtils.formatPercent(order.discount)
        orderDate_view.text = DateUtils.formatDate(order.orderDate)
        price_view.text = TextUtils.formatCurrency(order.price)
        tax_view.text = TextUtils.formatCurrency(order.tax)
        customerFirstName_view.text = TextUtils.formatCustomerName(order.customerFirstName,order.custumerLastName)
    }
}