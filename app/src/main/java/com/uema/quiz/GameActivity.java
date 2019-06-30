package com.uema.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent categoriaRecebida = getIntent();

        String categoria = categoriaRecebida.getStringExtra("Categoria");
        System.out.println("Selecionada: " +  categoria);
        //Troca de telas
        Button btnResposta = findViewById(R.id.btnNext);

        btnResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNext = new Intent(GameActivity.this, RespostaActivity.class);

                startActivity(intentNext);
            }
        });
    }
}
