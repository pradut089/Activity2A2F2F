package com.example.a2akt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_a2_factivity.btn_send
import kotlinx.android.synthetic.main.activity_a2_factivity.et_name

class A2FActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a2_factivity)


        btn_send.setOnClickListener {
            var frag1 = Frag1()
            var bundle = Bundle()
            if(et_name.text.trim().isEmpty())
                Toast.makeText(this,"please fill the box",Toast.LENGTH_SHORT).show()
            else
            {
            bundle.putString("name",et_name.text.toString())
            frag1.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.frame,frag1).commit()
                }
        }
    }
    /* NOTE::  if you've to send data from fragment to activity then use Intent for sending data
       Intent intent = new Intent(getActivity(),ActivityName.class);
         intent.putExtra("key",value);
         startActivity(intent);
         */
}