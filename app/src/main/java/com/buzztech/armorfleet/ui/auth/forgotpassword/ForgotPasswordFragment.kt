package com.buzztech.armorfleet.ui.auth.forgotpassword

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.buzztech.armorfleet.R
import com.buzztech.armorfleet.databinding.FragmentForgotPasswordBinding
import com.buzztech.armorfleet.databinding.FragmentVerifyOTBinding

class ForgotPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = ForgotPasswordFragment()
    }

    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ForgotPasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForgotPasswordBinding.inflate(layoutInflater)

        binding.apply {
            backBtn.apply {
                findNavController().popBackStack()
            }
            proceedBtn.setOnClickListener {
                //findNavController().navigate(R.id.action_forgotPasswordFragment_to_verifyOTPFragment)
            }

        }
        return binding.root
    }
}