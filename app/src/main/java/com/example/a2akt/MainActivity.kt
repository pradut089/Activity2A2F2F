package com.example.a2akt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_Act_Frame
import kotlinx.android.synthetic.main.activity_main.btn_send_main
import kotlinx.android.synthetic.main.activity_main.et_fname
import kotlinx.android.synthetic.main.activity_main.et_lname


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send_main.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("Fname",et_fname.text.toString())
                    .putExtra("Lname",et_lname.text.toString()))


        }
        btn_Act_Frame.setOnClickListener {
            startActivity(Intent(this,A2FActivity::class.java))
        }

    }
}