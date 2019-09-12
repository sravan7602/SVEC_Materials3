package com.example.hp.svec_materials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus extends AppCompatActivity {
    PDFView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        p=(PDFView)findViewById(R.id.syllabus);
        p.fromAsset("SVEC-16-Regulations-(CSE).pdf").load();
    }
}
