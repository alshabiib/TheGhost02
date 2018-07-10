package com.alshabib.theghost02;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class no extends AppCompatActivity {

    MediaPlayer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no);

        s = MediaPlayer.create(getBaseContext() , R.raw.sarkaa);
        s.setLooping(true);

        CountDownTimer t = new CountDownTimer(7000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                s.start();
            }

            @Override
            public void onFinish()
            {
                Intent i = new Intent(no.this , FirstOne.class);
                startActivity(i);
            }
        }.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        s.release();
        s = null;
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
