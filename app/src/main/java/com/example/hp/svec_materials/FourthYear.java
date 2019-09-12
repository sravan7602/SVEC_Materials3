package com.example.hp.svec_materials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_year);
    }

    public void cc(View view) {
        Intent s1=new Intent(this,CloudComputingunits.class);
        startActivity(s1);
    }

    public void syllabus(View view) {
        Intent s2=new Intent(this,Syllabus.class);
        startActivity(s2);
    }

    public void iotunit(View view) {
        Intent s3=new Intent(this,Iotunits.class);
        startActivity(s3);
    }
}
