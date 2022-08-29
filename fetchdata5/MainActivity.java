package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    RadioButton m,f;
    RadioGroup g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tx1);
        t2=findViewById(R.id.tx2);
        m=findViewById(R.id.rb1);
        f=findViewById(R.id.rb2);
        g=findViewById(R.id.gen);

    }

    public void submit(View view) {
        regform();
    }

    private void regform() {
        SharedPreferences  sharedPref=getSharedPreferences("My_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("fname",t1.getText().toString());
        editor.putString("lname",t2.getText().toString());

        String radiovalue="";
        switch (g.getCheckedRadioButtonId()){
            case R.id.rb1:radiovalue="male";
            break;
            case R.id.rb2:radiovalue="female";
            break;
        }
        editor.putString("gender",radiovalue);
        editor.apply();

        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);


    }
}