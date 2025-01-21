package com.example.a2akt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag1.view.btn_send_toFragment2
import kotlinx.android.synthetic.main.fragment_frag1.view.tv_frag1

class Frag1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag1, container, false)

                view.tv_frag1.text = arguments?.getString("name")

                view.btn_send_toFragment2.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("name",arguments?.getString("name"))
                val frag2 = Frag2() 
                    frag2.arguments =  bundle
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frame,frag2)?.commit()
                }
        return view
    }
    /* NOTE::  if you've to send data from fragment to activity then use Intent for sending data
       Intent intent = new Intent(getActivity(),ActivityName.class);
         intent.putExtra("key",value);
         startActivity(intent);
         */
}