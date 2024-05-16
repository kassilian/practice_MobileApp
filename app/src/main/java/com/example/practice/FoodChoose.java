package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class FoodChoose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_choose);

        setToggleButtonHandler();
        setCheckboxHandlers();
    }

    private void setToggleButtonHandler() {
        ToggleButton toggle = findViewById(R.id.toggle_with_you);
        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(getApplicationContext(),
                        "\"With You\" enabled",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "\"With You\" disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void setCheckboxHandlers() {
        findViewById(R.id.checkbox_whopper).setOnClickListener(this::onCheckboxClicked);
        findViewById(R.id.checkbox_fry).setOnClickListener(this::onCheckboxClicked);
        findViewById(R.id.checkbox_beverages).setOnClickListener(this::onCheckboxClicked);
        findViewById(R.id.checkbox_sauce).setOnClickListener(this::onCheckboxClicked);
        findViewById(R.id.checkbox_desert).setOnClickListener(this::onCheckboxClicked);
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        StringBuilder stringBuilder = new StringBuilder();
        if (view.getId() == R.id.checkbox_whopper) {
            stringBuilder.append("whopper");
        } else if (view.getId() == R.id.checkbox_fry) {
            stringBuilder.append("fry");
        } else if (view.getId() == R.id.checkbox_beverages) {
            stringBuilder.append("beverages");
        } else if (view.getId() == R.id.checkbox_sauce) {
            stringBuilder.append("sauce");
        } else if (view.getId() == R.id.checkbox_desert) {
            stringBuilder.append("desert");
        }

        if (checked) {
            stringBuilder.append(" enabled");
        } else {
            stringBuilder.append(" disabled");
        }

        Toast.makeText(getApplicationContext(),
                stringBuilder.toString(),
                Toast.LENGTH_SHORT).show();
    }
}