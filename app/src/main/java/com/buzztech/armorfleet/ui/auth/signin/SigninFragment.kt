package com.buzztech.armorfleet.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.buzztech.armorfleet.MainActivity
import com.buzztech.armorfleet.R
import com.buzztech.armorfleet.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    companion object {
        fun newInstance() = SigninFragment()
    }

    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SigninViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSigninBinding.inflate(layoutInflater)

        binding.apply {
            forgotPasswordTv.setOnClickListener {
                Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_SHORT).show()
               // Navigation.findNavController(it).navigate(R.id.action_signinFragment_to_forgotPasswordFragment)
         // findNavController().navigate(R.id.action_signinFragment_to_forgotPasswordFragment)
            }

            signupBtn.setOnClickListener {
                findNavController().navigate(R.id.action_signinFragment_to_signupFragment)
            }

            signInBtn.setOnClickListener {
                val intent = Intent(requireActivity(),MainActivity::class.java)
                startActivity(intent)
            }
        }
        return binding.root
    }


}