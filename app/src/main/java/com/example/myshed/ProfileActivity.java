package com.example.myshed;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class ProfileActivity extends AppCompatActivity {
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText phoneNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        phoneNumberEditText = findViewById(R.id.phone_number);
        Button saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phoneNumber = phoneNumberEditText.getText().toString();

                // Implement profile save logic here
                // For example, you can use a database to store profile information
                Toast.makeText(ProfileActivity.this, "Profile saved successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}