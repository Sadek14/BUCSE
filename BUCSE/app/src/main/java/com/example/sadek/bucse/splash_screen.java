package com.example.sadek.bucse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();

    }
}
