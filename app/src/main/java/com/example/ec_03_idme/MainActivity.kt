package com.example.ec_03_idme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.ec_03_idme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var A: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        A = ActivityMainBinding.inflate(layoutInflater)
        setContentView(A.root)

        val fragmenView = supportFragmentManager.findFragmentById(R.id.fcv_nagation) as NavHostFragment
        val navController = fragmenView.navController
        A.bnvStore.setupWithNavController(navController)
    }
}
