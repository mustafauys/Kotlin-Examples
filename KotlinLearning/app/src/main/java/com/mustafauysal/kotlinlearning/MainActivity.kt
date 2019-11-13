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

        //Double & Float

        val myAge = 23.0

        val myResult = myAge * 5 / 4

        println(myResult)

        //String

        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        //Boolean

        var isAlive = true
        isAlive = false


    }
}
