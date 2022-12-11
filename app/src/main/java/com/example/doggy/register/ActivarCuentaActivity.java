package com.example.doggy.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doggy.R;
import com.example.doggy.login.LoginActivity;

public class ActivarCuentaActivity extends AppCompatActivity implements View.OnClickListener {

    Button activar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activar_cuenta);

        activar = (Button) findViewById(R.id.activar);
        activar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.activar)
        {
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
    }
}
