package com.alshabib.theghost02;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class yes extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);



        Button com = (Button) findViewById(R.id.complete);
        Button ba = (Button) findViewById(R.id.back);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(yes.this , FirstOne.class);
                startActivity(i);
            }
        });
   }


    @Override
    protected void onStop()
    {
        super.onStop();
    }


    //The Sound Is On
    public void soundOn()
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.play_game);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }


    //The Sound Is Off
    public void soundOf()
    {
        mediaPlayer.pause();
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
    }




}
