package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.theList);
        Log.d(TAG, "onCreate: Started");

        ArrayList<String> names = new ArrayList<>();
        names.add("Jhon");
        names.add("Vatsal");
        names.add("Priyesh");
        names.add("Dhaval");
        names.add("Jeel");
        names.add("ABC");
        names.add("XYZ");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);

    }
}