package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KoltukSecimii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koltuk_secimii);
    }

    public void koltukSec(View view){

        Intent intent = new Intent(getApplicationContext(),KullaniciBilgileri.class);
        startActivity(intent);

    }
}
