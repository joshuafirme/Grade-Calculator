package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button goToHomeButton;
    EditText edit_username, edit_password;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToHomeButton = findViewById(R.id.goToHome_Button);
        edit_username = findViewById(R.id.edit_username);
        edit_password = findViewById(R.id.edit_password);

        goToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = "joshuafirme@gmail.com";
                password = "123";
                if(edit_username.getText().toString().equals(username)
                        && edit_password.getText().toString().equals(password)){

                    Intent intentToGoHome = new Intent(MainActivity.this, HomeActivity.class);
                    intentToGoHome.putExtra("username", username);
                    intentToGoHome.putExtra("password", password);
                    startActivity(intentToGoHome);
                }
                else {
                    Toast.makeText(MainActivity.this, "Username or password are incorrect!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}