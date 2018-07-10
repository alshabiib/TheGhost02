package com.alshabib.theghost02;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class tlasm extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;
    TextView t14;
    TextView t15;


    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    TextView a5;
    TextView a6;
    TextView a7;
    TextView a8;
    TextView a9;
    TextView a10;
    TextView a11;
    TextView a12;
    TextView a13;
    TextView a14;
    TextView a15;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlasm);

        Toast.makeText(this , "استخدم هذه الطلاسم للتحدث مع الشيطان" , Toast.LENGTH_SHORT).show();

        Spinner ms = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , getResources().getStringArray(R.array.tlsms));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ms.setAdapter(adapter);
        ms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    information i = new information();
                    t1 = (TextView) findViewById(R.id.t1);
                    t1.setText(i.ts1);

                    a1 = (TextView) findViewById(R.id.a1);
                    a1.setText(i.tsa1);

                    t2 = (TextView) findViewById(R.id.t2);
                    t2.setText(i.ts2);

                    a2 = (TextView) findViewById(R.id.a2);
                    a2.setText(i.tsa2);

                    t3 = (TextView) findViewById(R.id.t3);
                    t3.setText(i.ts3);

                    a3 = (TextView) findViewById(R.id.a3);
                    a3.setText(i.tsa3);

                    t4 = (TextView) findViewById(R.id.t4);
                    t4.setText(i.ts13);

                    a4 = (TextView) findViewById(R.id.a4);
                    a4.setText(i.tsa13);

                    t5 = (TextView) findViewById(R.id.t5);
                    t5.setText(i.ts5);

                    a5 = (TextView) findViewById(R.id.a5);
                    a5.setText(i.tsa5);

                    t6 = (TextView) findViewById(R.id.t6);
                    t6.setText(i.ts6);

                    a6 = (TextView) findViewById(R.id.a6);
                    a6.setText(i.tsa6);

                    t7 = (TextView) findViewById(R.id.t7);
                    t7.setText(i.ts7);

                    a7 = (TextView) findViewById(R.id.a7);
                    a7.setText(i.tsa7);

                    t8 = (TextView) findViewById(R.id.t8);
                    t8.setText(i.ts8);

                    a8 = (TextView) findViewById(R.id.a8);
                    a8.setText(i.tsa8);

                    t9 = (TextView) findViewById(R.id.t9);
                    t9.setText(i.ts9);

                    a9 = (TextView) findViewById(R.id.a9);
                    a9.setText(i.tsa9);

                    t10 = (TextView) findViewById(R.id.t10);
                    t10.setText(i.ts10);

                    a10 = (TextView) findViewById(R.id.a10);
                    a10.setText(i.tsa10);

                    t11 = (TextView) findViewById(R.id.t11);
                    t11.setText(i.ts11);

                    a11 = (TextView) findViewById(R.id.a11);
                    a11.setText(i.tsa11);

                    t12 = (TextView) findViewById(R.id.t12);
                    t12.setText(i.ts12);

                    a12 = (TextView) findViewById(R.id.a12);
                    a12.setText(i.tsa12);

                    t13 = (TextView) findViewById(R.id.t13);
                    t13.setText(i.ts4);

                    a13 = (TextView) findViewById(R.id.a13);
                    a13.setText(i.tsa4);

                    t14 = (TextView) findViewById(R.id.t14);
                    t14.setText(i.ts14);

                    a14 = (TextView) findViewById(R.id.a14);
                    a14.setText(i.tsa14);

                    t15 = (TextView) findViewById(R.id.t15);
                    t15.setText(i.ts15);

                    a15 = (TextView) findViewById(R.id.a15);
                    a15.setText(i.tsa15);

                }
                else if(position == 1)
                {
                    information i = new information();
                    t1 = (TextView) findViewById(R.id.t1);
                    t1.setText(i.tg1);

                    a1 = (TextView) findViewById(R.id.a1);
                    a1.setText(i.tga1);

                    t2 = (TextView) findViewById(R.id.t2);
                    t2.setText(i.tg2);

                    a2 = (TextView) findViewById(R.id.a2);
                    a2.setText(i.tga2);

                    t3 = (TextView) findViewById(R.id.t3);
                    t3.setText(i.tg3);

                    a3 = (TextView) findViewById(R.id.a3);
                    a3.setText(i.tga3);

                    t4 = (TextView) findViewById(R.id.t4);
                    t4.setText(i.tg4);

                    a4 = (TextView) findViewById(R.id.a4);
                    a4.setText(i.tga4);

                    t5 = (TextView) findViewById(R.id.t5);
                    t5.setText(i.tg5);

                    a5 = (TextView) findViewById(R.id.a5);
                    a5.setText(i.tga5);

                    t6 = (TextView) findViewById(R.id.t6);
                    t6.setText(i.tg6);

                    a6 = (TextView) findViewById(R.id.a6);
                    a6.setText(i.tga6);

                    t7 = (TextView) findViewById(R.id.t7);
                    t7.setText(i.tg7);

                    a7 = (TextView) findViewById(R.id.a7);
                    a7.setText(i.tga7);

                    t8 = (TextView) findViewById(R.id.t8);
                    t8.setText(i.tg8);

                    a8 = (TextView) findViewById(R.id.a8);
                    a8.setText(i.tga8);

                    t9 = (TextView) findViewById(R.id.t9);
                    t9.setText(i.tg9);

                    a9 = (TextView) findViewById(R.id.a9);
                    a9.setText(i.tga9);

                    t10 = (TextView) findViewById(R.id.t10);
                    t10.setText("");

                    a10 = (TextView) findViewById(R.id.a10);
                    a10.setText("");

                    t11 = (TextView) findViewById(R.id.t11);
                    t11.setText("");

                    a11 = (TextView) findViewById(R.id.a11);
                    a11.setText("");

                    t12 = (TextView) findViewById(R.id.t12);
                    t12.setText("");

                    a12 = (TextView) findViewById(R.id.a12);
                    a12.setText("");

                    t13 = (TextView) findViewById(R.id.t13);
                    t13.setText("");

                    a13 = (TextView) findViewById(R.id.a13);
                    a13.setText("");

                    t14 = (TextView) findViewById(R.id.t14);
                    t14.setText("");

                    a14 = (TextView) findViewById(R.id.a14);
                    a14.setText("");

                    t15 = (TextView) findViewById(R.id.t15);
                    t15.setText("");

                    a15 = (TextView) findViewById(R.id.a15);
                    a15.setText("");
                }
                else  if (position == 2)
                {
                    information i = new information();
                    t1 = (TextView) findViewById(R.id.t1);
                    t1.setText(i.tf1);

                    a1 = (TextView) findViewById(R.id.a1);
                    a1.setText(i.tfa1);

                    t2 = (TextView) findViewById(R.id.t2);
                    t2.setText(i.tf2);

                    a2 = (TextView) findViewById(R.id.a2);
                    a2.setText(i.tfa2);

                    t3 = (TextView) findViewById(R.id.t3);
                    t3.setText(i.tf3);

                    a3 = (TextView) findViewById(R.id.a3);
                    a3.setText(i.tfa3);

                    t4 = (TextView) findViewById(R.id.t4);
                    t4.setText(i.tf4);

                    a4 = (TextView) findViewById(R.id.a4);
                    a4.setText(i.tfa4);

                    t5 = (TextView) findViewById(R.id.t5);
                    t5.setText("");

                    a5 = (TextView) findViewById(R.id.a5);
                    a5.setText("");

                    t6 = (TextView) findViewById(R.id.t6);
                    t6.setText("");

                    a6 = (TextView) findViewById(R.id.a6);
                    a6.setText("");

                    t7 = (TextView) findViewById(R.id.t7);
                    t7.setText("");

                    a7 = (TextView) findViewById(R.id.a7);
                    a7.setText("");

                    t8 = (TextView) findViewById(R.id.t8);
                    t8.setText("");

                    a8 = (TextView) findViewById(R.id.a8);
                    a8.setText("");

                    t9 = (TextView) findViewById(R.id.t9);
                    t9.setText("");

                    a9 = (TextView) findViewById(R.id.a9);
                    a9.setText("");

                    t10 = (TextView) findViewById(R.id.t10);
                    t10.setText("");

                    a10 = (TextView) findViewById(R.id.a10);
                    a10.setText("");

                    t11 = (TextView) findViewById(R.id.t11);
                    t11.setText("");

                    a11 = (TextView) findViewById(R.id.a11);
                    a11.setText("");

                    t12 = (TextView) findViewById(R.id.t12);
                    t12.setText("");

                    a12 = (TextView) findViewById(R.id.a12);
                    a12.setText("");

                    t13 = (TextView) findViewById(R.id.t13);
                    t13.setText("");

                    a13 = (TextView) findViewById(R.id.a13);
                    a13.setText("");

                    t14 = (TextView) findViewById(R.id.t14);
                    t14.setText("");

                    a14 = (TextView) findViewById(R.id.a14);
                    a14.setText("");

                    t15 = (TextView) findViewById(R.id.t15);
                    t15.setText("");

                    a15 = (TextView) findViewById(R.id.a15);
                    a15.setText("");
                }
                else  if (position == 3)
                {
                    information i = new information();
                    t1 = (TextView) findViewById(R.id.t1);
                    t1.setText(i.tm1);

                    a1 = (TextView) findViewById(R.id.a1);
                    a1.setText(i.tma1);

                    t2 = (TextView) findViewById(R.id.t2);
                    t2.setText(i.tm2);

                    a2 = (TextView) findViewById(R.id.a2);
                    a2.setText(i.tma2);

                    t3 = (TextView) findViewById(R.id.t3);
                    t3.setText(i.tm3);

                    a3 = (TextView) findViewById(R.id.a3);
                    a3.setText(i.tma3);

                    t4 = (TextView) findViewById(R.id.t4);
                    t4.setText(i.tm4);

                    a4 = (TextView) findViewById(R.id.a4);
                    a4.setText(i.tma4);

                    t5 = (TextView) findViewById(R.id.t5);
                    t5.setText(i.tm5);

                    a5 = (TextView) findViewById(R.id.a5);
                    a5.setText(i.tma5);

                    t6 = (TextView) findViewById(R.id.t6);
                    t6.setText(i.tm6);

                    a6 = (TextView) findViewById(R.id.a6);
                    a6.setText(i.tma6);

                    t7 = (TextView) findViewById(R.id.t7);
                    t7.setText(i.tm7);

                    a7 = (TextView) findViewById(R.id.a7);
                    a7.setText(i.tma7);

                    t8 = (TextView) findViewById(R.id.t8);
                    t8.setText(i.tm8);

                    a8 = (TextView) findViewById(R.id.a8);
                    a8.setText(i.tma8);

                    t9 = (TextView) findViewById(R.id.t9);
                    t9.setText("");

                    a9 = (TextView) findViewById(R.id.a9);
                    a9.setText("");

                    t10 = (TextView) findViewById(R.id.t10);
                    t10.setText("");

                    a10 = (TextView) findViewById(R.id.a10);
                    a10.setText("");

                    t11 = (TextView) findViewById(R.id.t11);
                    t11.setText("");

                    a11 = (TextView) findViewById(R.id.a11);
                    a11.setText("");

                    t12 = (TextView) findViewById(R.id.t12);
                    t12.setText("");

                    a12 = (TextView) findViewById(R.id.a12);
                    a12.setText("");

                    t13 = (TextView) findViewById(R.id.t13);
                    t13.setText("");

                    a13 = (TextView) findViewById(R.id.a13);
                    a13.setText("");

                    t14 = (TextView) findViewById(R.id.t14);
                    t14.setText("");

                    a14 = (TextView) findViewById(R.id.a14);
                    a14.setText("");

                    t15 = (TextView) findViewById(R.id.t15);
                    t15.setText("");

                    a15 = (TextView) findViewById(R.id.a15);
                    a15.setText("");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

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
