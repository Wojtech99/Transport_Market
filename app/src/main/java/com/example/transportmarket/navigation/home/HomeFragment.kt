package com.example.transportmarket.navigation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.transportmarket.R
import com.example.transportmarket.data.AnnouncementInformations
import com.example.transportmarket.data.DataSource


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)

        // Wyświetlenie listy
        val myDataset: List<AnnouncementInformations> = DataSource().loadAnnouncementInformations().shuffled()

        val myFilterDataSet: List<AnnouncementInformations> = getFilterList(myDataset)



        val recyclerView = rootView.findViewById<RecyclerView>(R.id.home_recycler_view)
        recyclerView.adapter = ItemAdapterHome(this, myFilterDataSet)
        recyclerView.setHasFixedSize(true)

        return rootView


    }


    /*
    * This function allowed filter your list, to get only premium items
    */
    fun getFilterList(list: List<AnnouncementInformations>): MutableList<AnnouncementInformations> {
        val  list = DataSource().loadAnnouncementInformations()

        val premiumList = mutableListOf<AnnouncementInformations>()

        for(premiumItems in list){
            if (premiumItems.czyPremium == true) {
                premiumList.add(premiumItems)
            }
        }

        return premiumList
    }
}

