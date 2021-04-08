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

public class LoginActivity  extends AppCompatActivity {
    TextView registerText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        registerText = findViewById(R.id.registerText);
        loginButton = findViewById(R.id.loginButton);

        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToRegister = new Intent(LoginActivity.this, RegisterActivity.class);

                startActivity(intentToRegister);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToMain = new Intent(LoginActivity.this, MainActivity.class);

                startActivity(intentToMain);
                finish();
            }
        });
    }
}
