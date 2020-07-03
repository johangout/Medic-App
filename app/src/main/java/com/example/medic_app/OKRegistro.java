package com.example.medic_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OKRegistro extends AppCompatActivity {
TextView ide, nombre, apellido, Especi, celular;
Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_k_registro);



        ide =  (TextView) findViewById(R.id.ide);
        nombre = (TextView) findViewById(R.id.nombre);
        apellido = (TextView) findViewById(R.id.apellido);
        Especi = (TextView)  findViewById(R.id.Especi);
        celular = (TextView)  findViewById(R.id.celular);
        Intent DATO= getIntent();
       String  Identificacion = DATO.getStringExtra("ide");
        String  nomb = DATO.getStringExtra("nomb");
        String  ape = DATO.getStringExtra("ape");
        String  espe = DATO.getStringExtra("espe");
        String  cel = DATO.getStringExtra("cel");

       ide.setText(Identificacion);
       nombre.setText(nomb);
       apellido.setText(ape);
       Especi.setText(espe);
       celular.setText(cel);

    button2 = (Button) findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openactivity_Contenido();

        }
    });
}
    public void openactivity_Contenido() {

        Intent intent =new Intent(this,Contenido.class);
        startActivity(intent);


    }

}