package com.example.utests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameField, surnameField;
    Button sendButton;
    String name, surname;
    public static final String TAG = "Tag";
    final String message = "ERROR!\n Input should be latin\n" +
            "characters with one uppercase\n letter at the beginning followed\n" +
            "by lowercase letters\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.nameField);
        surnameField = findViewById(R.id.surnameField);
        sendButton = findViewById(R.id.button);



        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameField.getText().toString();
                surname = surnameField.getText().toString();

                if (checkCorrectInput(name) && checkCorrectInput(surname)) {
                    sendMessage(name, surname);
                } else {
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public static boolean checkCorrectInput(String input){

        return input.length() > 0 && input.matches("^[A-Z][a-z]+$");

    }

    public void sendMessage(String name, String surname){

            Intent intent = new Intent(this, ReceiverActivity.class);
            intent.putExtra("NAME", name);
            intent.putExtra("SURNAME", surname);
            startActivity(intent);
    }
}
