package com.example.transportmarket.data

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.transportmarket.PdfActivity
import com.example.transportmarket.R
import com.example.transportmarket.WebViewActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class AnnouncementDetailActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcement_detail)

        //deklaracja aktualnego ogłoszenia
        val currentAnnouncements = intent.getSerializableExtra("AKTUALNE_OGLOSZENIE") as? AnnouncementInformations

        //pokazanie toolbara
        val toolbarInDetail: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarInDetail)
        setSupportActionBar(toolbarInDetail)
        supportActionBar?.apply {
            title = "${currentAnnouncements?.markaSamochodu} ${currentAnnouncements?.modelSamochodu}"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        // zamknięcie toolbara
        toolbarInDetail.setNavigationOnClickListener {
            finish()
        }

        //otwarcie pdf
        val pdfButton = findViewById<Button>(R.id.pdfButton)
        pdfButton.setOnClickListener{
            val intentPdf = Intent(this, PdfActivity::class.java).also {  }
            startActivity(intentPdf)
        }

        //otwarcie webView (strony internetowej)
        val buttonWebView = findViewById<ImageButton>(R.id.imageButtonDetail)
        buttonWebView.setOnClickListener{
            val goToWebViewActivity = Intent(this, WebViewActivity::class.java)
            startActivity(goToWebViewActivity)
        }

        //wysłanie wiadomości
        val sendMessage = findViewById<Button>(R.id.sendMessage)
        sendMessage.setOnClickListener {
            val messge = findViewById<EditText>(R.id.wyslijText).toString()


            val intent = Intent(Intent.ACTION_SEND)
                    .setType("text/plain")
                    .putExtra(Intent.EXTRA_SUBJECT, "Wiadomość ogłoszenie")
                    .putExtra(Intent.EXTRA_TEXT, messge.format(String))

            if (this.packageManager?.resolveActivity(intent, 0) != null) {
                startActivity(intent)
            }
        }


        val picture = findViewById<ImageView>(R.id.imageAssetDetail)
        picture.setImageResource(currentAnnouncements?.imageResourceId!!)

        val markaDetail = findViewById<TextView>(R.id.markaDetail)
        markaDetail.text = "Marka: ${currentAnnouncements.markaSamochodu}"

        val modelDetail = findViewById<TextView>(R.id.modelDetail)
        modelDetail.text = "Model: ${currentAnnouncements.modelSamochodu}"

        val rokDetail = findViewById<TextView>(R.id.rokDetail)
        rokDetail.text = "Rok produkcji: ${currentAnnouncements.rok.toString()}"

        val cenaDetail = findViewById<TextView>(R.id.cenaDetail)
        cenaDetail.text = "Koszt wynajmu za 24 godziny: ${currentAnnouncements.kosztWynajmu.toString()} zł"

        val mocSilnikaDetail = findViewById<TextView>(R.id.mocSilnikaDetail)
        mocSilnikaDetail.text = "Moc silnika: ${currentAnnouncements.mocSilnika.toString()} km"

        val pojemnoscSilnikaDetail = findViewById<TextView>(R.id.pojemnoscSilnikaDetail)
        pojemnoscSilnikaDetail.text = "Pojemność silnika: ${currentAnnouncements.pojemnoscSilnika.toString()} cm3"


        val premiumDetail = findViewById<TextView>(R.id.premiumDetail)

        val ogloszeniePremium: String = getString(R.string.czyPremiumTakDetail)
        val ogloszeniezwykle: String = getString(R.string.czyPremiumNieDetail)

        val czyPremium: Boolean = currentAnnouncements.czyPremium
        if (czyPremium == true) {
            premiumDetail.setText("Rodzaj ogłoszenia: ${ogloszeniePremium}")
        } else {
            premiumDetail.setText("Rodzaj ogłoszenia: ${ogloszeniezwykle}")
        }

        //mapa
        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragmentContainerView) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        mMap = p0

        // Add a marker in Sydney and move the camera
        val wroclaw = LatLng(51.34274787268956, 16.846118482891626)
        mMap.setMinZoomPreference(9f)
        mMap.setMaxZoomPreference(21f)
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) )
        mMap.addMarker(MarkerOptions().position(wroclaw).title("Wroclaw Stadium"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wroclaw))
    }
}