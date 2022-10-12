package com.example.p8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name1");
        String text1 = extra.getString("name2");
        t1.setText(text);
        t2.setText(text1);
    }
}
