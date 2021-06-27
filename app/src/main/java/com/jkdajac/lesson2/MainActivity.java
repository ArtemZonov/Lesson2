package com.jkdajac.lesson2;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = findViewById(R.id.tvText);

        int a = 70; //ввести возраст пассажира
        boolean b = true; //true, если оплатил проезд. Иначе false
        boolean c = false; //true, если предъявил пенсионное удостоверение. Иначе false


        if (a>0 && a<18){
            textview.setBackgroundColor(Color.GREEN);
            textview.setText("You are a child! Your tolls is free! ");
        }

        if(a>=18 && a<65){

            if(b){
                textview.setBackgroundColor(Color.GREEN);
                textview.setText("You are adult man! Come in!");
            }else {
                textview.setBackgroundColor(Color.RED);
                textview.setText("You are adult man! Please, pay the fare!");
            }
        }
        if(a>=65){
            if(c){
                textview.setBackgroundColor(Color.GREEN);
                textview.setText("You are an old man! Come in!");
            }else{
                textview.setBackgroundColor(Color.RED);
                textview.setText("You are an old man! Please, present a pension certificate!");
            }
        }



    }
}