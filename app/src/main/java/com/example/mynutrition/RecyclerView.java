package com.example.mynutrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {
    private static final String TAG = "RecyclerView";

    //vars
    private ArrayList<Consumable> mConsumables = new ArrayList<Consumable>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Consumable item = (Consumable) intent.getSerializableExtra("NEW_ITEM");


        mImageUrls.add("https://media.istockphoto.com/photos/double-cheese-burger-picture-id945057664?k=6&m=945057664&s=612x612&w=0&h=RUo4h_hgeBaExePasl-2YDhEMp4iKKScKpxX_mXlJVY=");
        mNames.add(item.getName());

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
