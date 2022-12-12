package com.example.doggy.admin;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.doggy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AdminActivity extends AppCompatActivity {

    BottomNavigationView navbar;

    UsuariosFragment usuariosFragment = new UsuariosFragment();
    CasasFragment casasFragment = new CasasFragment();
    RelacionesFragment relacionesFragment = new RelacionesFragment();
    ConfiguracionFragment configuracionFragment = new ConfiguracionFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        loadFragment(usuariosFragment);

        navbar = findViewById(R.id.navbar);
        navbar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.Usuarios:
                        loadFragment(usuariosFragment);
                        //Toast.makeText(AdminActivity.this, "Usuarios", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Casas:
                        loadFragment(casasFragment);
                        //Toast.makeText(AdminActivity.this, "Casas", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Relaciones:
                        loadFragment(relacionesFragment);
                        //Toast.makeText(AdminActivity.this, "Relaciones", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Configuracion:
                        loadFragment(configuracionFragment);
                        //Toast.makeText(AdminActivity.this, "Configuracion", Toast.LENGTH_SHORT).show();
                        return true;
                }

                return false;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedor, fragment);
        transaction.commit();
    }
}
