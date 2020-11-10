package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton, stihymnImageButton;
    TextView text_username;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        calculatorImageButton = findViewById(R.id.calculatorImageButton);
        stihymnImageButton = findViewById(R.id.stihymnImageButton);
        text_username = findViewById(R.id.text_username);

        Bundle data = getIntent().getExtras();
        username = data.getString("username");
        text_username.setText(username);

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