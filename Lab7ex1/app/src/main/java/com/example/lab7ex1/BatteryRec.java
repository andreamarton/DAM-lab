package com.example.lab7ex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class BatteryRec extends BroadcastReceiver {

    TextView tv;
    BatteryRec(TextView tv){
        this.tv=tv;

    }
    @Override
    public void onReceive(Context context, Intent intent) {

        int procent=intent.getIntExtra("level",0);
        if(procent!=0)
        {
            tv.setText(procent+"%");
        }
        if(procent<=20)
        {
            Toast.makeText(context.getApplicationContext(), "Low Battery",Toast.LENGTH_LONG).show();
        }
    }
}
