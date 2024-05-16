package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonListenerFirst();
        setButtonListenerSecond();
        setButtonListenerThird();
    }

    private void setButtonListenerFirst() {
        Button button = findViewById(R.id.button_first);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FoodChoose.class);
            startActivity(intent);
        });
    }
    private void setButtonListenerSecond() {
        Button button = findViewById(R.id.button_second);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Cat.class);
            startActivity(intent);
        });
    }
    private void setButtonListenerThird() {
        Button button = findViewById(R.id.button_third);
        button.setOnClickListener(view -> Toast.makeText(getApplicationContext(),
                "No handler for this button",
                Toast.LENGTH_SHORT).show());
    }
}