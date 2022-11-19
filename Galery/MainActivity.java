package com.example.galery;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images={R.drawable.batm,R.drawable.hornbil,R.drawable.hornbil,R.drawable.hornbil,R.drawable.batm,R.drawable.hornbil,R.drawable.hornbil,R.drawable.hornbil,R.drawable.hornbil};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.grid_view);

        GridAdapter gridAdapter=new GridAdapter(this,images);
        gridView.setAdapter(gridAdapter);


    }
}