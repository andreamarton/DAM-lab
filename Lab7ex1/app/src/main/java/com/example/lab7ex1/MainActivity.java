package com.example.lab7ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    BatteryRec batteryRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        batteryRec=new BatteryRec(tv);
        registerReceiver(batteryRec,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryRec);
    }
}