package com.siladem.ulubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Odeme extends AppCompatActivity {

    EditText adSoyad ;
    EditText kartNo;
    EditText guvenlikKodu ;
    EditText sonKullanmaTarihi;
    String adSoyad_ , kartNo_ , guvenlikKodu_ , sonKullanmaTarihi_ ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme);

        adSoyad = (EditText)findViewById(R.id.editTxtAdSoyad);
        kartNo = (EditText)findViewById(R.id.editTxtKartNo);
        guvenlikKodu = (EditText)findViewById(R.id.editTxtGuvenlikKodu);
        sonKullanmaTarihi = (EditText)findViewById(R.id.editTxtSonKullanmaTarihi);

    }

    public void odemeTamamlandı(View view){

        adSoyad_ = adSoyad.getText().toString();
        kartNo_ = kartNo.getText().toString();
        guvenlikKodu_ = guvenlikKodu.getText().toString();
        sonKullanmaTarihi_ = sonKullanmaTarihi.getText().toString();

        if(adSoyad_.trim().equals("")){
            Toast.makeText(this, "Ad Soyad Bölümü Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        }
        else if(kartNo_.trim().equals("")){
            Toast.makeText(this, "Kart Numarası Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        }
        else if(guvenlikKodu_.trim().equals("")){
            Toast.makeText(this, "Güvenlik Kodu Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        }
        else if(sonKullanmaTarihi_.trim().equals("")){
            Toast.makeText(this, "Son kullanma Tarihi Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "ÖDEMENİZ BAŞARI İLE GERÇEKLEŞMİŞTİR.", Toast.LENGTH_LONG).show();
        }


    }
}
