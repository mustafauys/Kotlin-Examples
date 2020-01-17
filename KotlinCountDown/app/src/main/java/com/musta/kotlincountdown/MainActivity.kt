package com.musta.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abstract - Inheritance

        object : CountDownTimer(10000,1000) {
            override fun onFinish() {
                textView.text = "Left: 0"
            }

            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Left: ${millisUntilFinished/1000}"
            }

        }.start()
    }
}
