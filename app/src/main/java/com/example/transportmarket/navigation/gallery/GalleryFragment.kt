package com.example.transportmarket.navigation.gallery

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.transportmarket.R
import com.example.transportmarket.data.DataSource

class GalleryFragment : Fragment() {

    var modalList = ArrayList<Int>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val rootView: View = inflater.inflate(R.layout.fragment_gallery, container, false)


        val pictureData: List<Int> = DataSource().loadPicturesData()

        for (i in pictureData) {
            modalList.add(i)
        }

        var customAdapter = CustomAdapter(modalList, rootView.context);
        val gridView: GridView = rootView.findViewById(R.id.gridView)
        gridView.adapter = customAdapter;

        gridView.setOnItemClickListener {adapterView, view, i, l ->
            var intent = Intent( rootView.context,ViewActivity::class.java)
            intent.putExtra( "data",modalList[i])
            startActivity(intent)
        }

        return rootView
    }

}

class CustomAdapter(
        var itemModel:ArrayList<Int>,
        var context: Context
) : BaseAdapter() {

    var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getView(position: Int,view: View?, viewGroup: ViewGroup?): View {
        var view =view;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_items,viewGroup, false)
        }

        var imageView = view?.findViewById<ImageView>(R.id.imageView);

        imageView?.setImageResource(itemModel[position]!!)

        return view!!;

    }

    override fun getItem(p0: Int): Any {
        return itemModel[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }


    override fun getCount(): Int {
        return itemModel.size

    }

}
