package com.example.transportmarket.navigation.myannouncements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.transportmarket.R
import com.example.transportmarket.data.DataSource
import com.google.android.material.snackbar.Snackbar


class MyAnnouncementsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_my_announcements, container, false)

        // Wyświetlenie listy
        val myDataset = DataSource().loadAnnouncementInformations()
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.my_recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
         recyclerView.setHasFixedSize(true)

        //filter icon
        val addView: View = rootView.findViewById(R.id.AddButton)
        addView.setOnClickListener {view ->
            Snackbar.make(view, "Tu dodasz swoje ogłoszenie", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }


        return rootView
    }

}