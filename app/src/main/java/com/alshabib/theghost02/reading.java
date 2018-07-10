package com.alshabib.theghost02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class reading extends AppCompatActivity {

    TextView txt;
    TextView txt1;
    String bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        txt = (TextView) findViewById(R.id.txt);
        txt1 = (TextView) findViewById(R.id.txt1);

        // The Books
        final String t = getResources().getString(R.string.b1);
        final String tt = getResources().getString(R.string.b2);

        // For check
        bn = getIntent().getStringExtra("key");

        // Checking...
        if(bn.equals(t))
        {
            txt.setText(t);
            txt1.setText(tt);
        }
        else if(bn.equals(tt))
        {
            txt.setText(tt);
        }


    }







}
