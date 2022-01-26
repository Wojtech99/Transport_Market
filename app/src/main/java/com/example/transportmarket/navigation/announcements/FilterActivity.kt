package com.example.transportmarket.navigation.announcements

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.transportmarket.R

class FilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        //pokazanie toolbara
        val toolbarInFilter: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarInFilter)
        setSupportActionBar(toolbarInFilter)
        supportActionBar?.apply { title = "Filtruj"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        //deklaracja zmiennych do filtrowania
        val marka: EditText = findViewById(R.id.markaSamochodu)
        val model: EditText = findViewById(R.id.modelSamochodu)
        val rokProdukcjiMin: EditText = findViewById(R.id.rokSamochoduMin)
        val rokProdukcjiMax: EditText = findViewById(R.id.rokSamochoduMax)
        val mocSamochoduMin: EditText = findViewById(R.id.mocSamochoduMin)
        val mocSamochoduMax: EditText = findViewById(R.id.mocSamochoduMax)
        val pojemnoscSilnika: EditText = findViewById(R.id.pojemnoscSilnika)
        val kosztWynajmu: EditText = findViewById(R.id.kosztWynajmu)
        val ogloszeniaPremium: RadioGroup = findViewById(R.id.radioGroupFilter)


        //deklaracja przycisków zapisz i wyczyść
        val wyczyscButton: Button = findViewById(R.id.wyczysc_filter_button)
        val zapiszButton: Button = findViewById(R.id.zapisz_filter_button)

        //logika przycisku wyczyść
        wyczyscButton.setOnClickListener{
            marka.text.clear()
            model.text.clear()
            rokProdukcjiMin.text.clear()
            rokProdukcjiMax.text.clear()
            mocSamochoduMin.text.clear()
            mocSamochoduMax.text.clear()
            pojemnoscSilnika.text.clear()
            kosztWynajmu.text.clear()
            ogloszeniaPremium.clearCheck()
        }

        //wysłanie danych z filtrem do adptera

    }

    //pojawienie się przycisku wstecz
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}