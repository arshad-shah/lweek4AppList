package com.example.lweek4applist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] ListItems = {"item1","item2","item3", "item4", "item5", "item6", "item7", "item8", "item9", "item10", "item11"};

        final ListView List = findViewById(R.id.List);
        ArrayAdapter<String> ListAdapter =
                new ArrayAdapter<String>(this, R.layout.listitem, ListItems);

        List.setAdapter(ListAdapter);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
                String clickedItem = arg0.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, clickedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}