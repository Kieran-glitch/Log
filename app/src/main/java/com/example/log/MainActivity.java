package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        customdatatype d[]=new customdatatype[3];
        d[0]=new customdatatype("James","0773850767","Male");
        d[1]=new customdatatype("Susan","077123321","Female");
        d[2]=new customdatatype("Jack","0745678910","Male");
        Random rn=new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=rn.nextInt(3-0)+0;
                Log.i("Person we got","Name:"+d[num].name+" Number:"+d[num].number+" Gender:"+d[num].gender);
            }
        });

    }
}