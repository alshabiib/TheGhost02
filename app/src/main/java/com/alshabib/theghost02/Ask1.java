package com.alshabib.theghost02;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class Ask1 extends AppCompatActivity {

    int i = 0;

    //Number The Qustions
    final public int nq = 100;

    //Timer
    CountDownTimer t = new CountDownTimer(12000,1000)
    {
        @Override
        public void onTick(long millisUntilFinished)
        {
            final TextView timer = (TextView) findViewById(R.id.tim);
            timer.setText("سيظهر الشيطان بعد "+ti+" ثانية.");
            ti--;
        }

        @Override
        public void onFinish()
        {
            Intent i = new Intent(Ask1.this , no.class);
            startActivity(i);
        }
    };


    //The Score
    public int score = 1;


    //time
    public int ti = 10;


    //The sound
    private static MediaPlayer mediaPlayer;
    private static MediaPlayer mediaPlayer2;


    //The Answer yes or no
    public void onActivityResult(int RequestCode , int ResultCode , Intent Data)
    {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_questions);

            //The Views
        final TextView scr = (TextView) findViewById(R.id.score);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);

        mediaPlayer2 = MediaPlayer.create(this, R.raw.play_game);

        //The Score
        scr.setText("1 / "+ nq);


                        //First Question
        qus.setText("هل تؤمن بوجود الله ؟");
        ans1.setText("نعم");
        ans2.setText("لا");
        ans1.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                                i++;
                                if(i > 0)
                                {
                                    timerOff();
                                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                                        @Override
                                        public void onTick(long millisUntilFinished)
                        {
                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q2();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;

            }

        });
        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

    }


    // OnStart
    @Override
    protected void onStart()
    {
        super.onStart();
        mediaPlayer2.setLooping(true);
        mediaPlayer2.start();
        soundOn();
        timer();
    }


        //OnResume
        @Override
        protected void onResume()
        {
            super.onResume();
        }


        // OnStop
        @Override
        protected void onStop()
        {
            super.onStop();
            soundOf();
            mediaPlayer2.release();
            mediaPlayer2 = null;
            timerOff();
            this.ti = 10;
        }

        //OnRestart
        @Override
        protected void onRestart()
        {
            super.onRestart();
        }

        @Override
        protected void onDestroy()
        {
            super.onDestroy();
        }

        //The Score
    public void TheScore()
    {
        score++;
    }


    //The Timer
    public void timer()
    {
        ti = 10;
        t.start();
    }


    //The Timer is Off
    public void timerOff()
    {
        t.cancel();
    }


    //The Sound Is On
    public void soundOn()
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.scaruedit);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }


    //The Sound Is Off
    public void soundOf()
    {
        mediaPlayer.release();
        mediaPlayer = null;
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
            String msg = "Press back again to back";
            Toast.makeText(this , msg , Toast.LENGTH_SHORT).show();
            new android.os.Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    doubleBackPressed = false;
                }
            },3000);
        }
    }

    public void Q2()
    {
        RandomArray q = new RandomArray();
        Button as1   = (Button) findViewById(R.id.ans1);
        Button as2   = (Button) findViewById(R.id.ans2);
        TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q2);
        as1.setText("6236 آية");
        as2.setText("6326 آية");

        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q3();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q3() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q24);
        ans1.setText("النبي موسى (ع)");
        ans2.setText("النبي إسماعيل(ع)");

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q4();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

    }


    public void Q4() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q25);
        ans1.setText("النبي داوود (ع)");
        ans2.setText("النبي إدريس (ع)");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q5();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q5() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q26);
        ans1.setText("النبي محمد (ص)");
        ans2.setText("النبي نوح (ع)");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q6();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }






    public void Q6() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q27);
        ans1.setText("النبي إبراهيم (ع)");
        ans2.setText("النبي موسى (ع)");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q7();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q7() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q7);
        ans1.setText("سورة الكوثر");
        ans2.setText("سورة الإخلاص");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {
                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q8();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q8() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);


        qus.setText(q.q8);
        ans1.setText("آية الدين");
        ans2.setText("آية الكرسي");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {
                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q9();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q9() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q9);
        ans1.setText("الآية 29 من سورة البقرة");
        ans2.setText("الآية 29 من سورة الفتح");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , FirstOne.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q10();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q10() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q10);
        ans1.setText("7 علامات");
        ans2.setText("6 علامات");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q11();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q11() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q33);
        ans1.setText("الجمعة");
        ans2.setText("السبت");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q12();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q12() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q36);
        ans1.setText("النبي محمد (ص)");
        ans2.setText("النبي آدم (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this ,no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q13();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q13() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q37);
        ans1.setText("ضلع آدم الأيمن");
        ans2.setText("ضلع آدم الأيسر");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q14();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q14() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q6);
        ans1.setText("286");
        ans2.setText("274");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q15();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q15() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q5);
        ans1.setText("30");
        ans2.setText("60");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q16();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q16() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q3);
        ans1.setText("144");
        ans2.setText("114");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q17();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q17() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q28);
        ans1.setText("آدم (ع)");
        ans2.setText("نوح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q18();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q18() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q46);
        ans1.setText("قوم ثمود");
        ans2.setText("قوم عاد");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q19();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q19() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q47);
        ans1.setText("الناقة");
        ans2.setText("إحياء الموتى");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q20();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q20() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q48);
        ans1.setText("أهل مصر");
        ans2.setText("أهل الشام");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q21();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q21() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q15);
        ans1.setText("آل عمران");
        ans2.setText("التوبة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q22();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q22() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q20);
        ans1.setText("رمضان");
        ans2.setText("محرم");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q23();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q23() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q29);
        ans1.setText("نوح (ع)");
        ans2.setText("صالح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q24();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q24() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q4);
        ans1.setText("15");
        ans2.setText("30");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q25();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q25() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q18);
        ans1.setText("5 مرات");
        ans2.setText("مرة واحدة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q26();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q26()
    {
        RandomArray q = new RandomArray();
        Button as1   = (Button) findViewById(R.id.ans1);
        Button as2   = (Button) findViewById(R.id.ans2);
        TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q19);
        as1.setText("مرة واحدة");
        as2.setText("3 مرات");

        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q27();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q27() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q31);
        ans1.setText("1500 سنة");
        ans2.setText("1000 سنة");

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q28();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;

            }
        });

    }


    public void Q28() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q12);
        ans1.setText("28 سورة");
        ans2.setText("86 سورة");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q29();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q29() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q100);
        ans1.setText("النبي إبراهيم (ع)");
        ans2.setText("النبي داوود (ع)");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q30();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q30() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q98);
        ans1.setText("عندما تآكلت عصاه");
        ans2.setText("أخبرهم وحي");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q31();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q31() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q90);
        ans1.setText("25");
        ans2.setText("29");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q32();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q32() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);


        qus.setText(q.q91);
        ans1.setText("دخلت رأسه بعوضة");
        ans2.setText("مات من العطش");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q33();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q33() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q78);
        ans1.setText("النبي هود (ع)");
        ans2.setText("النبي يوسف (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , FirstOne.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q34();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q34() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q75);
        ans1.setText("نعم");
        ans2.setText("لا");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q35();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q35() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q11);
        ans1.setText("6 سور");
        ans2.setText("11 سورة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q36();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q36() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q30);
        ans1.setText("النبي محمد (ص)");
        ans2.setText("النبي داوود (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this ,no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q37();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q37() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q34);
        ans1.setText("نعم");
        ans2.setText("لا");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q38();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q38() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q35);
        ans1.setText("إبليس");
        ans2.setText("آدم");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q39();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q39() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q38);
        ans1.setText("السبت");
        ans2.setText("الجمعة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q40();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q40() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q41);
        ans1.setText("النبي شعيب (ع)");
        ans2.setText("النبي نوح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q41();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q41() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q44);
        ans1.setText("الغرق");
        ans2.setText("الحرق");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q42();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q42() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q49);
        ans1.setText("سدوم");
        ans2.setText("الشام");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q43();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q43() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q51);
        ans1.setText("إبراهيم (ع)");
        ans2.setText("إسماعيل (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q44();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q44() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q65);
        ans1.setText("قوم ثمود");
        ans2.setText("قوم شعيب (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q45();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q45() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q63);
        ans1.setText("7 أيام");
        ans2.setText("3 أيام");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q46();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q46() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q60);
        ans1.setText("11");
        ans2.setText("10");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q47();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q47() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q57);
        ans1.setText("إسماعيل (ع)");
        ans2.setText("صالح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q48();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q48() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q54);
        ans1.setText("6 أيام");
        ans2.setText("7 أيام");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q49();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q49() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q64);
        ans1.setText("7 سنوات");
        ans2.setText("9 سنوات");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q50();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q50()
    {
        RandomArray q = new RandomArray();
        Button as1   = (Button) findViewById(R.id.ans1);
        Button as2   = (Button) findViewById(R.id.ans2);
        TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q52);
        as1.setText("أمره أن يأتي بالشمس من المغرب");
        as2.setText("أمره بإحياء الموتى");

        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q51();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q51() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q56);
        ans1.setText("المدينة المنورة");
        ans2.setText("مكة المكرمة");

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q52();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;

            }
        });

    }


    public void Q52() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q45);
        ans1.setText("قوم ثمود");
        ans2.setText("قوم عاد");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q53();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q53() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q55);
        ans1.setText("1");
        ans2.setText("4");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q54();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q54() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q59);
        ans1.setText("العرب");
        ans2.setText("الغرب");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q55();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q55
            () {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q53);
        ans1.setText("أراد حرقه بالنار");
        ans2.setText("أراد ذبحه");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q56();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q56() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q58);
        ans1.setText("الصلاة والزكاة");
        ans2.setText("الصدقة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q57();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q57() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q61);
        ans1.setText("عمران");
        ans2.setText("يعقوب");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , FirstOne.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q58();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q58() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q62);
        ans1.setText("مكة المكرمة");
        ans2.setText("مصر");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q59();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q59() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q66);
        ans1.setText("النبي شعيب (ع)");
        ans2.setText("النبي إبراهيم (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q60();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q60() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q68);
        ans1.setText("النبي موسى (ع)");
        ans2.setText("هارون");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this ,no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q61();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q61() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q71);
        ans1.setText("النبي محمد (ص)");
        ans2.setText("الخضر (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q62();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q62() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q69);
        ans1.setText("النبي موسى (ع)");
        ans2.setText("النبي صالح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q63();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q63() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q84);
        ans1.setText("عمر");
        ans2.setText("هامان");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q64();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q64() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q86);
        ans1.setText("أهل مدين");
        ans2.setText("بني إسرائيل");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q65();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q65() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q88);
        ans1.setText("11");
        ans2.setText("43");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q66();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q66() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q85);
        ans1.setText("الكهف");
        ans2.setText("اللوح");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q67();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q67() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q89);
        ans1.setText("أم موسى");
        ans2.setText("أم شعيب");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q68();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q68() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q81);
        ans1.setText("الكهف");
        ans2.setText("الطور");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q69();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q69() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q83);
        ans1.setText("100 رجل");
        ans2.setText("70 رجل");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q70();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q70() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q82);
        ans1.setText("النبي موسى (ع)");
        ans2.setText("النبي صالح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q71();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q71() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q80);
        ans1.setText("يوسف (ع)");
        ans2.setText("صالح (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q72();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q72() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q79);
        ans1.setText("الأسد");
        ans2.setText("الذئب");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q73();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q73() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q87);
        ans1.setText("الصغرى");
        ans2.setText("الكبرى");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q74();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q74()
    {
        RandomArray q = new RandomArray();
        Button as1   = (Button) findViewById(R.id.ans1);
        Button as2   = (Button) findViewById(R.id.ans2);
        TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q93);
        as1.setText("الان الله له الحديد");
        as2.setText("إحياء الموتى");

        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q75();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q75() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q77);
        ans1.setText("بسبب المال");
        ans2.setText("غيرة وحسد");

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q76();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;

            }
        });

    }


    public void Q76() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q76);
        ans1.setText("حتى لا يتعرف عليهم أحد");
        ans2.setText("خشية عليهم من العين");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q77();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q77() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q92);
        ans1.setText("هارون");
        ans2.setText("قارون");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q78();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q78() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q94);
        ans1.setText("النبي أيوب (ع)");
        ans2.setText("النبي عيسى (ع)");
        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q79();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q79() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q97);
        ans1.setText("بني إسرائيل");
        ans2.setText("قوم شعيب (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q80();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q80() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);


        qus.setText(q.q96);
        ans1.setText("النبي داوود (ع)");
        ans2.setText("النبي محمد (ص)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q81();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q81() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q95);
        ans1.setText("الأنبياء - البقرة");
        ans2.setText("الأنبياء - ص");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , FirstOne.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q82();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q82() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q99);
        ans1.setText("النبي شعيب (ع)");
        ans2.setText("النبي داوود (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q83();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q83() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q74);
        ans1.setText("زليخة");
        ans2.setText("رقية");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q84();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q84() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q67);
        ans1.setText("قوم عاد");
        ans2.setText("أهل مدين");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this ,no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q85();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q85() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q70);
        ans1.setText("مكة المكرمة");
        ans2.setText("مدين");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q86();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q86() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q37);
        ans1.setText("النبي موسى (ع)");
        ans2.setText("النبي عيسى (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q87();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q87() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q72);
        ans1.setText("النبي يوسف (ع)");
        ans2.setText("النبي موسى (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q88();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q88() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q50);
        ans1.setText("النبي نوح (ع)");
        ans2.setText("النبي إبراهيم (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q89();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q89() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q40);
        ans1.setText("قابيل");
        ans2.setText("هابيل");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q90();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q90() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q39);
        ans1.setText("الغراب");
        ans2.setText("وحي من الله");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q91();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q91() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q42);
        ans1.setText("سام");
        ans2.setText("حام");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q92();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
    }


    public void Q92() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q43);
        ans1.setText("سليمان وعيسى (ع)");
        ans2.setText("نوح ولوط (ع)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q93();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q93() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q13);
        ans1.setText("86 سورة");
        ans2.setText("28 سورة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this , no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q94();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q94() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q14);
        ans1.setText("سورة الناس");
        ans2.setText("سورة العلق");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q95();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q95() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q17);
        ans1.setText("2698 مرة");
        ans2.setText("2968 مرة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            soundOf();
                            Q96();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q96() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        soundOn();

        qus.setText(q.q16);
        ans1.setText("13 حرف");
        ans2.setText("11 حرف");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q97();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
    }


    public void Q97() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q21);
        ans1.setText("سورة العلق");
        ans2.setText("سورة الحمد");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q98();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q98() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q22);
        ans1.setText("سورة النصر");
        ans2.setText("سورة الكوثر");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q99();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q99() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q23);
        ans1.setText("النبي آدم (ع)");
        ans2.setText("النبي محمد (ص)");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish() {
                            i = 0;
                            timer();
                            Q100();
                            TheScore();
                            scr.setText(score + " / " + nq);
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }


    public void Q100() {
        RandomArray q = new RandomArray();
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final TextView qus = (TextView) findViewById(R.id.Question);
        final TextView scr = (TextView) findViewById(R.id.score);

        qus.setText(q.q32);
        ans1.setText("865 سنة");
        ans2.setText("1000 سنة");
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "النهاية...أحسنت :)", Toast.LENGTH_SHORT).show();
                i++;
                if(i > 0)
                {
                    timerOff();
                    CountDownTimer t = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished)
                        {

                        }

                        @Override
                        public void onFinish()
                        {
                            finish();
                        }
                    }.start();
                }
                else
                {

                }
                i = -10;
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ask1.this, no.class);
                startActivity(i);
            }
        });
    }





}


