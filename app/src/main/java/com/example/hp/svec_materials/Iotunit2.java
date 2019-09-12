package com.example.hp.svec_materials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Iotunit2 extends AppCompatActivity {
    PDFView pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iotunit2);
        pd=(PDFView)findViewById(R.id.iotunit2);
        pd.fromAsset("IoT ppts unit 2.pdf").load();
    }
}
