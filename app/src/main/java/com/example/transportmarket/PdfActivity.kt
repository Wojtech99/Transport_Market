package com.example.transportmarket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView

class PdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        //pokazanie toolbara
        val toolbarInPDF: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarInDetail)
        setSupportActionBar(toolbarInPDF)
        supportActionBar?.apply {
            title = "Opis działalności"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        // zamknięcie toolbara
        toolbarInPDF.setNavigationOnClickListener {
            finish()
        }

        //wyświetlenie pdf
        findViewById<PDFView>(R.id.activityPdfView).fromAsset("listapakowania.pdf").show()
    }
}