package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SwapperAndChecker extends AppCompatActivity {

    EditText edit_1, edit_2;
    Button btn_swap, btn_check;
    String first_val, second_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swapper_and_checker);

        edit_1 = findViewById(R.id.editText);
        edit_2 = findViewById(R.id.editText2);
        btn_swap = findViewById(R.id.btn_swap);
        btn_check = findViewById(R.id.btn_check);

        btn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_val = edit_1.getText().toString().toLowerCase();
                second_val = edit_2.getText().toString().toLowerCase();

                edit_1.setText(second_val);
                edit_2.setText(first_val);
            }
        });

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_val = edit_1.getText().toString().toLowerCase();
                second_val = edit_2.getText().toString().toLowerCase();

                if(first_val.equals(second_val)){
                    Intent intent = new Intent(SwapperAndChecker.this, ResultActivity.class);
                    intent.putExtra("result", "Same");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(SwapperAndChecker.this, ResultActivity.class);
                    intent.putExtra("result", "Not the same");
                    startActivity(intent);
                }
            }
        });
    }
}
