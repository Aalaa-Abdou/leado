package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(), View.OnClickListener {

    private lateinit var bottomNavBar: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        bottomNavBar = activity?.findViewById(R.id.bottom_navigation_bar)!!
        bottomNavBar.visibility = View.GONE
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        log_in_button.setOnClickListener(this)
        get_started_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            log_in_button -> {
                findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment())
            }
            get_started_button -> {
                findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment())
            }
        }
    }

}