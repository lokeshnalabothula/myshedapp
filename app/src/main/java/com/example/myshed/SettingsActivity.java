package com.example.myshed;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch notificationSwitch = findViewById(R.id.notification_switch);
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch locationSwitch = findViewById(R.id.location_switch);
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch dataSyncSwitch = findViewById(R.id.data_sync_switch);
        Button logoutButton = findViewById(R.id.logout_button);

        notificationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle notification switch change
            }
        });

        locationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle location switch change
            }
        });

        dataSyncSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle data sync switch change
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout button click
            }
        });
    }
}