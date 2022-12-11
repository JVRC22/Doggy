package com.example.doggy.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doggy.MainActivity;
import com.example.doggy.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button crear_cuenta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        crear_cuenta = (Button) findViewById(R.id.crear_cuenta);
        crear_cuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.crear_cuenta)
        {
            startActivity(new Intent(getApplicationContext(), VerificarCorreoActivity.class));
        }
    }
}
