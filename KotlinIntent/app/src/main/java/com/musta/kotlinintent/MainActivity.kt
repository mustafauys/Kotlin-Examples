package com.musta.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next (view: View) {

        val intent = Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("username", userNameText.text.toString())
        intent.putExtra("name",nameText.text.toString())
        startActivity(intent)

    }
}
