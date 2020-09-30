package com.example.confiteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {
    Button btnenviar;
    Button btncancelar;
    EditText txtNombre;
    RadioGroup rpadioGrou2;
    CheckBox boxsi;
    Spinner spnsabor;
    RatingBar rankrecomendable;
    private RadioButton r1, r2, r3;
    ArrayList<Valoracion> Confite = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombre = findViewById(R.id.txtNombre);
        btncancelar = findViewById(R.id.btncancelar);
        btnenviar = findViewById(R.id.btnenviar);
        spnsabor = findViewById(R.id.spnsabor);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        rankrecomendable = findViewById(R.id.rankrecomendable);
        boxsi = findViewById(R.id.boxsi);
        ArrayAdapter<CharSequence> Sabor = ArrayAdapter.createFromResource(Registro.this, R.array.spnsabor_items, android.R.layout.simple_spinner_item);
        spnsabor.setAdapter(Sabor);

        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(Registro.this, MainActivity.class);
                startActivity(intento);
            }
        });


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String Gusto = validar2();
                String bolsa = validar();
                String selectspin = spnsabor.getSelectedItem().toString();
                float rating = rankrecomendable.getRating();
                String rank = Float.valueOf(rating).toString();

                Valoraciones.valoraciones.add(new Valoracion(nombre, bolsa, Gusto, selectspin, rank));

                Toast.makeText(Registro.this, "Gracias por tu valoración", Toast.LENGTH_SHORT).show();
                Intent intento = new Intent (Registro.this,MainActivity.class);
                startActivity(intento);
            }
        });
    }

    private String validar() {
        String Cantidad = "";
        if (r1.isChecked() == true) {
            Cantidad = "poco";
        }
        if (r2.isChecked() == true) {
            Cantidad = "medio llena";
        }
        if (r3.isChecked() == true) {
            Cantidad = "lleno";
        }
        return Cantidad;
    }

    private String validar2() {
        if (boxsi.isChecked() == true) {
            return "si";
        }
        if (boxsi.isChecked() == false) {
            return "no";
        }
        return null;
    }
}
