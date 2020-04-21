package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent=getIntent();
        String text=intent.getStringExtra(Main4Activity.Extratext);
        tv1=findViewById(R.id.t2);
        tv1.setText(text);
    }
}
