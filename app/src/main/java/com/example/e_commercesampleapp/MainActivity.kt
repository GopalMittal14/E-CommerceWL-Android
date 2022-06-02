package com.example.e_commercesampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.ShowToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShowToast().showToast(this,"I am in sdk")
    }
}