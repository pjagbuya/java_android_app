package com.example.application_test

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG : String = "MAIN_ACTIVITY"
    private lateinit var inputEt: EditText
    private lateinit var displayBtn: Button
    private lateinit var displayTv: TextView
    private lateinit var toastBtn: Button
    private lateinit var imgBtn: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get content IDs of elements on screen
        this.inputEt = findViewById(R.id.inputEt);
        this.displayBtn = findViewById(R.id.displayBtn);
        this.displayTv = findViewById(R.id.displayTv);
        this.toastBtn = findViewById(R.id.toastBtn)
        this.imgBtn = findViewById(R.id.imgBtn)
        var case : Int = 0

        displayBtn.setOnClickListener{displayTv.text = "Hello, ${inputEt.text}"
            Log.d(TAG,"Finished displayBtn")
        }


        toastBtn.setOnClickListener{
            var t: Toast = Toast.makeText(
                applicationContext,
                "Toast to ${inputEt.text}",
                Toast.LENGTH_LONG
            )
            t.show()
            Log.d(TAG, "finished toastBtn")
        }
        imgBtn.setImageResource(R.drawable.avatar_1)
        imgBtn.setOnClickListener{

            when(case){
                0->{
                    imgBtn.setImageResource(R.drawable.kom4)
                    case++
                }
                1->{
                    imgBtn.setImageResource(R.drawable.he_in_robot)
                    case++
                }
                2->{

                    imgBtn.setImageResource(R.drawable.avatar_1)
                    case++
                }
                else -> {
                    case = 0
                    imgBtn.setImageResource(R.drawable.kom4)
                }

            }

            Log.d(TAG, "changed image finished")
        }







    }
}