package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView resultado;
    private ImageView btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        resultado = findViewById(R.id.resultado);

        btn_voltar = findViewById(R.id.btn_voltar);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
