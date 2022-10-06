package com.example.gibreel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gibreel.databinding.FragmentCopiaGibreelBinding

class MainActivity : AppCompatActivity(), Comunicador {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val copiaGibreel = CopiaGibreel ()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,copiaGibreel).commit()
    }

    override fun pasarDatos(editText: String) {
        val bundle = Bundle()
        bundle.putString("message", editText)

        val transaccion = this.supportFragmentManager.beginTransaction()
        val fragment2 = Fragment2()
        fragment2.arguments = bundle

        transaccion.replace(R.id.fragmentContainerView,fragment2)
        transaccion.commit()

    }
}