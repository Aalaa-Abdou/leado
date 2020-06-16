package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var bottomNavBar: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bottomNavBar = activity?.findViewById(R.id.bottom_navigation_bar)!!
        bottomNavBar.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        personal_branding_button.setOnClickListener(this)
        mind_mapping_button.setOnClickListener(this)
        self_awareness_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            personal_branding_button -> {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(personal_branding_button.text.toString()))
                bottomNavBar.visibility = View.GONE
            }
            mind_mapping_button -> {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(mind_mapping_button.text.toString()))
                bottomNavBar.visibility = View.GONE
            }
            self_awareness_button -> {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(self_awareness_button.text.toString()))
                bottomNavBar.visibility = View.GONE
            }
        }
    }

}
