package com.banklannister.pdfreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banklannister.pdfreader.databinding.ActivityPdfBinding
import com.github.barteksc.pdfviewer.PDFView

class PdfActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfBinding
    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPdfBinding.inflate(layoutInflater)
        setContentView(binding.root)


        pdfView = binding.pdfViewer

        pdfView.fromAsset("sample.pdf").load()
    }
}