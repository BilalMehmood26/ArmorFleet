package com.buzztech.armorfleet.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.buzztech.armorfleet.R
import com.buzztech.armorfleet.databinding.FragmentSignupBinding
import com.buzztech.armorfleet.databinding.FragmentTermsandConditionBinding


class TermsandConditionFragment : Fragment() {


    private var _binding: FragmentTermsandConditionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTermsandConditionBinding.inflate(layoutInflater)

        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        return binding.root
    }
}