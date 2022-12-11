package com.example.doggy.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doggy.R;

public class ConfigActivity extends AppCompatActivity implements View.OnClickListener {

    TextView permisosAplicacion;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        permisosAplicacion = findViewById(R.id.PermisosAplicacion);
        permisosAplicacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.PermisosAplicacion)
        {
            startActivity(new Intent(getApplicationContext(), InfoCuentaActivity.class));
        }
    }
}
