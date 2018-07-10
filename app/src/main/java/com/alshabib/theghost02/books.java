package com.alshabib.theghost02;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class books extends AppCompatActivity {

    Button book;
    Button book1;

    public String bn;
    public String bt;

    final private String key = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        final String t = getResources().getString(R.string.b1);
        final String tt = getResources().getString(R.string.b2);

        // Book 1
        book = (Button) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(books.this, reading.class);
                i.putExtra(key, t);
                startActivity(i);
            }
        });

        // book 2
        book1 = (Button) findViewById(R.id.book1);
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(books.this, reading.class);
                i.putExtra(key, tt);
                startActivity(i);
            }
        });


    }

    public void SetData(String bn)
    {
        this.bn = bn;
    }

    public String GetData()
    {
        return this.bn;
    }



}
