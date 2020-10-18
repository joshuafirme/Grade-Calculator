package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class GradeCalculator extends AppCompatActivity {

    EditText prelimEditText, midtermEditText, pre_finalEditText, finalEditText;
    Button clearButton, calculateButton;
    TextView averageTextView, txtViewRemarks;

    Double prelimFloat, midtermFloat, pre_finalFloat, finalFloat, averageFloat;

    RatingBar simpleRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calculator);

        // EditText
        prelimEditText = findViewById(R.id.prelimEditText);
        midtermEditText = findViewById(R.id.midtermEditText);
        pre_finalEditText = findViewById(R.id.prefinalsEditText);
        finalEditText = findViewById(R.id.finalEditText);

        // Buttons
        clearButton = findViewById(R.id.clearButton);
        calculateButton = findViewById(R.id.calculateButton);

        // TextView
        averageTextView = findViewById(R.id.averageTextView);
        txtViewRemarks = findViewById(R.id.txtViewRemarks);

        simpleRatingBar = findViewById(R.id.ratingBar);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prelimFloat = Double.parseDouble(prelimEditText.getText().toString());
                midtermFloat = Double.parseDouble(midtermEditText.getText().toString());
                pre_finalFloat =Double.parseDouble(pre_finalEditText.getText().toString());
                finalFloat = Double.parseDouble(finalEditText.getText().toString());

                // Compute Average
                averageFloat = ( prelimFloat * .20 + midtermFloat * .20 + pre_finalFloat * .20 + finalFloat * .40);

                averageTextView.setText(String.format("%.2f", averageFloat));

                if(averageFloat >= 97.50){
                    txtViewRemarks.setText("Excellent");
                    simpleRatingBar.setRating(5);
                }
                else if(averageFloat >= 88.50){
                    txtViewRemarks.setText("Very Good");
                    simpleRatingBar.setRating(4);
                }
                else if(averageFloat >= 79.50){
                    txtViewRemarks.setText("Satisfactory");
                    simpleRatingBar.setRating(3);
                }
                else if(averageFloat >= 74.50){
                    txtViewRemarks.setText("Fair");
                    simpleRatingBar.setRating(2);
                }
                else {
                    txtViewRemarks.setText("Failed");
                    simpleRatingBar.setRating(1);
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prelimEditText.getText().clear();
                midtermEditText.getText().clear();
                pre_finalEditText.getText().clear();
                finalEditText.getText().clear();
                averageTextView.setText("0.0");
            }
        });

    }
}