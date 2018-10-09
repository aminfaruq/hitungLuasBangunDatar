package id.co.aminfaruq.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void luasPersegi(View view){
        //TODO 1 luas persegi membuat method luas persegi
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);


        //TODO 3 menjalankan start activity
        startActivity(pindah);

    }
    public void LuasPersegiPanjang(View view){

        Intent pindah1 = new Intent(MenuActivity.this, persegiPanjangActivity.class);

        startActivity(pindah1);

    }

    public void LuasLingkaran(View view){
        Intent pindah2 = new Intent(MenuActivity.this, LuasLingkaranActivity.class);

        startActivity(pindah2);
    }

    public void LuasSegitiga(View view){
        Intent pindah3 = new Intent(MenuActivity.this, LuasSegitigaActivity.class);

        startActivity(pindah3);
    }


}
