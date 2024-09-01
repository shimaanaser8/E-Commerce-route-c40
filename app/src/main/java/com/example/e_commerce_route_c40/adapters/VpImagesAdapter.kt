package com.example.e_commerce_route_c40.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.e_commerce_route_c40.R
import com.example.e_commerce_route_c40.databinding.ItemOffersBinding

class  VpImagesAdapter : RecyclerView.Adapter<VpImagesAdapter.VpImagesViewHolder>() {



    private val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

     val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VpImagesViewHolder {
        return VpImagesViewHolder(
            ItemOffersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: VpImagesViewHolder, position: Int) {
        val image = differ.currentList[position]
        holder.bind(image)
    }

    inner class VpImagesViewHolder(val binding: ItemOffersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imagePath:String){
            Glide.with(itemView).load(imagePath).placeholder(R.drawable.ic_logo) .into(binding.ivProduct)
        }
    }
}