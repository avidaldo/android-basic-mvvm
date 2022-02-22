package com.avidaldo.viewmodel_estado

import androidx.lifecycle.ViewModel


/** Clase que hereda de ViewModel() */

class ContadorViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }


}