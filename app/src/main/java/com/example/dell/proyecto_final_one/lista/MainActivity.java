package com.example.dell.proyecto_final_one.lista;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dell.proyecto_final_one.R;
import com.example.dell.proyecto_final_one.lista.Contaduria;
import com.example.dell.proyecto_final_one.lista.CustomAdapter;
import com.example.dell.proyecto_final_one.lista.DetalleActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemClickListener{

    private ListView lvDatos;
    private Activity activity;
    private CustomAdapter adaptador;
    private ArrayList<Contaduria> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDatos = (ListView) findViewById(R.id.lvLista);
        activity = this;
        datos = new ArrayList<Contaduria>();

        llenarContaduria();

        adaptador = new CustomAdapter(activity, datos);
        lvDatos.setAdapter(adaptador);
        lvDatos.setOnItemClickListener(this);
    }

    public void llenarContaduria() {
        Resources resources = getResources();
        String[] arrayNombres = resources.getStringArray(R.array.nombre);
        String[] arrayTipos = resources.getStringArray(R.array.tipos);
        String[] arrayConcepto=resources.getStringArray(R.array.concepto);
        for(int i = 0; i < arrayNombres.length; i++) {
            Contaduria conta = new Contaduria(
                    arrayNombres[i], arrayTipos[i],arrayConcepto[i]
            );
            datos.add(conta);
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Contaduria contaTemp = datos.get(position);
        Intent entrar = new Intent(activity,DetalleActivity.class);
        entrar.putExtra("conta", contaTemp);
        startActivity(entrar);
    }

}