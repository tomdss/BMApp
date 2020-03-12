package com.example.basemvvm.ui.signup

import androidx.fragment.app.Fragment
import com.example.basemvvm.R
import com.example.basemvvm.databinding.FragmentSignupBinding
import com.example.basemvvm.ui.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class SignupFragment : BaseFragment<FragmentSignupBinding, SignupViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.fragment_signup
    }

    override fun viewModelClass(): Class<SignupViewModel> {
        return SignupViewModel::class.java
    }

    override fun handleViewState(viewState: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        //TODO do something
    }

}
