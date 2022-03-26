package com.avidaldo.viewmodel_estado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.avidaldo.viewmodel_estado.databinding.FragmentMainBinding



/** Fragment que pierde su estado (se destruye y se crea de nuevo) ante cambios
 * de configuración (giro de pantalla, cambio de lenguaje, etc...  */


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private var cuenta = 0

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            binding.tvCuenta.text = (++cuenta).toString()
        }

    }
}