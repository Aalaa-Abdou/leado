package com.example.leado.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mainNavController = findNavController(R.id.nav_host_fragment)
        bottom_navigation_bar.setupWithNavController(mainNavController)
        NavigationUI.setupWithNavController(tool_bar,mainNavController)
    }

}
