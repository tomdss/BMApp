package com.example.basemvvm.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.basemvvm.data.repository.IApiRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    @Inject
    protected lateinit var apiRepository: IApiRepository

    val viewState = MutableLiveData<Int>()
    protected val disposable = CompositeDisposable()

    /**
     * reset view state to null to avoid re-observe when config change
     * call this method in fragment's onDestroyView method
     */
    fun resetViewState() {
        viewState.value = null
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}