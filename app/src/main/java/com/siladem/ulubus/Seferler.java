package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class Seferler extends AppCompatActivity {

    TextView bilgilerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seferler);

        bilgilerView = findViewById(R.id.bilgilerView);
        ListView listView = (ListView) findViewById(R.id.listView);
        Bundle extras = getIntent().getExtras();

        String nereden = extras.getString("nereden");
        String nereye = extras.getString("nereye");
        String tarih = extras.getString("tarih");

        bilgilerView.setText(tarih);

        //veri tabanı bağla, oku , sorgula,arraye ekle,listwiew ile bağla.

    }

    public void koltukGetir(View view){
        // veri tabanından koltuları getir.

        Intent intent = new Intent(getApplicationContext(),KoltukSecimii.class);
        startActivity(intent);
    }
}
