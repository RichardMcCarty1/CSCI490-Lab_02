package com.example.lab02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{
    private int image;

    private ConstraintLayout setBackground;
    Intent i = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView supermoon = findViewById(R.id.supermoon);
        ImageView waterfall = findViewById(R.id.waterfall);

        supermoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                image = R.drawable.supermoon;
                finish();
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            image = R.drawable.waterfall;
            finish();
            }
        });
    }

    //@Override
    //public void onClick(View v) {
    //    if(getResources().getResourceEntryName(v.getId()) == "supermoon") {
    //        image = R.drawable.supermoon;
    //    }
    //    else {
    //        image = R.drawable.waterfall;
    //    }
    //    setBackground.setBackgroundResource(image);
    //    i.putExtra("image", image);
    //    setResult(RESULT_OK, i);
    //}

    @Override
    public void finish() {
        i.putExtra("image", image);
        setResult(1, i);
        super.finish();
    }
}