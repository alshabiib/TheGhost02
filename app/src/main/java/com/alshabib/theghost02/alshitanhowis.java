package com.alshabib.theghost02;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class alshitanhowis extends AppCompatActivity {

    //The sound
    private MediaPlayer mediaPlayer;
    private MediaPlayer mediaPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alshitanhowis);

        //The Sound
        soundOn();
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
        mediaPlayer2 = MediaPlayer.create(this , R.raw.firsts);
        mediaPlayer2.start();
    }

    //The Sound Is Off
    public void soundOf()
    {
        mediaPlayer.stop();
    }
}
