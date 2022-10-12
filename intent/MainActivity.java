package com.example.p8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
    }

    public void view(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("name1","midhun");
        i.putExtra("name2","jithu");
        startActivity(i);
    }
}