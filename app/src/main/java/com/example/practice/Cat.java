package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Cat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        setKnowMoreListener();
    }

    private void setKnowMoreListener() {
        Button button = findViewById(R.id.button_know_more);
        button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "KNOW MORE clicked", Toast.LENGTH_SHORT).show());
    }
}