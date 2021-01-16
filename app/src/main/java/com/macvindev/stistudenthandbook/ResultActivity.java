package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView text_result = findViewById(R.id.text_result);
        Bundle data = getIntent().getExtras();
        String result = data.getString("result");
        text_result.setText(result);
    }
}
