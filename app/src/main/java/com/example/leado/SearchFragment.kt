package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar

/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var toolbar = requireActivity().findViewById<Toolbar>(R.id.tool_bar)
        toolbar.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

}
