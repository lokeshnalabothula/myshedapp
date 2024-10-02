package com.example.myshed;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class LeaveActivity extends AppCompatActivity {
    private EditText leaveReasonEditText;
    private EditText leaveDateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        leaveReasonEditText = findViewById(R.id.leave_reason);
        leaveDateEditText = findViewById(R.id.leave_date);
        Button requestLeaveButton = findViewById(R.id.request_leave_button);

        requestLeaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String leaveReason = leaveReasonEditText.getText().toString();
                String leaveDate = leaveDateEditText.getText().toString();

                // Implement leave request logic here
                // For example, you can use a database to store leave requests
                Toast.makeText(LeaveActivity.this, "Leave requested successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}