package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bilet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet);
    }

    public void odeme(View view){
        Intent intent = new Intent(getApplicationContext(),Odeme.class);
        startActivity(intent);
    }
}
