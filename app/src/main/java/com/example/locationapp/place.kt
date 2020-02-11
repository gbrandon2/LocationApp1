package com.example.locationapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class place : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            view.findViewById<TextView>(R.id.textView2).text=arguments!!.getString("Ciudad")!!
        if( arguments!!.getString("Ciudad").equals("España")){
            view.findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.esp)

        }
        if( arguments!!.getString("Ciudad").equals("Medellin")){
            view.findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.madellin)

        }



    }
}
