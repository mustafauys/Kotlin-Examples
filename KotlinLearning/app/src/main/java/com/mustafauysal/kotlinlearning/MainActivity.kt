package com.mustafauysal.kotlinlearning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables


        //Integer

        var x = 7
        val y = 4



        println(x*y)

        var age = 20



        val result = age * 5 / 4

        println(result)

        val myInteger = Int  = 5

        //Double & Float

        val r =  Double = 5.0

        val myAge = 23.0

        val myResult = myAge * 5 / 4

        println(myResult)

        //String

        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        val myName = String = "Lars"

        //Boolean

        var isAlive : Boolean = true
        isAlive = false


    }
}
