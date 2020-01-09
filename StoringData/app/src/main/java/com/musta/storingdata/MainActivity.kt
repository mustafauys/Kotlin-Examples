package com.musta.storingdata

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //SharedPreferences Initialize
        sharedPreferences = this.getSharedPreferences("com.musta.storingdata", Context.MODE_PRIVATE)

        val ageFromPreferences = sharedPreferences.getInt("age", -1)

        if (ageFromPreferences == -1) {
            textView.text = "Your Age: "
        } else {
            textView.text = "Your Age:  $ageFromPreferences"
        }
    }

    fun save (view : View) {

        //SharedPreferences


        val myAge = editText.text.toString().toIntOrNull()

        if (myAge != null) {
            textView.text = "Your Age: " + myAge
            sharedPreferences.edit().putInt("age", myAge).apply()
        }

    }

    fun delete (view : View) {

    }
}
