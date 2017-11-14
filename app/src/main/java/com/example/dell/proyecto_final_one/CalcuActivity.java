package com.example.dell.proyecto_final_one;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static com.example.dell.proyecto_final_one.R.id.cnumero;


public class CalcuActivity extends AppCompatActivity {
    private EditText numero;
    private Button boton;
    private TextView resula, resulb, caja1, caja2, recordar;
    private Intent intent;
    private SoundPool sp1, sp2, sp3;
    private int uno, dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);

//casteamos los datos
        numero = (EditText) findViewById(cnumero);
        resula = (TextView) findViewById(R.id.resul1);
        resulb = (TextView) findViewById(R.id.resul2);
        caja1 = (TextView) findViewById(R.id.c);
        caja2 = (TextView) findViewById(R.id.cc);
        //recordar = (TextView) findViewById(R.id.idrecordar);
 crearSoundPool();

    }



    public void iva(View v) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.13;
        double resul = a * 0.87;
        resula.setText("" + resultado);
        caja1.setText("13%");
        resulb.setText("" + resul);
        caja2.setText("87%");


// guradamos los datos en la memoria interna
        if (!caja1.getText().toString().equals("vacio")) {
            try {

                OutputStreamWriter dato = new OutputStreamWriter(openFileOutput("prueva.txt", Context.MODE_APPEND));
                dato.write(caja1.getText().toString()); //se guarda
                dato.close();//se cierra
                Toast.makeText(this, "Guardado en: " + getFilesDir(), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
        } else {
            Toast.makeText(this, "El texto esta vacio", Toast.LENGTH_SHORT).show();
        }

        sp2.play(dos,1,1,0,0,1);
    }


    public void it(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.03;
        double resul = a * 0.97;
        resula.setText("" + resultado);
        caja1.setText("3%");
        resulb.setText("" + resul);
        caja2.setText("97%");


// incluimos efectos a cada boton
        sp2.play(dos,1,1,0,0,1);
    }

    public void uei(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.25;
        double resul = a * 0.75;
        resula.setText("" + resultado);
        caja1.setText("25%");
        resulb.setText("" + resul);
        caja2.setText("75%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void rciva(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.13;
        double resul = a * 0.87;
        resula.setText("" + resultado);
        caja2.setText("13%");
        resulb.setText("" + resul);
        caja2.setText("87%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void ice(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.07;
        double resul = a * 0.993;
        resula.setText("" + resultado);
        caja1.setText("0.07%");
        resulb.setText("" + resul);
        caja2.setText("0.993%");



        sp2.play(dos,1,1,0,0,1);
    }

    public void tgb(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.20;
        double resul = a * 0.80;
        resula.setText("" + resultado);
        caja1.setText("20%");
        resulb.setText("" + resul);
        caja2.setText("80%");



        sp2.play(dos,1,1,0,0,1);
    }

    public void isae(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.28;
        double resul = a * 0.80;
        resula.setText("" + resultado);
        caja1.setText("20%");
        resulb.setText("" + resul);
        caja2.setText("80%");


        sp2.play(dos,1,1,0,0,1);
    }


    public void idh(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.32;
        double resul = a * 0.78;
        resula.setText("" + resultado);
        caja1.setText("32%");
        resulb.setText("" + resul);
        caja2.setText("78%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void itf(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.030;
        double resul = a * 0.9997;
        resula.setText("" + resultado);
        caja1.setText("0.30%");
        resulb.setText("" + resul);
        caja2.setText("0.9997%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void ij(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.30;
        double resul = a * 0.70;
        resula.setText("" + resultado);
        caja1.setText("30%");
        resulb.setText("" + resul);
        caja2.setText("70%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void ipj(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.15;
        double resul = a * 0.85;
        resula.setText("" + resultado);
        caja1.setText("15%");
        resulb.setText("" + resul);
        caja2.setText("85%");



        sp2.play(dos,1,1,0,0,1);
    }

    public void iehe(View view) {
        String c1 = numero.getText().toString();
        double a = Double.parseDouble(c1);
        double resultado = a * 0.05;
        double resul = a * 0.955;
        resula.setText("" + resultado);
        caja1.setText("0.5%");
        resulb.setText("" + resul);
        caja2.setText("95.5%");


        sp2.play(dos,1,1,0,0,1);
    }

    public void borrar(View view) {
        numero.setText("");
        resula.setText("");
        resulb.setText("");
        caja2.setText("");
        caja1.setText("");
        sp1.play(uno,1,1,0,0,1);
    }


    public void recuperar(View view) {
        //try {
           // BufferedReader lector = new BufferedReader(new InputStreamReader(openFileInput("prueba.txt")));
           // String numero = lector.readLine().toString();
           // lector.close();
          //  recordar.setText("Esto es:" + numero);
      //  } catch (Exception e) {
        //    System.out.println("Error:  " + e.getMessage());
      //  }

       intent=new Intent(getApplicationContext(),AcercaActivity.class);
       startActivity(intent);
       sp1.play(uno,1,1,0,0,1);

    }

    public void Abrircalcuadora(View view){
        intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        sp1.play(uno,1,1,0,0,1);
    }

    private void crearSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            sp1 = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();
            sp2 = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();
            cargarSoundPool();
        } else {

            sp1=new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
            sp2=new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
            cargarSoundPool();

            cargarSoundPool();
        }
    }
    public void cargarSoundPool()
    {
        uno=sp1.load(this, R.raw.efecto1, 0);
        dos=sp2.load(this, R.raw.efecto2, 0);

    }

}


