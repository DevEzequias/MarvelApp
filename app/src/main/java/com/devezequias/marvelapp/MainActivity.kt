package com.devezequias.marvelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.devezequias.marvelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        initViews(binding)
    }

    private fun initViews(binding: ActivityMainBinding) {
        navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottonNavigation.apply {
            setupWithNavController(navController)
            setOnNavigationItemReselectedListener {  }
        }
    }
}