package com.alshabib.theghost02;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aboutme extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        //The Sound
        soundOn();


        //The Views
        Button twitter = (Button) findViewById(R.id.twitter);

        //twitter
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/alshabiib"));
                startActivity(i);
            }
        });



    }

    @Override
    protected void onStop() {
        super.onStop();
        soundOf();
    }


    //The Sound Is On
    public void soundOn()
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.play_game);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        mediaPlayer1 = MediaPlayer.create(this , R.raw.firsts);
        mediaPlayer1.start();
    }


    //The Sound Is Off
    public void soundOf()
    {
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
