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
    private val viewModel: ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** Necesario para que, si estamos recuperando un estado previo, no empiece en 0 */
        binding.tvCuenta.text = viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener {
            /** La modificación de la vista ahora se hace desde el ViewModel */
            binding.tvCuenta.text = viewModel.getUpdatedCount().toString()
        }

    }

}