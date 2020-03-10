package com.example.basemvvm.ui.main

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
}
