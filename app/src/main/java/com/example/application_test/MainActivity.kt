package com.example.application_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val TAG : String = "MAIN_ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t : Toast = Toast.makeText(
            getApplicationContext(),
            "Naalala mo pa ba yung PhilHealth issue",
            Toast.LENGTH_LONG
        )
        t.show()
        Log.d(TAG, "onCreate: end of function")
    }
}