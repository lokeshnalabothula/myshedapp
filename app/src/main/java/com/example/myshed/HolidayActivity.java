package com.example.myshed;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class HolidayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);

        ListView holidayList = findViewById(R.id.holiday_list);

        // Implement holiday list logic here
        // For example, you can use a database to store holiday information
        String[] holidays = {"Holiday 1", "Holiday 2", "Holiday 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, holidays);
        holidayList.setAdapter(adapter);
    }
}