package com.example.basemvvm.ui.list_category

import androidx.lifecycle.MutableLiveData
import com.example.basemvvm.data.model.Category
import com.example.basemvvm.data.model.movie.Result
import com.example.basemvvm.ui.base.BaseViewModel
import com.example.basemvvm.utils.constants.ViewState
import io.reactivex.functions.Consumer
import io.reactivex.rxkotlin.addTo
import javax.inject.Inject

class ListCategoryViewModel @Inject constructor() : BaseViewModel() {

    private val listCategory = MutableLiveData<List<Category>>()
    private val listMoviePopular = MutableLiveData<List<Result>>()

    fun getListCategory(): MutableLiveData<List<Category>> {
        apiRepository.getListCategory()
            .doOnSubscribe(Consumer { viewState.value = ViewState.SHOW_LOADING })
            .doFinally { viewState.value = ViewState.HIDE_LOADING }
            .subscribe(
                {
                    viewState.value = ViewState.ListCategory.GET_LIST_CATERORY_SUCCESS
                    listCategory.value = it?.data?.categories
                },
                { throwable -> viewState.value = ViewState.SHOW_ERROR }
            )
            .addTo(disposable)
        return listCategory
    }

    fun getListPopular(): MutableLiveData<List<Result>> {
        apiRepository.getListPopular()
            .doOnSubscribe(Consumer { viewState.value = ViewState.SHOW_LOADING })
            .doFinally { viewState.value = ViewState.HIDE_LOADING }
            .subscribe(
                {
                    viewState.value = ViewState.ListPopular.GET_LIST_POPULAR_SUCCESS
                    listMoviePopular.value = it?.results
                },
                { throwable -> viewState.value = ViewState.SHOW_ERROR }
            )
            .addTo(disposable)
        return listMoviePopular
    }

}