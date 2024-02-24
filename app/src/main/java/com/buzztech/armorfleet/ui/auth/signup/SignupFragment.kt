package com.buzztech.armorfleet.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.buzztech.armorfleet.R
import com.buzztech.armorfleet.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    companion object {
        fun newInstance() = SignupFragment()
    }

    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: SignupViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignupBinding.inflate(layoutInflater)

        binding.apply {

            signinBtn.apply {
                findNavController().popBackStack()
            }

            continueBtn.setOnClickListener {
               // findNavController().navigate(R.id.action_signupFragment_to_termsandConditionFragment)
            }
        }
        return binding.root
    }
}