package com.example.lab2evalutaion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        String s = i.getStringExtra("userName" );

        TextView tv = findViewById(R.id.received_value_id);
        tv.setText("HELLO "+ s + "!");
    }
}