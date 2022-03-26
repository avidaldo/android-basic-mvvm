package com.avidaldo.viewmodel_estado


data class ContadorModel(private var cuenta: Int = 0) {

    fun incrementaCuenta(): Int {
        return ++cuenta
    }


}