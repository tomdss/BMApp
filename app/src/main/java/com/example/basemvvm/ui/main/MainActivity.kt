package com.example.basemvvm.ui.main

import android.view.View
import com.example.basemvvm.R
import com.example.basemvvm.databinding.ActivityMainBinding
import com.example.basemvvm.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    override fun viewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun handleViewState() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        //TODO do something in here
    }

    override fun showLoading() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        binding.progressBar.visibility = View.GONE
    }
}
