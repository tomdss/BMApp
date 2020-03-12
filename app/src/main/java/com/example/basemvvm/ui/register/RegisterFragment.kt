package com.example.basemvvm.ui.register

import androidx.fragment.app.Fragment
import com.example.basemvvm.R
import com.example.basemvvm.databinding.FragmentRegisterBinding
import com.example.basemvvm.ui.adapter.ScreenSlidePagerAdapter
import com.example.basemvvm.ui.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */

private const val NUM_PAGES = 2

class RegisterFragment : BaseFragment<FragmentRegisterBinding, RegisterViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.fragment_register
    }

    override fun viewModelClass(): Class<RegisterViewModel> {
        return RegisterViewModel::class.java
    }

    override fun handleViewState(viewState: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        binding.tabs.setupWithViewPager(binding.viewPager)
        val pagerAdapter = ScreenSlidePagerAdapter(childFragmentManager, NUM_PAGES)
        binding.viewPager.adapter = pagerAdapter
        binding.tabs.getTabAt(0)?.text = getText(R.string.signup)
        binding.tabs.getTabAt(1)?.text = getText(R.string.login)
    }

}
