package com.avidaldo.viewmodel_estado

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ContadorViewModel : ViewModel() {

    /** Instanciamos el modelo */
    private val model = ContadorModel()

    /** Definimos el modelo de datos que se corresponde con la vista */
    val countLiveData = MutableLiveData(0)


    /** Métodos que llaman al modelo y actualizan el viewModel */
    fun incrementaCuenta() {
        countLiveData.postValue(model.incrementaCuenta())
    }
}
