package com.example.dell.proyecto_final_one;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dell.proyecto_final_one.lista.MainActivity;



/**
 * Created by Dell on 21/10/2017.
 */

public class MenuActivity extends AppCompatActivity {

    private Intent intent;
    private SoundPool sp1,sp2,sp3;
    private int uno;
    //private Typeface typeface_light;
    //private TextView a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu);


    crerSoundPool();


        // *a=(TextView) findViewById(R.id.tvuno);
      // b=(TextView) findViewById(R.id.tvdos);
       // c=(TextView) findViewById(R.id.tvtres);
      // d=(TextView)findViewById(R.id.tvcuatro);
       //typeface_light = Typeface.createFromAsset(
              // getAssets(), "fonts/roboto_black.ttf");
       // a.setTypeface(typeface_light);
        //b.setTypeface(typeface_light);
        //c.setTypeface(typeface_light);
        //d.setTypeface(typeface_light);




    }



    public void AbrirCalc(View view) {
       //Toast.makeText(getApplicationContext(),"Hola", Toast.LENGTH_SHORT).show();
        intent=new Intent(getApplicationContext(), CalcuActivity.class);
        startActivity(intent);

        sp1.play(uno,1,1,0,0,1);

    }



    public void AbrirContactame(View view) {
        intent=new Intent(getApplicationContext(),AcercaActivity.class);
        startActivity(intent);

        sp1.play(uno,1,1,0,0,1);



    }

    public void AbrirConceptos(View view) {
        intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        sp1.play(uno,1,1,0,0,1);



    }

    public void internet(View view) {
        intent=new Intent(getApplicationContext(),InternetActivity.class);
        startActivity(intent);
        sp1.play(uno,1,1,0,0,1);



    }

    public void block(View view) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.contaduriabolivia.com"));
            startActivity(intent);

        sp1.play(uno,1,1,0,0,1);



    }

    private void crerSoundPool() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            sp1 = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();

            cargarSoundPool();
        } else {

            sp1=new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
            cargarSoundPool();
        }
    }
    public void cargarSoundPool()
    {
        uno=sp1.load(this, R.raw.efecto1, 0);

    }

}