package com.kimbaro.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kimbaro.myapplication.util.BT_check;

public class MainActivity extends AppCompatActivity {

    Button button = null;
    TextView textView = null;
    Activity activity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        button = findViewById(R.id.bt1);
        textView = findViewById(R.id.tv1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BT_check bt_check = new BT_check(activity, textView);
                bt_check.checkBluetooth();

            }
        });
    }
}
