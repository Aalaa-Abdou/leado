package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
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
        var toolbar = requireActivity().findViewById<Toolbar>(R.id.tool_bar)
        toolbar.visibility = View.GONE
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
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment("PLuzuiqRZ4_2Eth48mg4IkuFbnxgJDAyR7"))
                bottomNavBar.visibility = View.GONE
            }
            mind_mapping_button -> {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment("PLFnCv-4Mi7rhnKLCoCSfnb6rInv62w84H"))
                bottomNavBar.visibility = View.GONE
            }
            self_awareness_button -> {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment("PLjMDJtMdulSpZxT6ojPWdJVzhIrzaoSmo"))
                bottomNavBar.visibility = View.GONE
            }
        }
    }

}
