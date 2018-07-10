package com.alshabib.theghost02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class start extends AppCompatActivity {

    MediaPlayer s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        s = MediaPlayer.create(this , R.raw.startpass);
        s.setLooping(true);
        s.start();

        Button enter = (Button) findViewById(R.id.entere);
        Button whpass = (Button) findViewById(R.id.whpass);
        final MediaPlayer srk = MediaPlayer.create(this , R.raw.wrongpas);

        whpass.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "In Twitter: @alshabiib" , Toast.LENGTH_LONG).show();
            }
        });


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText pass = (EditText) findViewById(R.id.passs);
                String pa = pass.getText().toString();

                if (pa.equals("j")) {
                    finish();
                }
                else if (pa.equals(""))
                {
                    Toast.makeText(getBaseContext() , "أدخل المفتاح !" , Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getBaseContext() , "المفتاح خطأ !" , Toast.LENGTH_LONG).show();
                    pass.setText("");
                    srk.start();
                }

            }
        });

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
        else
        {
            doubleBackPressed = true;
            final ConstraintLayout con = (ConstraintLayout) findViewById(R.id.qus);
            Intent i = new Intent(start.this, FirstOne.class);
            startActivity(i);
        }
    }

}
