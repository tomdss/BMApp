package com.example.basemvvm.ui.list_category

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.basemvvm.R
import com.example.basemvvm.databinding.FragmentListCategoryBinding
import com.example.basemvvm.ui.adapter.ListPopularAdapter
import com.example.basemvvm.ui.base.BaseFragment
import com.example.basemvvm.utils.constants.ViewState

/**
 * A simple [Fragment] subclass.
 */
class ListCategoryFragment : BaseFragment<FragmentListCategoryBinding, ListCategoryViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.fragment_list_category
    }

    override fun viewModelClass(): Class<ListCategoryViewModel> {
        return ListCategoryViewModel::class.java
    }

    override fun handleViewState(viewState: Int) {
        when (viewState) {
            ViewState.ListCategory.GET_LIST_CATERORY_SUCCESS -> hideLoading()
        }
    }

    override fun initView() {
//        val adapter = ListCategoryAdapter()
        val adapter = ListPopularAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.getListPopular().observe(viewLifecycleOwner, Observer {
            it?.let {
                val i = 6
                adapter.submitList(it)
            }
        })

    }

}
