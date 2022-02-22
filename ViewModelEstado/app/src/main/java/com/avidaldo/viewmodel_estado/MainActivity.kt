package com.avidaldo.viewmodel_estado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avidaldo.viewmodel_estado.databinding.ActivityMainBinding


/** Actividad que pierde su estado (se destruye y se crea de nuevo) ante cambios
 * de configuración (giro de pantalla, cambio de lenguaje, etc...  */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel = ContadorViewModel()

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