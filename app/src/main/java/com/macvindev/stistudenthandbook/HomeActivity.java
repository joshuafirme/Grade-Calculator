package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton, stihymnImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        calculatorImageButton = findViewById(R.id.calculatorImageButton);
        stihymnImageButton = findViewById(R.id.stihymnImageButton);

        calculatorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToGradeCalculator = new Intent (HomeActivity.this, GradeCalculator.class);
                startActivity(intentToGradeCalculator);
            }
        });

        stihymnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToSTIHymn = new Intent (HomeActivity.this, STIHymn.class);
                startActivity(intentToSTIHymn );
            }
        });
    }
}