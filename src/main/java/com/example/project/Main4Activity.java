package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    Integer no1 = 0;
    String s1;
    Button b5;
    public static final String Extratext="Hello";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);

        tv1 = findViewById(R.id.t1);
        tv2 = findViewById(R.id.t2);
        tv3 = findViewById(R.id.t3);
        tv4 = findViewById(R.id.t4);
        b5 = findViewById(R.id.Amount);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = no1 + 100;
                s1 = no1.toString();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = no1 + 150;
                s1 = no1.toString(no1);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = no1 + 180;
                s1 = no1.toString(no1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = no1 + 120;
                s1 = no1.toString(no1);

            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2activity();
            }
        });
    }
    public void open2activity(){
        Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
        intent.putExtra(Extratext,s1);
        startActivity(intent);

    }
}
