// 07 April 2020
// 10118396
// Azzuhra
// IF-9

package com.example.tugas1_akb_if_9_10118396;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button logOutButton;
    CardView cardProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        logOutButton = findViewById(R.id.logoutButton);


        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToLogin = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intentToLogin);
                finish();
            }
        });


        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToProfile = new Intent(MainActivity.this, ProfileActivity.class);

                startActivity(intentToProfile);
            }
        });
    }
}