package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ProductAdapter(private val images: List<images>, private val products2: List<images>)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val imageView2: ImageView = itemView.findViewById(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        if(getLeftListCount() >  position) {
            val p = images[position]
            Glide.with(holder.itemView)
                    .load(p.image)
                    .centerInside()
                    .into(holder.imageView)
        }

        if(getRightListCount() >  position){
            val p2 = products2[position]
            Glide.with(holder.itemView)
                    .load(p2.image)
                    .centerInside()
                    .into(holder.imageView2)
        }
    }

    fun getLeftListCount(): Int = images.size
    fun getRightListCount(): Int = products2.size
    override fun getItemCount(): Int = images.size
}






