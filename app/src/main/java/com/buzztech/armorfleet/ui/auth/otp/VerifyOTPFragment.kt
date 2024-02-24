package com.buzztech.armorfleet.ui.auth.otp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.buzztech.armorfleet.R
import com.buzztech.armorfleet.databinding.FragmentSignupBinding
import com.buzztech.armorfleet.databinding.FragmentVerifyOTBinding

class VerifyOTPFragment : Fragment() {

    companion object {
        fun newInstance() = VerifyOTPFragment()
    }

    private var _binding: FragmentVerifyOTBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: VerifyOTViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerifyOTBinding.inflate(layoutInflater)

        binding.apply {
            backBtn.apply {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}