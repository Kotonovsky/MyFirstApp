package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

            Log.d("MyLog", "ID dula = ${R.drawable.dula}")

            val resultValue = bindingClass.edValue.text.toString()
            bindingClass.imPhoto.visibility = View.VISIBLE

            when (resultValue){

                Constance.ENGINEER -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.ENGINEER_INCOME}"

                    if (bindingClass.edPassword.text.toString() == Constance.ENGINEER_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.andrey)

                    } else {

                        bindingClass.tvResult.text = "Wrong PASS"
                        bindingClass.imPhoto.setImageResource(R.drawable.dula)

                    }
                }

                Constance.CLEANER -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.CLEANER_INCOME}"

                    if (bindingClass.edPassword.text.toString() == Constance.CLEANER_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.sergey)

                    } else {

                        bindingClass.tvResult.text = "Wrong PASS"
                        bindingClass.imPhoto.setImageResource(R.drawable.dula)

                    }
                }

                Constance.DIRECTOR -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Income: ${Constance.DIRECTOR_INCOME}"

                    if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.egor)

                        } else {

                        bindingClass.tvResult.text = "Wrong PASS"
                        bindingClass.imPhoto.setImageResource(R.drawable.dula)

                        }
                }

                else -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Who is this?"
                    bindingClass.imPhoto.setImageResource(R.drawable.dula)

                }
            }

        }

    }

}