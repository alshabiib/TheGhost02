package com.alshabib.theghost02;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class notgood extends AppCompatActivity {

    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notgood);

        m = MediaPlayer.create(this , R.raw.sarkaa);

        CountDownTimer t = new CountDownTimer(7000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {

                m.start();
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
        m.stop();
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
