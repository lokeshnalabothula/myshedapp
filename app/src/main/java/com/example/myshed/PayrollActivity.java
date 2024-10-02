package com.example.myshed;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myshed.R;

public class PayrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payroll);

        ListView payrollList = findViewById(R.id.payroll_list);

        // Implement payroll list logic here
        // For example, you can use a database to store payroll information
        String[] payrolls = {"Payroll 1", "Payroll 2", "Payroll 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, payrolls);
        payrollList.setAdapter(adapter);
    }
}