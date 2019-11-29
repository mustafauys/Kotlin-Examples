package com.musta.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {

    var age : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //test()

        val op = Sum()
        println(op.sum(5, 3))
        println(op.div(20, 4))
    }

    class Sum:Div() {
        fun sum (a: Int, b: Int): Int {
            return a + b
        }
    }

    open class Div {
        fun div (a: Int, b: Int): Int {
            return a / b
        }
    }

    fun test() {
        val x = 5  * 4
        println(x)
    }



    fun helloWorld(view: View) {
        textView.text = "Hello World"
    }

    fun makeSimpson(view: View) {

        val name = nameText.text.toString()

        if(!ageText.text.toString().equals("")) {
            age = ageText.text.toString().toInt()
        }

        val job = jobText.text.toString()

        val simpson = Simpson(name, age, job)

        textView.text = " Name: " + simpson.name + " Age:" + simpson.age + " Job:" + simpson.job


    }
}
