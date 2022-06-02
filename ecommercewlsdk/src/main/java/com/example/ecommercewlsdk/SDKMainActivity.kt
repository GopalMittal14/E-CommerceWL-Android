package com.example.ecommercewlsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SDKMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun showMessage() {
       Toast.makeText(this,"E-Commerce SDK",Toast.LENGTH_SHORT).show()
    }
}