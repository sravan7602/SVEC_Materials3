package com.example.hp.svec_materials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Iotunit1 extends AppCompatActivity {
    PDFView f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iotunit1);
        f=(PDFView)findViewById(R.id.iotunit1);
        f.fromAsset("IoT ppts unit 1.pdf").load();
    }
}
