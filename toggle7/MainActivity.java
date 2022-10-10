package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int image[] ={R.drawable.hornbil,R.drawable.w};
    int currentindex=0;
    Button b;
    ImageView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        v=findViewById(R.id.im);
    }

    public void view(View view) {
        currentindex();
    }

    private void currentindex() {
        switch(currentindex){
            case 0:v.setImageResource(image[1]);
                currentindex=1;
                break;
            case 1:v.setImageResource(image[0]);
                currentindex=0;
                break;
        }

    }
}