package com.example.gibreel


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class CopiaGibreel : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_copia_gibreel, container, false)
        val btnPantallaDos: Button = view.findViewById(R.id.btnContinuarPantalla2)
        btnPantallaDos.setOnClickListener {
            val fragment = Fragment2()//Navegación a segundo fragment
            val transaccion = fragmentManager?.beginTransaction()
            transaccion?.replace(R.id.fragmentContenedor,fragment)?.commit()
        }
        return view
    }
}