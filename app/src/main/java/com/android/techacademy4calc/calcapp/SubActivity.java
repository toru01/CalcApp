package com.android.techacademy4calc.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0.0);
        double value2 = intent.getDoubleExtra("VALUE2", 0.0);
        String argument1 = intent.getStringExtra("arg");

        TextView textView = (TextView) findViewById(R.id.textView);

        if (argument1.equals("＋")) {
            Log.v("Button", argument1);
            textView.setText("計算結果: " + String.valueOf(value1 + value2));
        } else if (argument1.equals("ー")) {
            textView.setText("計算結果: " + String.valueOf(value1 - value2));
        } else if (argument1.equals("×")){
            textView.setText("計算結果: " + String.valueOf(value1 * value2));
        } else if(argument1.equals("÷")) {
            textView.setText("計算結果: " + String.valueOf(value1 / value2));
        }
    }
}
