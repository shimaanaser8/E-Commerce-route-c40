package com.example.e_commerce_route_c40.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.e_commerce_route_c40.adapters.OffersAdapter
import com.example.e_commerce_route_c40.base.BaseFragment
import com.example.e_commerce_route_c40.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private lateinit var offersAdapter: OffersAdapter

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    )=FragmentHomeBinding.inflate(inflater,container,false)


}