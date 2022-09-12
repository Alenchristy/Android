package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.e1);
        t2=findViewById(R.id.e2);
        t3=findViewById(R.id.t);

    }

    public void sum(View view) {
        float a=Float.parseFloat(String.valueOf(t1.getText()));
        float b=Float.parseFloat(String.valueOf(t2.getText()));
        float c=a+b;
        t3.setText(Float.toString(c));
    }

    public void sub(View view) {
        float a=Float.parseFloat(String.valueOf(t1.getText()));
        float b=Float.parseFloat(String.valueOf(t2.getText()));
        float c=a-b;
        t3.setText(Float.toString(c));
    }

    public void multi(View view) {
        float a=Float.parseFloat(String.valueOf(t1.getText()));
        float b=Float.parseFloat(String.valueOf(t2.getText()));
        float c=a*b;
        t3.setText(Float.toString(c));
    }

    public void div(View view) {
        float a=Float.parseFloat(String.valueOf(t1.getText()));
        float b=Float.parseFloat(String.valueOf(t2.getText()));
        float c=a/b;
        t3.setText(Float.toString(c));
    }
}