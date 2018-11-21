 package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     TextView neredenText;
     TextView nereyetext;
     TextView tarihText;

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {

         MenuInflater menuInflater = getMenuInflater();
         menuInflater.inflate(R.menu.kullanici_menu,menu);

         return super.onCreateOptionsMenu(menu);

     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         if(item.getItemId()  == R.id.dilekSikayet){
             Intent intent = new Intent(getApplicationContext(),dilek_sikayet.class);
             startActivity(intent);
         }
         if(item.getItemId() == R.id.iletisim){
             Intent intent = new Intent(getApplicationContext(),iletisim.class);
             startActivity(intent);
         }

         return super.onOptionsItemSelected(item);
     }

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        neredenText = findViewById(R.id.neredenText);
        nereyetext = findViewById(R.id.nereyeText);
        tarihText = findViewById(R.id.tarihText);

    }

     //seferlerin nerden nereye ve tarihini al. button tıklnınca bir sonraki sayfaya gidilir
     //hiç bir text boş kalamaz. aldığı değerleri bir sonraki sayfaya aktarır.

    public void seferAra(View view){
         String nereden = neredenText.getText().toString();
         String nereye = nereyetext.getText().toString();
         String tarih = tarihText.getText().toString();

        if (nereden.trim().equals("")) {
            Toast.makeText(this, "Nereden Bölümü Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        } else if (nereye.trim().equals("")) {
            Toast.makeText(this, "Nereye Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
        } else if (tarih.trim().equals("")) {
            Toast.makeText(this, "Tarih Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(getApplicationContext(),Seferler.class);
            intent.putExtra("nereden",nereden);
            intent.putExtra("nereye",nereye);
            intent.putExtra("tarih",tarih);
            startActivity(intent);
        }

    }


}
