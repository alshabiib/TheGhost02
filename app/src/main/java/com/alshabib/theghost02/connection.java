package com.alshabib.theghost02;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class connection extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    MediaPlayer t1;
    MediaPlayer arr;
    int [] x = {R.raw.mzag,R.raw.mzagg,R.raw.mzaggg,R.raw.mzagggg,R.raw.mzaggggg};
    int [] x1 = {R.raw.dhk,R.raw.dhkk,R.raw.shkkk};
    int [] x2 = {R.raw.findsh1,R.raw.findsh2,R.raw.findsh3};
    int [] x3 = {R.raw.shfaa1,R.raw.shfaa2,R.raw.shfaa3,R.raw.shfaa4};
    int [] x4 = {R.raw.ad1,R.raw.ad2,R.raw.ad3,R.raw.ad4,R.raw.ad5};

    private AdView AdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        MobileAds.initialize(this,"ca-app-pub-2437582656300073~6600167217");

        AdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdView.loadAd(adRequest);

        //Intent i = new Intent(connection.this,start.class);
        //startActivity(i);

        Toast.makeText(this , "انقر على 'كتاب الطلاسم' لمعرفة الطلاسم" , Toast.LENGTH_LONG).show();

        final EditText e = (EditText) findViewById(R.id.wt);

        Button talk = (Button) findViewById(R.id.talk);
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String a = e.getText().toString();

                CountDownTimer t = new CountDownTimer(2000,1000)
                {
                    @Override
                    public void onTick(long millisUntilFinished)
                    {
                        Toast.makeText(getBaseContext() , "........................" , Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish()
                    {
                        if (a.equals("سمكهو"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.name);
                            t1.start();
                        }
                        else if (a.equals("هملكه"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.family);
                            t1.start();
                        }
                        else if (a.equals("تنمين"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.where);
                            t1.start();
                        }
                        else if (a.equals("مهاوي"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.hwaya);
                            t1.start();
                        }
                        else if (a.equals("قيدمكي"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.kedk);
                            t1.start();
                        }
                        else if (a.equals("مسقع"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.music);
                            CountDownTimer t = new CountDownTimer(4000,1000)
                            {
                                @Override
                                public void onTick(long millisUntilFinished)
                                {
                                    t1.start();
                                }

                                @Override
                                public void onFinish()
                                {
                                    Intent i = new Intent(connection.this , notgood.class);
                                    startActivity(i);
                                }
                            }.start();
                        }
                        else if (a.equals("شرفبل"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.favdrink);
                            t1.start();
                        }
                        else if (a.equals("شعقدل"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.love);
                            t1.start();
                        }
                        else if (a.equals("صدقال"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.frind);
                            t1.start();
                        }
                        else if (a.equals(""))
                        {
                            Toast.makeText(getBaseContext() , "اكتب طلسم !!" , Toast.LENGTH_LONG).show();
                        }
                        else if (a.equals("تناهل"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.sleep);
                            t1.start();
                        }
                        else if (a.equals("رمضيك"))
                        {
                            Toast.makeText(getBaseContext() , "Twitter: @alshabiib" , Toast.LENGTH_LONG).show();
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.mrd);
                            t1.start();
                        }
                        else if (a.equals("مفرض"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.itti);
                            t1.start();
                        }
                        else if (a.equals("ركمع"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.old);
                            t1.start();
                        }
                        else if (a.equals("زجان"))
                        {
                            RandomArray.shuffle(x);
                            arr = MediaPlayer.create(getBaseContext(),x[0]);
                            arr.start();
                        }
                        else if (a.equals("ترسيح"))
                        {
                            Toast.makeText(getBaseContext() , "@alshitann" , Toast.LENGTH_LONG).show();
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.twitter);
                            t1.start();
                        }
                        else if (a.equals("عجني"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.otherworld);
                            t1.start();
                        }
                        else if(a.equals("رانس"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.watshens);
                            t1.start();
                        }
                        else if (a.equals("حشجن"))
                        {
                            RandomArray.shuffle(x2);
                            arr = MediaPlayer.create(getBaseContext(),x2[0]);
                            arr.start();
                        }
                        else if (a.equals("يحطش"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.shlikyo);
                            t1.start();
                        }
                        else if (a.equals("زعمين"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.zeemk);
                            t1.start();
                        }
                        else if (a.equals("دحيك"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.thtk);
                            t1.start();
                        }
                        else if (a.equals("رنيج"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.noor);
                            t1.start();
                        }
                        else if (a.equals("دهجخ"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.jhnm);
                            t1.start();
                        }
                        else if (a.equals("وجداه"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.wjodallah);
                            t1.start();
                        }
                        else if (a.equals("شمكن"))
                        {
                            Intent i = new Intent(connection.this , game1.class);
                            startActivity(i);
                        }
                        else if (a.equals("قرمعن"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.mathreading);
                            t1.start();
                        }
                        else if (a.equals("كمدع"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.numbook);
                            t1.start();
                        }
                        else if (a.equals("كفضيل"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.loverbook);
                            t1.start();
                        }
                        else if (a.equals("نصدك"))
                        {
                            RandomArray.shuffle(x4);
                            arr = MediaPlayer.create(getBaseContext() , x4[0]);
                            arr.start();
                        }
                        else if (a.equals("ركضح"))
                        {
                            RandomArray.shuffle(x1);
                            arr = MediaPlayer.create(getBaseContext() , x1[0]);
                            arr.start();
                        }
                        else if (a.equals("اسطفر"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.astora);
                            t1.start();
                        }
                        else if (a.equals("مسكر"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.messi);
                            t1.start();
                        }
                        else if (a.equals("متشجك"))
                        {
                            t1 = MediaPlayer.create(getBaseContext() , R.raw.tshjee);
                            t1.start();
                        }
                        else if (a.equals("علج"))
                        {
                            RandomArray.shuffle(x3);
                            arr = MediaPlayer.create(getBaseContext() , x3[0]);
                            arr.start();
                        }
                        else if (a.equals("قمال"))
                        {
                            Intent i = new Intent(connection.this , whosay.class);
                            startActivity(i);
                        }
                        else if (a.equals("جلنش"))
                        {
                            Intent i = new Intent(connection.this , engame.class);
                            startActivity(i);
                        }
                        else if (a.equals("مسدن"))
                        {
                            Intent i = new Intent(connection.this , Ask1.class);
                            startActivity(i);
                        }
                        else if (a.equals("مكتبة"))
                        {
                            Intent i = new Intent(connection.this , books.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(getBaseContext() , "أي لغة هذه يا أحمق !!" , Toast.LENGTH_LONG).show();
                            Intent i = new Intent(connection.this , notgood.class);
                            startActivity(i);
                        }
                    }
                }.start();


            }
        });

        final Button tlsm = (Button) findViewById(R.id.tlsm);
        tlsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(connection.this , tlasm.class);
                startActivity(i);

            }
        });

    }
    

    @Override
    protected void onStart()
    {
        super.onStart();
        mediaPlayer = MediaPlayer.create(this , R.raw.firsts);
        mediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
