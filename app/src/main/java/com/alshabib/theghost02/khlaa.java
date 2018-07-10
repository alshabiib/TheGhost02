package com.alshabib.theghost02;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class khlaa extends AppCompatActivity {

    MediaPlayer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khlaa);

        Toast.makeText(this , "لا تلمسني !!" , Toast.LENGTH_SHORT).show();

        s = MediaPlayer.create(this , R.raw.sarkaa);

        CountDownTimer t = new CountDownTimer(4000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                s.start();
            }

            @Override
            public void onFinish()
            {
                finish();
            }
        }.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        s.stop();
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
