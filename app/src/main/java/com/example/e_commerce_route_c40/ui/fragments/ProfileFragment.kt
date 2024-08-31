package com.example.e_commerce_route_c40.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.e_commerce_route_c40.databinding.FragmentProfileBinding
import com.example.e_commerce_route_c40.base.BaseFragment


class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentProfileBinding.inflate(inflater, container, false)

    // now you can use binding directly

}