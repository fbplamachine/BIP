package com.fbplamachine.bip.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fbplamachine.bip.R
import com.fbplamachine.bip.databinding.FragmentLoginBinding

class LoginFragment : Fragment(), View.OnClickListener {
    lateinit var mBinding: FragmentLoginBinding
//    lateinit var registerFragment: RegisterFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        mBinding.textCreateNewAccount.setOnClickListener(this)
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            mBinding.textCreateNewAccount.id->{
//                registerFragment = RegisterFragment()
//                val fragment =
//                    requireActivity().supportFragmentManager.findFragmentByTag(registerFragment.tag)
//                if (fragment == null) registerFragment.show(requireActivity().supportFragmentManager, registerFragment.tag)

                val transaction = activity!!.supportFragmentManager.beginTransaction()
                transaction.replace(R.id.ly_manager, RegisterFragment())
                transaction.disallowAddToBackStack()
                transaction.commit()
            }
        }
    }
}