package com.avidaldo.viewmodel_estado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.avidaldo.viewmodel_estado.databinding.FragmentMainBinding



/** Fragment que pierde su estado (se destruye y se crea de nuevo) ante cambios
 * de configuración (giro de pantalla, cambio de lenguaje, etc...  */


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val contadorViewModel: ContadorViewModel by viewModels()

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

        /** Suscribimos tvCuenta al LiveData cuentaViewModel con el patrón observer de
         * modo que ante cualquier cambio en el viewModel, la vista se actualizará */
        contadorViewModel.countLiveData.observe(viewLifecycleOwner) {
            binding.tvCuenta.text = it.toString()
        }

        binding.button.setOnClickListener {
            contadorViewModel.incrementaCuenta()
        }

    }
}