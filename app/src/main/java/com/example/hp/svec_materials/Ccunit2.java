package com.example.hp.svec_materials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ccunit2 extends AppCompatActivity {
    PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccunit2);
        book=(PDFView)findViewById(R.id.ccbook2);
        book.fromAsset("Cloud Computing - Unit-II.pdf").load();
    }
}
