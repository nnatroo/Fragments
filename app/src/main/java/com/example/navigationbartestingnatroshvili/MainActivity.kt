package com.example.navigationbartestingnatroshvili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val controller = findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(

            setOf(
                R.id.homeFragment,
                R.id.dashboardFragment,
                R.id.notificationFragment,
                R.id.paymentsFragment
            )
        )

        setupActionBarWithNavController(controller, appBarConfig)
        navView.setupWithNavController(controller)

    }
}