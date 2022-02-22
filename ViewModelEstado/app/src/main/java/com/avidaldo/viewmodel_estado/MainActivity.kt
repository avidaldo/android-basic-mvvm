package com.avidaldo.viewmodel_estado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avidaldo.viewmodel_estado.databinding.ActivityMainBinding


/** Actividad que pierde su estado (se destruye y se crea de nuevo) ante cambios
 * de configuración (giro de pantalla, cambio de lenguaje, etc...  */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var cuenta = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.tvCuenta.text = (++cuenta).toString()
        }

    }

}