package id.co.aminfaruq.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {

    EditText edtAlas;
    EditText edtTinggi;
    TextView txtHasilSegitiga;
    Button btnHitungSegitiga;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);


        edtAlas = findViewById(R.id.edtAlas);
        edtTinggi = findViewById(R.id.edtTinggi);
        txtHasilSegitiga = findViewById(R.id.txtHasilSegitiga);
        btnHitungSegitiga = findViewById(R.id.btnHitungSegitiga);

        btnHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer alas = Integer.valueOf(edtAlas.getText().toString());
                Integer tinggi = Integer.valueOf(edtTinggi.getText().toString());

                hitungLuasSegitiga(alas, tinggi);
            }
        });

    }

    private void hitungLuasSegitiga(Integer alas, Integer tinggi) {
        hasil= 0.5 * alas * tinggi;

        txtHasilSegitiga.setText(String.valueOf(hasil));
    }
}
