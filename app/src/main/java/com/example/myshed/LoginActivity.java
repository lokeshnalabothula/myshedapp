package com.example.myshed;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText mobileNumberEditText;
    private EditText otpEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mobileNumberEditText = findViewById(R.id.mobile_number);
        otpEditText = findViewById(R.id.otp);
        Button loginButton = findViewById(R.id.login_button);
        Button sendOtpButton = findViewById(R.id.send_otp_button);

        sendOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = mobileNumberEditText.getText().toString();
                // Send OTP to the mobile number using your preferred method
                // For example, you can use an SMS gateway API to send the OTP
                Toast.makeText(LoginActivity.this, "OTP sent successfully", Toast.LENGTH_SHORT).show();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = mobileNumberEditText.getText().toString();
                String otp = otpEditText.getText().toString();
                // Verify the OTP using your preferred method
                // For example, you can use an SMS gateway API to verify the OTP
                if (verifyOtp(mobileNumber, otp)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean verifyOtp(String mobileNumber, String otp) {
        // Implement OTP verification logic here
        // For example, you can use an SMS gateway API to verify the OTP
        return true; // Replace with actual verification logic
    }
}