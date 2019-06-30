package com.uema.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    public static ArrayList<Questao> Lista;

    public static int numeroQuestao = 0;

    private static String CategoriaSelecionada = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    @Override
    public void onStart() {
        super.onStart();
        Intent categoriaRecebida = getIntent();

        String categoria = categoriaRecebida.getStringExtra("Categoria");
        System.out.println("Selecionada: " +  categoria);




        CategoriaSelecionada = categoria;

        GeradorDAO dao = new GeradorDAO(this);
        dao.open();
        Lista = dao.capturarQuestoes(CategoriaSelecionada);
        System.out.println("Numero de perguntas: " + Lista.size());
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        TextView categoriaText = (TextView) findViewById(R.id.tituloCategoria);
        categoriaText.setText(CategoriaSelecionada);

        TextView Pergunta = (TextView) findViewById(R.id.pergunta);
        Pergunta.setText(Lista.get(numeroQuestao).getPergunta());

        final RadioButton resposta1 = (RadioButton) findViewById(R.id.resposta1);
        resposta1.setText(Lista.get(numeroQuestao).getResposta1());
        final RadioButton resposta2 = (RadioButton) findViewById(R.id.resposta2);
        resposta2.setText(Lista.get(numeroQuestao).getResposta2());
        final RadioButton resposta3 = (RadioButton) findViewById(R.id.resposta3);
        resposta3.setText(Lista.get(numeroQuestao).getResposta3());
        final RadioButton resposta4 = (RadioButton) findViewById(R.id.resposta4);
        resposta4.setText(Lista.get(numeroQuestao).getResposta4());

        System.out.println("Numero do ID da Pergunta: "+ Lista.get(numeroQuestao).getID());

        Button btnResposta = findViewById(R.id.btnNext);

        btnResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNext = new Intent(GameActivity.this, RespostaActivity.class);
                intentNext.putExtra("Pergunta", Lista.get(numeroQuestao).getID());
                if(resposta1.isChecked() == true){
                    intentNext.putExtra("Respondida", 1);
                }else if(resposta2.isChecked() == true){
                    intentNext.putExtra("Respondida", 2);
                }else if(resposta3.isChecked() == true){
                    intentNext.putExtra("Respondida", 3);
                }else if(resposta4.isChecked() == true){
                    intentNext.putExtra("Respondida", 4);
                }
                startActivity(intentNext);
            }
        });
    }

    @Override
    public void onRestart() {
        if(numeroQuestao < (Lista.size() - 1)){
            numeroQuestao = numeroQuestao + 1;
        }else{
            numeroQuestao = 0;
            finish();
        }
        super.onRestart();
    }
}
