package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make Numbers view clickable and send Intent to open NumbersActivity
        TextView numbersView = findViewById(R.id.numbers);
        numbersView.setOnClickListener((View v) -> startActivity(new Intent(getApplicationContext(), NumbersActivity.class)));

        //make Family view clickable and send Intent to open FamilyActivity
        TextView familyView = findViewById(R.id.family);
        familyView.setOnClickListener((View v) -> startActivity(new Intent(getApplicationContext(), FamilyActivity.class)));

        //make Colors view clickable and send Intent to open ColorsActivity
        TextView colorsView = findViewById(R.id.colors);
        colorsView.setOnClickListener((View v) -> startActivity(new Intent(getApplicationContext(), ColorsActivity.class)));

        //make Phrases view clickable and send Intent to open PhrasesActivity
        TextView phrasesView = findViewById(R.id.phrases);
        phrasesView.setOnClickListener((View v) -> startActivity(new Intent(getApplicationContext(), PhrasesActivity.class)));

    }


}