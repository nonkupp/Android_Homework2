package com.mojilo.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // code ที่ต้องการให้ทำงานหลังจาก delay 3 sec
                Intent intent = new Intent( /*context = activity_splash.this สิ่งที่ต้องการให้โชว์ , class name activity ที่เราต้องการ link (ปลายทาง)  */SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // closed splash
            }
        }, 3000);
    }
}

