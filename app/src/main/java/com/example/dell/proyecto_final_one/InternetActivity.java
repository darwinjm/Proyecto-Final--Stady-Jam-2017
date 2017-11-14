package com.example.dell.proyecto_final_one;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InternetActivity extends AppCompatActivity {
        private ImageButton botones;
        private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

    }

    public void libro1(View view) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://upcommons.upc.edu/bitstream/handle/2117/21190/Contabilidad+para+todos.pdf;jsessionid=79F592B5DBC7E40AFB03D00F668C1A52?sequence=1"));
        startActivity(intent);
    }


    public void Face(View view) {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/groups/umsacontaduriapublica/?hc_ref=PAGES_TIMELINE"));
        startActivity(intent);
    }

    public void libro2(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://vparrales.files.wordpress.com/2012/08/14074128-primer-curso-de-contabilidad-elias-lara-flores-trillas-16a-edicion2.pdf"));
        startActivity(intent);
    }

    public void libro3(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.uaeh.edu.mx/investigacion/productos/4773/contabilidad.pdf"));
        startActivity(intent);
    }

    public void libro4(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    }

    public void libro5(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.editorialpatria.com.mx/pdffiles/9786074386189.pdf"));
        startActivity(intent);
    }

    public void libro6(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://fade.espoch.edu.ec/libros/Contabilidad-basica.pdf"));
        startActivity(intent);
    }

    public void libro7(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://vmpc.economiayfinanzas.gob.bo/financiera0.asp"));
        startActivity(intent);
    }

    public void face2(View view) {
        intent=new Intent(intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/groups/solocontaduriacpu/"));
        startActivity(intent);
    }
}
