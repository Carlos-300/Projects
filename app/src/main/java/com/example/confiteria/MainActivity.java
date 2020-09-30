package com.example.confiteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<btnresgistrar> extends AppCompatActivity {
    Button btnresgistrar ;
    Button btnver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnresgistrar = findViewById(R.id.btnresgistrar);
        btnver = findViewById(R.id.btnver);


        btnresgistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent (MainActivity.this,Registro.class);
                startActivity(intento);
            }
        });
        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent (MainActivity.this,verRegistro.class);
                startActivity(intento2);
            }
        });

    }
}



