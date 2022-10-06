package com.example.gibreel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2,container,false)
        val btnRegresar: Button = view.findViewById(R.id.btncontinuar)
        btnRegresar.setOnClickListener {
            val fragment = CopiaGibreel()
            val transaccion = fragmentManager?.beginTransaction()
            transaccion?.replace(R.id.fragmentContenedor,fragment)?.commit()
        }
        return view

    }
}