package com.example.dell.proyecto_final_one.lista;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dell.proyecto_final_one.R;

public class DetalleActivity extends AppCompatActivity {

    //Titulo del item
    private TextView tvNombre;
    //Subtitulo del item
    private TextView tvHAbilidades;
    //Dos tipos de fuentes distintas
    private TextView tvConcepto;

    private Typeface typeface_bold;
    private Typeface typeface_thing;
    private Typeface typeface_light;


   private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_detalle);




        //Llamada al disenio de las vistas
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvHAbilidades = (TextView) findViewById(R.id.tvDetalleHabilidades);
        tvConcepto=(TextView) findViewById(R.id.tvConcepto);

        //Carga de los archivos de tipo fuente

        typeface_bold = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_black.ttf");
        typeface_thing = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_thin.ttf");
        typeface_light = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_light.ttf");

        //Asignamos los tipos de fuente
        tvNombre.setTypeface(typeface_bold);
        tvHAbilidades.setTypeface(typeface_thing);
        tvConcepto.setTypeface(typeface_light);

        //Recuperamos el objeto serializado
        Contaduria contaduria = (Contaduria) getIntent().getSerializableExtra("conta");
        tvNombre.setText(contaduria.getNombre());
        tvHAbilidades.setText(contaduria.getTipo());
        tvConcepto.setText(contaduria.getConcepto());
    }

    public void compartir(View view) {
        intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String c = "Este es tu regalo "+R.raw.proyecto;
        intent.putExtra(Intent.EXTRA_TEXT, c);
        startActivity(intent);
    }
}
