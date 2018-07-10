package com.alshabib.theghost02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class game1 extends AppCompatActivity {

    Button b1;
    Button b2;
    TextView num;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        num = (TextView) findViewById(R.id.num);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here1();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void here1()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here2();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here2()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here3();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here3()
    {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here4();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here4()
    {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here5();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here5()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here6();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here6()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here7();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here7()
    {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here8();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here8()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here9();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here9()
    {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                here10();
                i++;
                num.setText(i+"/10");
                Toast.makeText(getBaseContext() , "الشيطان ليس هنا :)" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void here10()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(game1.this , no.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext() , "لقد تمكنت من الهروب من الشيطان !" , Toast.LENGTH_LONG).show();
                i++;
                num.setText(i+"/10");
                Intent i = new Intent(game1.this , connection.class);
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
