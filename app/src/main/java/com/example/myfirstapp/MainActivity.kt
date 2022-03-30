package com.example.myfirstapp

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
    val maxPerson = 90
    val currentPerson = 35

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        bindingClass.b1.setOnClickListener {

            bindingClass.txResult.text =
                if(maxPerson > currentPerson)
                    "All is good"
                else
                    "Full limit"

        }

        bindingClass.b2.setOnClickListener {


        }

        bindingClass.b3.setOnClickListener {


        }

    }



}