package com.example.e_commerce_route_c40.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce_route_c40.adapters.AdapterCategories
import com.example.e_commerce_route_c40.adapters.AdapterHomeAppliance
import com.example.e_commerce_route_c40.adapters.VpImagesAdapter
import com.example.e_commerce_route_c40.base.BaseFragment
import com.example.e_commerce_route_c40.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private  var vpImagesAdapter: VpImagesAdapter ? = null
    private  var adapterCategories: AdapterCategories  ? = null
    private  var adapterHomeAppliance: AdapterHomeAppliance ? = null

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    )=FragmentHomeBinding.inflate(inflater,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
        onClicks()
    }

    private fun onClicks() {
//        adapterHomeAppliance!!.setOncCartClick {
//            // action add to cart
//        }
//        adapterHomeAppliance!!.setOnFavClick {
//            //action add to favoriets
//        }
//        adapterHomeAppliance!!.setOnProductClick {
//            // action to specific product fragment
//        }
//
//        adapterCategories!!.setOnClick {
//            // action to specific category fragment
//        }
        binding.apply {
            etSearch.setOnClickListener {
                // Handle search button click
            }
            btnCart.setOnClickListener {
                // action to cart fragment
            }
            tvViewAllCategories.setOnClickListener {
                // action to all categories fragment

            }
            rvCategories.setOnClickListener {
                // action to specific category fragment
            }
            rvHomeAppliance.setOnClickListener {
                // action to specific appliance fragment
            }

        }

    }
    private fun setUpViewPager() {
//        vpImagesAdapter.differ.submitList()
        binding.vpOffers.adapter = vpImagesAdapter

    }
}