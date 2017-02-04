package com.android.techacademy4calc.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);

        editText2 = (EditText) findViewById(R.id.editText2);

        //＋
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        //ー
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        //×
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        //÷
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("VALUE1", Double.parseDouble(editText1.getText().toString()));
        intent.putExtra("VALUE2", Double.parseDouble(editText2.getText().toString()));

        if (v.getId() == R.id.button1) {
            Log.v("Button","1");
            intent.putExtra("arg",button1.getText().toString());
        } else if (v.getId() == R.id.button2) {
            Log.v("Button","2");
            intent.putExtra("arg", button2.getText().toString());
        } else if (v.getId() == R.id.button3) {
            Log.v("Button","3");
            intent.putExtra("arg", button3.getText().toString());
        } else if (v.getId() == R.id.button4) {
            Log.v("Button","4");
            intent.putExtra("arg", button4.getText().toString());
        }
        startActivity(intent);
    }
}
