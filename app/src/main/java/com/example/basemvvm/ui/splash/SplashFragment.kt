package com.example.basemvvm.ui.splash

import android.os.Handler
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.basemvvm.R
import com.example.basemvvm.databinding.FragmentSplashBinding
import com.example.basemvvm.ui.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.fragment_splash
    }

    override fun viewModelClass(): Class<SplashViewModel> {
        return SplashViewModel::class.java
    }

    override fun handleViewState(viewState: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        Handler().postDelayed(Runnable {
            findNavController().navigate(R.id.splashToRegister)
        }, 2000)
    }

}
