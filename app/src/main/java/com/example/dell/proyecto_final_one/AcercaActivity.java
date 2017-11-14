package com.example.dell.proyecto_final_one;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcercaActivity extends AppCompatActivity {

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
    }

    public void Ibllamar(View view) {
        intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:76280671"));
        startActivity(intent);


    }

    public void Ibredes(View view) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100004410151321"));
        startActivity(intent);
    }

    public void Ibcorreo(View view) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http//:www.gmail/darwinetmontes@gmail.com"));
        startActivity(intent);
    }
}
