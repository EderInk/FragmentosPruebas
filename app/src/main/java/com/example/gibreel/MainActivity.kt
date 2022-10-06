package com.example.gibreel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.gibreel.databinding.FragmentCopiaGibreelBinding

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContenedor,CopiaGibreel()).commit()

    }

}