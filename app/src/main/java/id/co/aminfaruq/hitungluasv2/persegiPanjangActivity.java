package id.co.aminfaruq.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegiPanjangActivity extends AppCompatActivity {

    EditText edtPanjang;
    EditText edtLebar;
    Button btnHitungPersegiPanjang;
    Integer hasil;
    TextView txtHasilPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnHitungPersegiPanjang = findViewById(R.id.btnHitungPersegiPanjang);
        txtHasilPersegiPanjang = findViewById(R.id.txtHasilPersegiPanjang);


        btnHitungPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Panjang = Integer.valueOf(edtPanjang.getText().toString());
                Integer Lebar = Integer.valueOf(edtLebar.getText().toString());

                HitungPersegiPanjang(Panjang, Lebar);
            }
        });


        }

    private void HitungPersegiPanjang(Integer panjang, Integer lebar) {
       hasil = panjang * lebar;

        txtHasilPersegiPanjang.setText(String.valueOf(hasil));
    }
}
