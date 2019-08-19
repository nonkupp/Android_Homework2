package com.mojilo.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast t = Toast.makeText(LoginActivity.this , "Welcome to My ToDo application!", Toast.LENGTH_SHORT); //long_short 2-3sec long 4-5 sec
        t.show();
    }
}
