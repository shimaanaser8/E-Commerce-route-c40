package com.example.e_commerce_route_c40.ui.fragments


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.e_commerce_route_c40.databinding.FragmentFavorateBinding
import com.example.e_commerce_route_c40.base.BaseFragment


class FavoriteFragment : BaseFragment<FragmentFavorateBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    )= FragmentFavorateBinding.inflate(inflater,container,false)

    // now you can use binding directly


}