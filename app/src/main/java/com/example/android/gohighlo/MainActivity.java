package com.example.android.gohighlo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int num = random.nextInt(20);

    public void game(View view) {
        EditText editText = findViewById(R.id.edtext);
        int guess = Integer.parseInt(editText.getText().toString());
        if (num == guess) {
            Toast.makeText(MainActivity.this, "you did it!", Toast.LENGTH_SHORT).show();
        } else if (num < guess) {
            Toast.makeText(MainActivity.this, "go low", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "go high", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


