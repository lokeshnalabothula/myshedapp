package com.example.myshed;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button attendanceButton = findViewById(R.id.attendance_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button timeOffButton = findViewById(R.id.time_off_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button profileButton = findViewById(R.id.profile_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button leaveButton = findViewById(R.id.leave_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button holidayButton = findViewById(R.id.holiday_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button payrollButton = findViewById(R.id.payroll_button);

        attendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });

        timeOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeOffActivity.class);
                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeaveActivity.class);
                startActivity(intent);
            }
        });

        holidayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HolidayActivity.class);
                startActivity(intent);
            }
        });

        payrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayrollActivity.class);
                startActivity(intent);
            }
        });
    }
}