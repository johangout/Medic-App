package com.example.medic_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;
import java.text.DateFormat;

public class Registro extends AppCompatActivity {

    public EditText ide, nombre, apellido, Especi, celular;
    public Button button1;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ide = (EditText) findViewById(R.id.ide1);
        nombre = (EditText) findViewById(R.id.nombre1);
        apellido = (EditText) findViewById(R.id.apellido1);
        Especi = (EditText) findViewById(R.id.Especi1);
        celular = (EditText) findViewById(R.id.celular1);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String identificacion = ide.getText().toString();
                String nomb = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String espe = Especi.getText().toString();
                String cel = celular.getText().toString();

                Intent DATO =new Intent(getApplicationContext(),OKRegistro.class);
                DATO.putExtra("ide",identificacion);
                DATO.putExtra("nomb",nomb);
                DATO.putExtra("ape",ape);
                DATO.putExtra("espe",espe);
                DATO.putExtra("cel",cel);

    startActivity(DATO);


            }
        });
    }
}




