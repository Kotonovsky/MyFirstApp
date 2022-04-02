package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.ActionMenuView
import android.widget.TextView
import android.widget.Button
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString().toInt()

            when (resultValue){

                in 0..999 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "New blogger"
                }

                in 1000..100000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Medium blogger"
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Top blogger"
                }
            }

        }

        }

}