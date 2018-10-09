package id.co.aminfaruq.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 Menginisiasi ke dalam variable
        Button btnMasuk = findViewById(R.id.btnMasuk);

        //TODO 2 membuat method onclick
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 2 membuat intent masuk untuk pindah halaman
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);

                //TODO 4 lalu kita pangggil method startactivity untuk berpindah halaman
                startActivity(pindah);
            }
        });
    }
}
