package com.example.doggy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doggy.menu.ConfigActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        config = (ImageView) findViewById(R.id.config);
        config.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.config)
        {
            startActivity(new Intent(getApplicationContext(), ConfigActivity.class));
        }
    }
}