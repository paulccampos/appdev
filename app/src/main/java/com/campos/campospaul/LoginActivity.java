package com.campos.campospaul;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.username_input);
        EditText password = findViewById(R.id.password_input);
        Button login = findViewById(R.id.login_button);

        login.setOnClickListener(view -> {
            if (username.getText().toString().trim().isEmpty()
                    || password.getText().toString().isEmpty()) {
                Toast.makeText(this, "Enter a username and password to continue.", Toast.LENGTH_SHORT).show();
                return;
            }

            startActivity(new Intent(this, DashboardActivity.class));
        });
    }
}
