package com.example.mynutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

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

    /**
     * Called when the user taps the Submit button
     */
    public void submit(View view) {
        //creates a Consumable based on the info in the input boxes
        String name = ((EditText) findViewById(R.id.foodname)).getText().toString();
        HashMap<String, Integer> nutriInfo = new HashMap<String, Integer>();
        ViewGroup layout = (ViewGroup) findViewById(R.id.inputFields);
        int servings = Integer.valueOf(((EditText) findViewById(R.id.servingsDisplay)).
                getText().toString());
        String[] keys = {"calories", "fat", "cholesterol", "sodium", "carbs", "protein"};
        for (int i = 1; i < layout.getChildCount(); i++) {
            View child = layout.getChildAt(i);
            if (child instanceof EditText) {
                EditText editText = (EditText) child;
                Integer value = Integer.valueOf(editText.getText().toString());
                nutriInfo.put(keys[i - 1], servings * value);
            }
        }
        Consumable item = new Consumable(name, nutriInfo, servings);
        Intent intent = new Intent(this, RecyclerView.class);
        intent.putExtra("NEW_ITEM", item);
        startActivity(intent);


    }
}
