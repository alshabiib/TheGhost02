package com.alshabib.theghost02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class whosay extends AppCompatActivity {

    int s = 1;
    TextView qu;
    TextView sc;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whosay);

        qu = (TextView) findViewById(R.id.qu);
        sc = (TextView) findViewById(R.id.sc);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        qu.setText("يعد العدول عن الخطأ أفضل شيء يقوم به الإنسان على الإطلاق، تماما كالإعلان عن حقيقة جديدة");
        b1.setText("جوزيف ليستر");
        b2.setText("آينشتاين");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q2();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: جوزيف ليستر" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });

    }

    public void q2()
    {
        qu.setText("الحرية تستحق الثمن الذي يدفع من أجلها");
        b1.setText("جول فيرن");
        b2.setText("لودفيج بيتهوفن");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q3();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: جول فيرن" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q3()
    {
        qu.setText("العقبات وجدت لكي نتخطاها");
        b1.setText("نيوتن");
        b2.setText("صامويل هو");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q4();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: جول فيرن" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q4()
    {
        qu.setText("أنا لا أخشى العواصف، لأنني تعلمت جيدا كيف أبحر بسفينتي");
        b1.setText("لويزا ألكوت");
        b2.setText("جول فيرن");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q5();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: لويزا ألكوت" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q5()
    {
        qu.setText("اقرأ بينما تنتظر، اقرأ بينما تأكل، اقرأ بينما تتمرن");
        b1.setText("جوزيف ليستر");
        b2.setText("نينا");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q6();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: ألفريد نوبل" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q6()
    {
        qu.setText("الناجحون أناس يبحثون عن ظروف مواتية، وان لم يجدوها صنعوها");
        b1.setText("جورج شو");
        b2.setText("رونالد ريغان");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q7();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: جورج شو" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q7()
    {
        qu.setText("أنا لا أخفي أبدا حقيقة أن هدفي الوحيد هو أن أكون الأفضل");
        b1.setText("ميسي");
        b2.setText("كريستيانو");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q8();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: كريستيانو" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q8()
    {
        qu.setText("لا تتوقف كثيرا عند البدايات أو الفشل، وفي كل مرة تسقط ابدأ من جديد، فسوف تصبح أقوى وتحقق إنجازك الذي سيخلد ذكراك");
        b1.setText("بلجيتس");
        b2.setText("آن سوليفان");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q9();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: آن سوليفان" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q9()
    {
        qu.setText("من المهم أن تصنع لك حلما في الحياة، ولكن الأهم هو أن تجعله حقيقة");
        b1.setText("مارك");
        b2.setText("ماري كوري");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q10();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: ماري كوري" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q10()
    {
        qu.setText("في البدء يتجاهلونك، ثم يسخرون منك، ثم يحاربونك، ثم تنتصر");
        b1.setText("افلاطون");
        b2.setText("غاندي");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q11();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: غاندي" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q11()
    {
        qu.setText("ما حققته الآن استطيع تحقيقه منذ زمن لكن الخوف من الفشل و رأي أشخاص آخرين بي هو ما جعلني أوقف العمل على تحقيق أحلامي");
        b1.setText("نجيب محفوظ");
        b2.setText("لس براون");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q12();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: لس براون" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q12()
    {
        qu.setText("لا أحد منا يستطيع تغيير ماضية ولكننا قادرون على تغيير مستقبلنا");
        b1.setText("مارك");
        b2.setText("كولين باول");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q13();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: كولين باول" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q13()
    {
        qu.setText("في لفظ القمة شيء يقول لك: قم");
        b1.setText("راجي الراعي");
        b2.setText("نيمار");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q14();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: راجي الراعي" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q14()
    {
        qu.setText("يتمتع القادة بتعدد الرؤى مع وجو إحساس بسيط بالخوف لديهم، ولا يلقون بالا للعقبات التي تواجههم");
        b1.setText("روبرت جارفيك");
        b2.setText("لس براون");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q15();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: روبرت جارفيك" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q15()
    {
        qu.setText("لم يصبح أي إنسان رائعا أو متميزا إلا من خلال ارتكابه أخطاء عديدة وكبيرة");
        b1.setText("ألفريد نوبل");
        b2.setText("جلادستون");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s++;
                sc.setText(s+"/16");
                q16();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: جلادستون" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
    }

    public void q16()
    {
        qu.setText("ليس هناك مايعرف بالشخص العادي، لأنه مادام لديك عقل طبيعي فأنت شخص متميز");
        b1.setText("نيوتن");
        b2.setText("بن كارسون");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "أحسنت :)" , Toast.LENGTH_SHORT).show();
                s++;
                sc.setText(s+"/16");
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "الإجابة الصحيحة: بن كارسون" , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(whosay.this , no.class);
                startActivity(i);
            }
        });
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
