package com.example.leado

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(),View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        user_profile_picture.setOnClickListener(this)
        back_to_login_button.setOnClickListener(this)
        no_account_button.setOnClickListener(this)
        login_button.setOnClickListener(this)
        upload_button.setOnClickListener(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 100){
            user_profile_picture.setImageURI(data?.data)
            upload_button.visibility = View.GONE
        }
    }

    override fun onClick(v: View?) {
        when(v){
            user_profile_picture, upload_button -> {
                //open gallery
                val intent = Intent(Intent.ACTION_PICK)
                intent.type = "image/*"
                startActivityForResult(intent, 100)
            }
            back_to_login_button -> {
                user_profile_picture.visibility = View.GONE
                editTextTextPersonName.visibility = View.GONE
                upload_button.visibility = View.GONE
                renterPassword.visibility = View.GONE
                login_button.text = getString(R.string.log_in)
            }
            no_account_button -> {
                user_profile_picture.visibility = View.VISIBLE
                upload_button.visibility = View.VISIBLE
                editTextTextPersonName.visibility = View.VISIBLE
                renterPassword.visibility = View.VISIBLE
                login_button.text = getString(R.string.Register)
            }
            login_button -> {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            }
        }
    }
}