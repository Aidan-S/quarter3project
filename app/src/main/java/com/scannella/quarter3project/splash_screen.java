package com.scannella.quarter3project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);

            }
        }, 5000);

    }


    /*private Handler handler = new Handler();
    private Runnable runnable = new Runnable(){
        @Override
        public void run() {

        }
    };*/



    final Handler handler = new Handler();




}
