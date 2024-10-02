package com.example.myshed;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class AttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        ListView attendanceList = findViewById(R.id.attendance_list);

        // Implement attendance list logic here
        // For example, you can use a database to store attendance records
        String[] attendanceRecords = {"Record 1", "Record 2", "Record 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, attendanceRecords);
        attendanceList.setAdapter(adapter);
    }
}