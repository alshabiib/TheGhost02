package com.alshabib.theghost02;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class engame extends AppCompatActivity {

    Button b1;
    Button b2;
    TextView s;
    TextView word;
    TextView sh;
    int sc = 1;
    int ti = 25;
    //Timer
    CountDownTimer t = new CountDownTimer(27000,1000)
    {
        @Override
        public void onTick(long millisUntilFinished)
        {
            sh.setText(" سيظهر الشيطان بعد "+ti+" ثانية ");
            ti--;
        }

        @Override
        public void onFinish()
        {
            Intent i = new Intent(engame.this , no.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engame);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        sh = (TextView) findViewById(R.id.shit);
        s = (TextView) findViewById(R.id.score);
        word = (TextView) findViewById(R.id.words);
        t.start();

        word.setText("play");
        b1.setText("يلعب");
        b2.setText("يشرب");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q2();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "الإجابة الصحيحة: يلعب" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });

    }

    public void q2()
    {
        word.setText("lid");
        b1.setText("مفتاح");
        b2.setText("غطاء");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q3();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: غطاء" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q3()
    {
        word.setText("drive");
        b1.setText("يقود");
        b2.setText("يغرق");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q4();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: يقود" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q4()
    {
        word.setText("student");
        b1.setText("طالب");
        b2.setText("لاعب");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q5();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: طالب" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q5()
    {
        word.setText("example");
        b2.setText("مثال");
        b1.setText("اختيار");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q6();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: مثال" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q6()
    {
        word.setText("grow");
        b1.setText("يجري");
        b2.setText("ينمو");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q7();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: ينمو" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q7()
    {
        word.setText("will");
        b1.setText("ذهب");
        b2.setText("سوف");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q8();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: سوف" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q8()
    {
        word.setText("become");
        b1.setText("يصبح");
        b2.setText("يمنع");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q9();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: يصبح" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q9()
    {
        word.setText("wealth");
        b2.setText("ثروة");
        b1.setText("طقس");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q10();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: ثروة" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q10()
    {
        word.setText("modest");
        b2.setText("خجول");
        b1.setText("متواضع");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q11();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: متواضع" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q11()
    {
        word.setText("widow");
        b1.setText("بخيل");
        b2.setText("أرملة");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q12();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: أرملة" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q12()
    {
        word.setText("holiday");
        b1.setText("عيد ميلاد");
        b2.setText("إجازة");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q13();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: إجازة" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q13()
    {
        word.setText("bow");
        b2.setText("شريط");
        b1.setText("قوس");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q14();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: قوس" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q14()
    {
        word.setText("urgent");
        b1.setText("شرير");
        b2.setText("عاجل");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q15();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: عاجل" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q15()
    {
        word.setText("treasure");
        b2.setText("درجة الحرارة");
        b1.setText("كنز");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q16();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: كنز" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q16()
    {
        word.setText("immense");
        b1.setText("مثير");
        b2.setText("هائل");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q17();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: هائل" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q17()
    {
        word.setText("shave");
        b1.setText("رحلة");
        b2.setText("حلاقة");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q18();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: حلاقة" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q18()
    {
        word.setText("cote");
        b1.setText("قطة");
        b2.setText("كوخ");
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q19();
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: كوخ" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q19()
    {
        word.setText("feather");
        b2.setText("أب");
        b1.setText("ريشة");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sc++;
                s.setText(sc+" /20");
                q20();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: ريشة" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q20()
    {
        word.setText("invention");
        b2.setText("معهد");
        b1.setText("اختراع");
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               finish();
                Toast.makeText(getBaseContext() , "أحسنت :)" , Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: اختراع" , Toast.LENGTH_LONG).show();
                Intent i = new Intent(engame.this , no.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        t.cancel();
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
