package com.musta.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        println(sum(5,10))
    }

    fun test() {
        val x = 5  * 4
        println(x)
    }

    fun sum (a: Int, b: Int): Int {
        return a + b
    }
}
