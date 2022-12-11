package com.example.doggy.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.doggy.R;

public class VerificarCorreoActivity extends AppCompatActivity implements View.OnClickListener {

    Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar_correo);

        verificar = (Button) findViewById(R.id.verificar);
        verificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.verificar)
        {
            startActivity(new Intent(getApplicationContext(), EnviarCodigoActivity.class));
        }
    }
}