package com.mustafauysal.kotlinlearning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables

        //Integer

        var x = 5
        val y = 4

        x = 6

        println(x*y)

        var age = 20

        age = 23

        val result = age * 5 / 4

        println(result)

        val myInteger : Int = 5



        //Double & Float

        val pi = 3.14

        val r : Double = 5.0

        val myAge = 23.0

        val myResult = myAge * 5 / 4

        println(myResult)

        //String

        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        val myName : String = "Lars"

        //Boolean

        var isAlive : Boolean = true
        isAlive = false

        //Arrays

        val myArray = arrayOfNulls<String>(4)

        myArray[0] = "James"
        myArray[1] = "Lars"
        myArray[2] = "Kirk"
        myArray[3] = "Rob"

        println(myArray[2])

        val myNumberArray = intArrayOf(10,20,30,40,50)

        println(myNumberArray.size)
        myNumberArray.set(2,35)
        println(myNumberArray[2])

        //List

        val myMusician = ArrayList<String>()

        myMusician.add("James")
        myMusician.add("Lars")

        println(myMusician)

        myMusician.add(1,"Kirk")

        myMusician.add("Kirk")

        println(myMusician)

        //Set

        val mySet = HashSet<String>()

        mySet.add("Kirk")
        mySet.add("Kirk")

        println(mySet.size)

        //Map

        val myHashMap = HashMap<String, String>()

        myHashMap.put("name", "James")
        myHashMap.put("instrument", "Guitar")

        println(myHashMap["instrument"])


        //Operators

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 6

        println(m>n)
        println(n>m)

        //if

        if (m > n) {

            println("m is greater than n")

        } else if (n > m) {
            println("n is greater than m")
        } else {
            println("m = n")
        }

        //Switch

        val day = 3
        var dayString = ""

        if (day == 1) {
            dayString = "Monday"
        } else if (day == 2) {
            dayString = "Tuesday"
        } else if (day == 3) {
            dayString = "Wednesday"
        }
        when (day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = "Sunday"
        }

        println(dayString)

    }
}
