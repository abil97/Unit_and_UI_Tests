package com.example.utests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        text = findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String surname = intent.getStringExtra("SURNAME");

        text.setText(name + " " + surname);
    }

}
