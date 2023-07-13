package com.centec.laercioeana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etGasolina, etEtanol;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etGasolina = findViewById(R.id.etGasolina);
        etEtanol = findViewById(R.id.etEtanol);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void calcular (View view){
        Double etanol = Double.parseDouble(etEtanol.getText().toString());
        Double gasolina = Double.parseDouble(etGasolina.getText().toString());

        Double resultado = etanol/gasolina;

        if (resultado<=0.7){
            tvResultado.setText("ABASTECER COM ETANOL");
        } else if (resultado>0.7){
            tvResultado.setText("ABASTECER COM GASOLINA");
        }
    }
}