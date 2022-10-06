package com.example.gibreel


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

class CopiaGibreel : Fragment() {

    private  lateinit var  comunicador: Comunicador

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val databinding = DataBindingUtil.inflate<ViewDataBinding>(
            inflater,
            R.layout.fragment_copia_gibreel,
            container,
            false

        ).apply {
            lifecycleOwner = viewLifecycleOwner
            executePendingBindings()
        }

        return databinding.root
    }

}