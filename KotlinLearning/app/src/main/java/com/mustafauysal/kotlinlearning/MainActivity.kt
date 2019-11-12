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

        x = 6

        println(x*y)

        var age = 20

        age = 24

        val result = age * 5 / 4

        println(result)

        //Double & Float

        val pi = 3.14

        val myAge = 23.0

        val myResult = myAge * 5 / 4

        println(myResult)
    }
}
