package com.example.snakebar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        For Toast Message
//        val text1 = "Hello Jaydeep!"
//        val duration = Toast.LENGTH_SHORT
//        val toast = Toast.makeText(applicationContext, text1, duration)
//        toast.show()

        val snackbar = Snackbar.make(applicationContext, "Single-line message!", Snackbar.LENGTH_LONG)
        snackbar.show()


        // For SnakeBar Meesage
//        val text2 = "Hello Someone";
//        val duration = Toast.LENGTH_SHORT
//        val snackbar = Snackbar.make();
//        val mySnackbar = Snackbar.make(applicationContext, text2, duration)
    }
}