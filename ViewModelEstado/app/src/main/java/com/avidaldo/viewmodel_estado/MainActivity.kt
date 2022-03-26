package com.avidaldo.viewmodel_estado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.avidaldo.viewmodel_estado.databinding.ActivityMainBinding


/** Actividad que utiliza un ViewModel para mantener el estado de la
 * lógica de negocio */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /** El contador se mueve al ViewModel y introducimos una referencia a éste.
     * La propiedad utilizará Lazy delegation en la función viewModels()
     * requiere añadir la dependencia androidx.activity:activity-ktx */
    private val contadorViewModel: ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** Usando el patrón observer: */

        /** Suscribimos tvCuenta al LiveData cuentaViewModel de modo que
         * ante cualquier cambio en el viewModel, la vista se actualizará */
        contadorViewModel.countLiveData.observe(this) {
            binding.tvCuenta.text = it.toString()
        }

        binding.button.setOnClickListener {
            contadorViewModel.incrementaCuenta()
        }

    }

}