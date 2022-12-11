package com.example.doggy.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doggy.MainActivity;
import com.example.doggy.R;
import com.example.doggy.admin.AdminActivity;
import com.example.doggy.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView registrarse, barra;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

        registrarse = findViewById(R.id.register);
        registrarse.setOnClickListener(this);

        //Boton temporal admin
        barra = findViewById(R.id.barra);
        barra.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.login)
        {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

        if (view.getId() == R.id.register)
        {
            startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        }

        //Boton temporal admin
        if (view.getId() == R.id.barra)
        {
            startActivity(new Intent(getApplicationContext(), AdminActivity.class));
        }
    }
}
