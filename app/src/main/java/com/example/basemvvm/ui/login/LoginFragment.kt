package com.example.basemvvm.ui.login

import androidx.fragment.app.Fragment
import com.example.basemvvm.R
import com.example.basemvvm.databinding.FragmentLoginBinding
import com.example.basemvvm.ui.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.fragment_login
    }

    override fun viewModelClass(): Class<LoginViewModel> {
        return LoginViewModel::class.java
    }

    override fun handleViewState(viewState: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        //TODO do nothing
    }

}
