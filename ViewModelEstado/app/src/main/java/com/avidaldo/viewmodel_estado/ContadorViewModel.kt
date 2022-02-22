package com.avidaldo.viewmodel_estado

import androidx.lifecycle.ViewModel




class ContadorViewModel {
    private var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }


}