package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGoTestActivity_1(view : View){

        val intent = Intent(this, TestActivity1 :: class.java)
        startActivity(intent)

    }

    fun onClickGoTestActivity_2(view : View){

        val intent = Intent(this, TestActivity2 :: class.java)
        startActivity(intent)

    }

}