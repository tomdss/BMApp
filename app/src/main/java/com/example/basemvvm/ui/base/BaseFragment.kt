package com.example.basemvvm.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.basemvvm.utils.constants.ViewState
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<T : ViewDataBinding, M : BaseViewModel> : DaggerFragment() {

    protected lateinit var binding: T
    protected lateinit var viewModel: M
    protected val sharedViewModel by activityViewModels<SharedViewModel>()

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    @LayoutRes
    protected abstract fun layoutRes(): Int

    protected abstract fun viewModelClass(): Class<M>

    protected abstract fun handleViewState(viewState: Int)

    protected abstract fun initView()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes(), container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        viewModel = ViewModelProvider(this, viewModelFactory).get(viewModelClass())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        viewModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->
            viewState?.run {
                when (viewState) {
                    ViewState.SHOW_LOADING -> (activity as? BaseActivity<*, *>)?.showLoading()
                    ViewState.HIDE_LOADING -> (activity as? BaseActivity<*, *>)?.hideLoading()
                    else -> handleViewState(viewState)
                }
            }
        })
        activity?.supportFragmentManager
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.resetViewState()
    }
}