package com.uema.quiz.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.uema.quiz.Model.Questao;
import com.uema.quiz.Model.Ranking;
import com.uema.quiz.R;
import com.uema.quiz.SQLDATA.GeradorDAO;
import com.uema.quiz.SQLDATA.RankingDAO;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    // LISTA DE QUESTÕES SELECIONADAS PELO GERADORDAO -> QUE REALIZA A BUSCA NO SQLITE DE PERGUNTAS
    // DE ACORDO COM A CATEGORIA
    public static ArrayList<Questao> Lista;

    // SINALIZADOR DE QUAL A QUESTAO ESTÁ SENDO RESPONDIDA NO MOMENTO ATUAL
    public static int numeroQuestao = 0;

    // SINALIZADOR UTILIZADO PELA RESPOSTA ACTIVITY QUE DEFINE QUANTAS PERGUNTAS
    // FORAM RESPONDIDAS CORRETAMENTE
    public static int contador = 0;

    // STRING DA CATEGORIA SELECIONADA NA HOME ACTIVITY
    public static String CategoriaSelecionada = "";

    // NOME DO JOGADOR DA PARTIDA
    public static String NomeJogador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        contador = 0;
        numeroQuestao = 0;
    }

    @Override
    public void onStart() {
        super.onStart();
        Intent categoriaRecebida = getIntent();

        String categoria = categoriaRecebida.getStringExtra("Categoria");

        CategoriaSelecionada = categoria;

        GeradorDAO dao = new GeradorDAO(this);
        dao.open();
        Lista = dao.capturarQuestoes(CategoriaSelecionada);
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

        Button btnSair = (Button) findViewById(R.id.btnsair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroQuestao = 0;
                contador = 0;
                finish();
            }
        });

    }

    @Override
    public void onRestart() {
        if(numeroQuestao < (Lista.size() - 1)){
            numeroQuestao = numeroQuestao + 1;
        }else{
            numeroQuestao = 0;
            //--------------------------------------------------------------------------------------
            // SALVA A PONTUACAO DO JOGADOR NO RANKING
            //--------------------------------------------------------------------------------------
            RankingDAO ranking = new RankingDAO(this);
            ranking.open();

            Ranking novo = new Ranking();
            novo.setNome(GameActivity.NomeJogador);
            novo.setCategoria(GameActivity.CategoriaSelecionada);
            novo.setPontuacao(contador);

            ranking.salvarPontuacao(novo);
            //--------------------------------------------------------------------------------------
            //--------------------------------------------------------------------------------------

            contador = 0;
            finish();
        }
        super.onRestart();
    }
}
