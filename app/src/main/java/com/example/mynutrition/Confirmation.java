package com.example.mynutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        // Capture the layout's calorie display and set the int as its text
        EditText calorieDisplay = findViewById(R.id.calorieDisplay);
        calorieDisplay.setText(extras.getString("CALORIES"));

        // Capture the layout's calorie display and set the int as its text
        EditText fatDisplay = findViewById(R.id.fatDisplay);
        fatDisplay.setText(extras.getString("TOTAL_FAT"));
    }
}
