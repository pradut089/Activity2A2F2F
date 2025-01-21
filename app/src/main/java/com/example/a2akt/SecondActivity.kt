package com.example.a2akt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.btn_mainActivity
import kotlinx.android.synthetic.main.activity_second.tv_fname
import kotlinx.android.synthetic.main.activity_second.tv_lname

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tv_fname.text = intent.getStringExtra("Fname")
        tv_lname.text = intent.getStringExtra("Lname")
        btn_mainActivity.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}