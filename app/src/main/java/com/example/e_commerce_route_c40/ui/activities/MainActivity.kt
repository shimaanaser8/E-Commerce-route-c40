package com.example.e_commerce_route_c40.ui.activities

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.e_commerce_route_c40.R
import com.example.e_commerce_route_c40.databinding.ActivityMainBinding
import com.example.e_commerce_route_c40.base.BaseActivity


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateBinding() = ActivityMainBinding.inflate(layoutInflater)
    // now you can use binding directly

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linkNavHostWithBottomNavigation()

        handelBottomNavBackground()

    }

    private fun handelBottomNavBackground() {

     val selectedItemId = binding.bottomNavigation.selectedItemId

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            val backgroundDrawable = when (selectedItemId) {
                R.id.homeFragment -> R.drawable.ic_bg_home
                R.id.categoryFragment -> R.drawable.ic_bg_category
                R.id.favoriteFragment -> R.drawable.ic_bg_favorite
                R.id.profileFragment -> R.drawable.ic_bg_profile
                else -> null
            }
            backgroundDrawable?.let {
                binding.bottomNavigation.itemBackground = ContextCompat.getDrawable(this, it)
            }
            true
        }
//        binding.bottomNavigation.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.homeFragment -> {
//                    binding.bottomNavigation.itemBackground =
//                        ContextCompat.getDrawable(this, R.drawable.ic_bg_home)
//                }
//
//                R.id.categoryFragment -> {
//                    binding.bottomNavigation.itemBackground =
//                        ContextCompat.getDrawable(this, R.drawable.ic_bg_category)
//                }
//
//                R.id.favoriteFragment -> {
//                    binding.bottomNavigation.itemBackground =
//                        ContextCompat.getDrawable(this, R.drawable.ic_bg_favorite)
//                }
//
//                R.id.profileFragment -> {
//                    binding.bottomNavigation.itemBackground =
//                        ContextCompat.getDrawable(this, R.drawable.ic_bg_profile)
//                }
//
//            }
//            false
//        }

    }

    private fun linkNavHostWithBottomNavigation() {
        val navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNavigation.setupWithNavController(navController)
    }


}