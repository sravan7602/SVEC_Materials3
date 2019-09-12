package com.example.hp.svec_materials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ccunit1 extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccunit1);
        book1=(PDFView)findViewById(R.id.ccbook1);
        book1.fromAsset("Cloud Computing - Unit-I (Part - I).pdf").load();
    }
}
