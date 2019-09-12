package com.example.hp.svec_materials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Iotunits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iotunits);
    }

    public void iotunit1(View view) {
        Intent i=new Intent(this,Iotunit1.class);
        startActivity(i);
    }

    public void iotunit2(View view) {
        Intent i2=new Intent(this,Iotunits.class);
        startActivity(i2);
    }
}
