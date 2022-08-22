package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.nam);
        e2 = findViewById(R.id.pas);
        b1 = (Button) findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = e1.getText().toString();
                String p = e2.getText().toString();
                if (u.equals("alen") && p.equals("123")) {
                    Toast.makeText(MainActivity.this, "login successfuly", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
