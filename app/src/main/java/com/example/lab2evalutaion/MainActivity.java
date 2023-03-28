package com.example.lab2evalutaion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.send_button_id); // R.id shows list of ids available in my application
        e = findViewById(R.id.send_text_id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e.getText().toString();
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                intent.putExtra("userName", str);
                startActivity(intent);
            }
        });
    }
}




