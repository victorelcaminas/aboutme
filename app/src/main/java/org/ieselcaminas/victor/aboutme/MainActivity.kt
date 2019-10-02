package org.ieselcaminas.victor.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Customer(val id: Long, val name: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var customer = Customer(1, "Schin")
        var customer2 = customer.copy(name = "fffffff")

    }
}
