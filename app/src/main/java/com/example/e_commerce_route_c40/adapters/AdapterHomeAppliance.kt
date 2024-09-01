package com.example.e_commerce_route_c40.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce_route_c40.databinding.ItemHomeApplianceBinding

class AdapterHomeAppliance: RecyclerView.Adapter<AdapterHomeAppliance.Holder>() {
//    var categoryList: List<Category>? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemHomeApplianceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        TODO()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
//        val data = categoryList!![position]
//        holder.bind(data)
    }


    private lateinit var onProductClick: (Int) -> Unit?
    fun setOnProductClick(onClick: (Int) -> Unit) {
        this.onProductClick = onProductClick}

    private lateinit var oncCartClick: (Int) -> Unit?
    fun setOncCartClick(onClick: (Int) -> Unit) {
        this.oncCartClick = oncCartClick}

    private lateinit var onFavorietsClick: (Int) -> Unit?
    fun setOnFavClick(onFavorietsClick: (Int) -> Unit) {
        this.onFavorietsClick = onFavorietsClick}

    inner class Holder(val binding: ItemHomeApplianceBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.ivProduct.setOnClickListener {
//                onProductClick.invoke(categoryList!![layoutPosition].*id*)
            }
            binding.btnAddCart.setOnClickListener{
//                oncCartClick.invoke(categoryList!![layoutPosition].*id*)

            }
            binding.btnFavoriets.setOnClickListener{
//                onFavorietsClick.invoke(categoryList!![layoutPosition].*id*)

            }
        }

        fun bind() {
//            binding.apply {
//                Glide.with(binding.root.context)
//                    .load(categoryList.strCategoryThumb)
//                    .into(ivProduct)
//                tvPrice.text = price
//
//            }

        }
    }
}