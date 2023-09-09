package com.example.myapplication3.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication3.R


class ProfileFragment : Fragment() {
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)

        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        initButtons(view)
        buttonListeners()

        return view
    }

    private fun initButtons(view: View) {
        loginButton = view.findViewById(R.id.go_to_login_button)
        registerButton = view.findViewById(R.id.go_to_register_button)
    }

    private fun buttonListeners(){
        loginButton.setOnClickListener{
            val loginFragment = LoginFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, loginFragment)
                .addToBackStack(null)
                .commit()
        }

        registerButton.setOnClickListener{
            val registerFragment = RegisterFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, registerFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}