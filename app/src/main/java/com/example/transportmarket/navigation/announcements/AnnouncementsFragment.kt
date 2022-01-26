package com.example.transportmarket.navigation.announcements

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.transportmarket.R
import com.example.transportmarket.data.DataSource


class AnnouncementsFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_announcements, container, false)

        // Wyświetlenie listy
        val myDataset = DataSource().loadAnnouncementInformations().shuffled()
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapterAnnouncements(this, myDataset)
        recyclerView.setHasFixedSize(true)



        //filter icon
        val filterView: View = rootView.findViewById(R.id.filterButton)
        filterView.setOnClickListener {

            val intent = Intent(activity, FilterActivity::class.java).apply {  }
            startActivity(intent)
        }

        return rootView
    }
}


