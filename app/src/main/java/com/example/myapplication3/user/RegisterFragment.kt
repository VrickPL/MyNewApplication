package com.example.myapplication3.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myapplication3.R
import org.apache.commons.validator.routines.EmailValidator

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = view.findViewById<EditText>(R.id.register_email).text.toString()
        val password = view.findViewById<EditText>(R.id.register_password).text.toString()
        val confirmPassword = view.findViewById<EditText>(R.id.register_confirm_password).text.toString()
    }

    private fun isEmailValid(email: String?): Boolean {
        val emailValidator: EmailValidator = EmailValidator.getInstance()
        return emailValidator.isValid(email)
    }
}