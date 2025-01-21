package com.example.a2akt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag2.view.btn_goto_main
import kotlinx.android.synthetic.main.fragment_frag2.view.tv_frag2


class Frag2 : Fragment() {
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          var view = inflater.inflate(R.layout.fragment_frag2, container, false)

          view.tv_frag2.text = arguments?.getString("name")

          view.btn_goto_main.setOnClickListener {
              startActivity(Intent(context,A2FActivity::class.java))
          }

        return view
    }
}