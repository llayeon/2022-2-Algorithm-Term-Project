package com.example.socialdistance;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       View rectangle_7 = findViewById(R.id.rectangle_7);
       View chalkboard = findViewById(R.id.chalkboard);

       chalkboard.bringToFront();
    }
}