// 07 April 2020
// 10118396
// Azzuhra
// IF-9

package com.example.tugas1_akb_if_9_10118396;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().hide();
    }
}