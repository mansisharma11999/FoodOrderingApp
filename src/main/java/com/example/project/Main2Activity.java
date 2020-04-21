package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    ListView l1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l1=findViewById(R.id.lv1);
        final String values[]={"Dominos","Pizza hut"};

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        Intent intend = new Intent(Main2Activity.this, Main3Activity.class);
                        startActivity(intend);
                        break;
                    case 1:
                        Intent intend1 = new Intent(Main2Activity.this, Main4Activity.class);
                        startActivity(intend1);
                        break;
                }


            }
        });

    }
}
