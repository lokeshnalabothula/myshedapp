package com.example.myshed;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class TimeOffActivity extends AppCompatActivity {
    private EditText timeOffReasonEditText;
    private EditText timeOffDateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_off);

        timeOffReasonEditText = findViewById(R.id.time_off_reason);
        timeOffDateEditText = findViewById(R.id.time_off_date);
        Button requestTimeOffButton = findViewById(R.id.request_time_off_button);

        requestTimeOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String timeOffReason = timeOffReasonEditText.getText().toString();
                String timeOffDate = timeOffDateEditText.getText().toString();

                // Implement time off request logic here
                // For example, you can use a database to store time off requests
                Toast.makeText(TimeOffActivity.this, "Time off requested successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}