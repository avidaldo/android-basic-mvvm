package com.avidaldo.viewmodel_estado

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/** Clase que hereda de ViewModel() */

class ContadorViewModel : ViewModel() {



    //var count = 0

    /** Utilizamos LiveData para implementar el patrón observer */
    val countLiveData = MutableLiveData(0)

    fun incrementaCuenta() {
        countLiveData.value?.let { countLiveData.value = it+1 }
    }


}