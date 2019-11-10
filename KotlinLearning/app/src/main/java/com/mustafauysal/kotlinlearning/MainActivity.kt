package com.mustafauysal.kotlinlearning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables

        val x = 7
        val y = 4

        println(x*y)

        val age = 20
        var result = age * 5 / 4

        println(result)
    }
}
