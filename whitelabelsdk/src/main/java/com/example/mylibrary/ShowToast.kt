package com.example.mylibrary
import android.app.Activity
import android.widget.Toast
class ShowToast {

    fun showToast(context:Activity,message: String?) {
        Toast.makeText(context,"E-Commerce SDK", Toast.LENGTH_SHORT).show()
    }
}