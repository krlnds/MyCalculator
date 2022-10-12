package com.karlina.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtPanjang;
    EditText edtLebar;
    Button btnPersegi;
    Button btnSegitiga;
    Button btnOval;
    TextView text_Luas;
    TextView text_Keliling;
    Double panjang;
    Double lebar;
    Double luas;
    Double keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnOval = findViewById(R.id.btnOval);
        text_Luas = findViewById(R.id.text_Luas);
        text_Keliling = findViewById(R.id.text_Keliling);


        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.parseDouble(edtPanjang.getText().toString());
                lebar = Double.parseDouble(edtLebar.getText().toString());
                luas = panjang * lebar;
                keliling = (2 * panjang) + (2 * lebar);




                text_Luas.setText("Luas = "+luas.toString());

                text_Keliling.setText("Keliling = "+keliling.toString());

            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.parseDouble(edtPanjang.getText().toString());
                lebar = Double.parseDouble(edtLebar.getText().toString());
                double miring = Math.round(Math.sqrt(Math.pow(panjang,2) / 2 + Math.pow(lebar,2)));


                luas = (panjang * lebar)/2;

                text_Luas.setText("Luas = "+luas.toString());
                keliling = panjang + miring + miring;

                text_Keliling.setText("Keliling = "+ keliling.toString());



            }
        });

        btnOval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.parseDouble(edtPanjang.getText().toString());
                Double jari = panjang/2;
                luas = Math.PI * jari * jari;
                keliling = Math.PI * jari * 2;

                text_Luas.setText("Luas = "+Math.round(luas));
                text_Keliling.setText("Keliling = "+Math.round(keliling));
            }
        });

    }



}