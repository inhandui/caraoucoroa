package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView btn_jogar;
    private String[] opcao = {"cara", "coroa"};
    private Random random;
    private int valorSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jogar = findViewById(R.id.btn_jogar);

        random = new Random();

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);

                valorSorteado = random.nextInt(2);

                intent.putExtra("resultado", opcao[valorSorteado]);

                startActivity(intent);
            }
        });
    }
}
