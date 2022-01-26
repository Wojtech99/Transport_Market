package com.example.transportmarket.navigation.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.transportmarket.R
import com.example.transportmarket.data.AnnouncementDetailActivity
import com.example.transportmarket.data.AnnouncementInformations

class ItemAdapterHome(
        private val context: HomeFragment,
        private val dataset: List<AnnouncementInformations>
) : RecyclerView.Adapter<ItemAdapterHome.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textViewTitle : TextView = view.findViewById(R.id.Title)
        val textViewSubTitle : TextView = view.findViewById(R.id.SubTitle)
        val textViewCena : TextView = view.findViewById(R.id.Cena)
        val textViewmocSilnika : TextView = view.findViewById(R.id.mocSilnika)
        val textViewpojemnoscSilnika : TextView = view.findViewById(R.id.pojemnoscSilnika)
        val imageViewimageInList: ImageView = view.findViewById(R.id.imageInList)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.single_item_for_listview, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        

            holder.textViewTitle.text = item.markaSamochodu
            holder.textViewSubTitle.text = item.modelSamochodu
            holder.textViewCena.text = "${item.kosztWynajmu} zł"
            holder.textViewmocSilnika.text = "Moc silnika: ${item.mocSilnika} km"
            holder.textViewpojemnoscSilnika.text = "Pojemnośc silnika: ${item.pojemnoscSilnika} cm3"
            holder.imageViewimageInList.setImageResource(item.imageResourceId)


        holder.itemView.setOnClickListener{
            val intent = Intent(context.activity, AnnouncementDetailActivity::class.java).also {

                it.putExtra("AKTUALNE_OGLOSZENIE", item)
            }
            context.startActivity(intent)
        }

    }

    override fun getItemCount() = dataset.size
}


