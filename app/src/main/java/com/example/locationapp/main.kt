package com.example.locationapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class main : Fragment(),View.OnClickListener {
    lateinit var navController: NavController;
    override fun onClick(v: View?) {
        when(v!!.id){
        R.id.btn_car->{

val bundle= bundleOf("Ciudad" to "Cartagena")
            navController!!.navigate(R.id.action_main2_to_place,bundle)
        }
        R.id.btn_med->{
            val bundle= bundleOf("Ciudad" to "Medellin")
            navController!!.navigate(R.id.action_main2_to_place,bundle)
        }
            R.id.btn_esp->{
                val bundle= bundleOf("Ciudad" to "España")
                navController!!.navigate(R.id.action_main2_to_place,bundle)
            }
        }
         }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_car).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_med).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_esp).setOnClickListener(this)
    }
}
