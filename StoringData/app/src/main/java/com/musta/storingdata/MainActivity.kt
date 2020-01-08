package com.musta.storingdata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save (view : View) {

        //SharedPreferences

        val sharedPreferences = this.getSharedPreferences("com.musta.storingdata", Context.MODE_PRIVATE)

        val myAge = editText.text.toString().toIntOrNull()

        if (myAge != null) {
            textView.text = "Your Age: " + myAge
            sharedPreferences.edit().putInt("age", myAge)
        }

    }

    fun delete (view : View) {

    }
}
