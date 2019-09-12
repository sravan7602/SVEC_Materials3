package com.example.hp.svec_materials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CloudComputingunits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_computingunits);
    }

    public void ccunit1(View view) {
        Intent i=new Intent(this,Ccunit1.class);
        startActivity(i);
    }

    public void ccunit2(View view) {
        Intent i1=new Intent(this,Ccunit2.class);
        startActivity(i1);
    }
}
