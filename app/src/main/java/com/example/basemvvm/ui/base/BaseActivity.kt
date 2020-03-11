package com.example.basemvvm.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.basemvvm.utils.constants.ViewState
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<T : ViewDataBinding, M : BaseViewModel> : DaggerAppCompatActivity() {

    protected lateinit var binding: T
    protected lateinit var viewModel: M

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    @LayoutRes
    protected abstract fun layoutRes(): Int

    protected abstract fun viewModelClass(): Class<M>

    protected abstract fun handleViewState()

    protected abstract fun initView()

    abstract fun showLoading()

    abstract fun hideLoading()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this, layoutRes());
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this, viewModelFactory).get(viewModelClass())
        initView()
        viewModel.viewState.observe(this, Observer { viewState ->
            viewState?.run {
                when (viewState) {
                    ViewState.SHOW_LOADING -> showLoading()
                    ViewState.HIDE_LOADING -> hideLoading()
                    else -> handleViewState()
                }
            }
        })
    }

}