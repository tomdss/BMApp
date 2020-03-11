package com.example.basemvvm.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable


class SharedViewModel : ViewModel() {
    private val disposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }


}