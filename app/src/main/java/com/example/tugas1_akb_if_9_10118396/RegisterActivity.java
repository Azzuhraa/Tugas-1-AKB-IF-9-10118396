// 07 April 2020
// 10118396
// Azzuhra
// IF-9

package com.example.tugas1_akb_if_9_10118396;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    TextView loginText;
    Button registerButton;


    private void toLogin() {
        Intent intentToLogin = new Intent(RegisterActivity.this, LoginActivity.class);

        startActivity(intentToLogin);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();


        loginText = findViewById(R.id.loginText);
        registerButton = findViewById(R.id.registerButton);


        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }
        });


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }
        });
    }
}

