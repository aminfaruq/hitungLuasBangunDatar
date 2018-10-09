package id.co.aminfaruq.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaranActivity extends AppCompatActivity {

    EditText editJari;
    TextView txtHasilLingkaran;
    Button btnHitungLingkaran;
    Double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        editJari = findViewById(R.id.edtJari);
        txtHasilLingkaran = findViewById(R.id.txtHasilLingkaran);
        btnHitungLingkaran = findViewById(R.id.btnHitungLingkaran);

        btnHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Jari = Double.valueOf(editJari.getText().toString());

                HitungLuasLingkaran(Jari);
            }
        });
    }

    private void HitungLuasLingkaran(Double jari) {
       hasil= 3.14 * jari * jari;

       txtHasilLingkaran.setText(String.valueOf(hasil));
    }
    }

