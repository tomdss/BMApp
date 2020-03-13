package com.example.basemvvm.ui.base

import androidx.lifecycle.ViewModel
import com.example.basemvvm.data.repository.IApiRepository
import com.example.basemvvm.ui.custom.SingleLiveEvent
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    @Inject
    protected lateinit var apiRepository: IApiRepository

    val viewState = SingleLiveEvent<Int>()
    protected val disposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}