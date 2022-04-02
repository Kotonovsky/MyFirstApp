package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString()

            when (resultValue){

                Constance.ENGINEER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.ENGINEER_INCOME}"

                    if (bindingClass.edPassword.text.toString() == Constance.ENGINEER_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                    } else {
                        bindingClass.tvResult.text = "Wrong PASS"
                    }
                }

                Constance.CLEANER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.CLEANER_INCOME}"

                    bindingClass.tvResult.text =
                        if (bindingClass.edPassword.text.toString() == Constance.CLEANER_PASSWORD) {
                            tempText
                    } else {
                            "Wrong PASS"
                    }
                }

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.DIRECTOR_INCOME}"

                    bindingClass.tvResult.text =
                        if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                            tempText
                        } else {
                            "Wrong PASS"
                        }
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Who is this?"
                }
            }

        }

    }

}