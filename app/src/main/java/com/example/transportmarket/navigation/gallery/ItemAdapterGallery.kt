package com.example.transportmarket.navigation.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.transportmarket.R

class ItemAdapterGallery(
        private val context: GalleryFragment,
        private val dataset: List<Int>
) : RecyclerView.Adapter<ItemAdapterGallery.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val imageViewimageInList: ImageView = view.findViewById(R.id.singleItemGallery)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.single_item_for_gallery, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.imageViewimageInList.setImageResource(item)

/*
        holder.itemView.setOnClickListener{
            val intent = Intent(context.activity, AnnouncementDetailActivity::class.java).also {

                it.putExtra("AKTUALNE_OGLOSZENIE", item)
            }
            context.startActivity(intent)
        }
*/
    }

    override fun getItemCount() = dataset.size
}


