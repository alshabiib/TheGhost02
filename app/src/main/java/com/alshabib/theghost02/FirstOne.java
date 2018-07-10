package com.alshabib.theghost02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.provider.SearchRecentSuggestions;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class FirstOne extends AppCompatActivity
{
    //The sound
     MediaPlayer mediaPlayer;
     MediaPlayer firstS;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_one);

        // the massege volume up
        Toast.makeText(this , "الشيطان يرحب بك !" , Toast.LENGTH_SHORT).show();


        Button kh = (Button) findViewById(R.id.khlaa);
        kh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstOne.this , khlaa.class);
                startActivity(i);
            }
        });

        //Connection with alshitan
        Button Cw = (Button) findViewById(R.id.ConnW);
        Cw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(FirstOne.this , connection.class);
                startActivity(i);
            }
        });


        //Button about
        final Button about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstOne.this , aboutme.class);
                startActivity(i);
            }
        });


        //Button How is Alshitan
        final Button shit = (Button) findViewById(R.id.alshitanhowis);
        shit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstOne.this , alshitanhowis.class);
                startActivity(i);
            }
        });

    }


    public void onActivityResult(int RequestCode , int ResultCode , Intent Data)
    {

    }


    //The Sound Is On
    public void soundOn()
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.play_game);
        firstS = MediaPlayer.create(this, R.raw.firsts);
        mediaPlayer.setLooping(true);
        firstS.start();
        mediaPlayer.start();

    }


    //The Sound Is Off
    public void soundOf()
    {
        mediaPlayer.release();
        mediaPlayer = null;
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        soundOn();
    }

    protected void onResume()
    {
        super.onResume();
    }


    protected void onStop()
    {
        super.onStop();
        soundOf();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //doubleBackPressed
    boolean doubleBackPressed = false;
    @Override
    public void onBackPressed()
    {
        if (doubleBackPressed)
        {
            super.onBackPressed();
        }
        else
        {

        }
    }


}
