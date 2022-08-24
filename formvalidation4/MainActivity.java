package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText tx1, tx2, tx3;
    RadioButton m, f;
    RadioGroup gen;
    Switch s;
    CheckBox c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = findViewById(R.id.t1);
        tx2 = findViewById(R.id.t2);
        tx3 = findViewById(R.id.pas);
        btn = findViewById(R.id.b);
        gen = findViewById(R.id.rg);
        m = findViewById(R.id.rb1);
        f = findViewById(R.id.rb2);
        c = findViewById(R.id.cb);
        s = findViewById(R.id.s1);


    }

    public void buton(View view) {
        if (validate()) {
            Toast.makeText(this, "All data is valid", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "some data is invalid", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validate() {
        Boolean isValid = false;
        String fnam,lnam;
        fnam=tx1.getText().toString();
        lnam=tx2.getText().toString();


        if (fnam.equals("")) {
            Toast.makeText(this, "first name is empty", Toast.LENGTH_SHORT).show();

        } else if (lnam.equals("")) {
            Toast.makeText(this, "last name is empty", Toast.LENGTH_SHORT).show();
        } else if (tx3.length() < 3) {
            Toast.makeText(this, "password must have 3 letters", Toast.LENGTH_SHORT).show();
        } else if (!m.isChecked() && !f.isChecked()) {
            Toast.makeText(this, "please select male or female", Toast.LENGTH_SHORT).show();
        } else if (!s.isChecked()) {
            Toast.makeText(this, "new member", Toast.LENGTH_SHORT).show();
        } else if (!c.isChecked()) {
            Toast.makeText(this, "please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
        }
        else {
            return isValid = true;
        }
        return isValid;
    }
}
