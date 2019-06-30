package com.uema.quiz.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.uema.quiz.Model.Carga;
import com.uema.quiz.Model.Categoria;
import com.uema.quiz.R;
import com.uema.quiz.SQLDATA.CargaDAO;

public class HomeActivity extends AppCompatActivity {

    private RadioGroup grupo;

    private RadioButton radio;

    private EditText NomeJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //------------------------------------------------------------------------------------------
        // REALIZA A CARGA DE PERGUNTAS NO BANCO DE DADOS
        //------------------------------------------------------------------------------------------
        try{
            CargaDAO carga = new CargaDAO(this);
            carga.open();
            boolean var = carga.salvarBancoQuestoes(Carga.GetListQuestoes());
            carga.close();
        }catch (Exception e){
            System.out.println("Falha ao realiza a conexão com database"+ e.getMessage());
        }
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        grupo = (RadioGroup) findViewById(R.id.radio);
        Button btnJogar = findViewById(R.id.btnJogar);
        NomeJogador = (EditText) findViewById(R.id.nomeText);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(NomeJogador.getText())){
                    NomeJogador.setError( "Digite o Nome do Jogador!" );
                }else{
                    // DEFINE O NOME DO JOGADOR
                    GameActivity.NomeJogador = NomeJogador.getText().toString();
                    int selecionado = grupo.getCheckedRadioButtonId();

                    // VERIFICAÇÃO DA CATEGORIA DAS QUESTÕES
                    if(selecionado == findViewById(R.id.ConhecimentosGerais).getId()){
                        System.out.println("1 -- Conhecimentos Gerais");
                        Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                        intentGame.putExtra("Categoria", Categoria.CONHECIMENTOS_GERAIS);
                        startActivity(intentGame);
                    }else if(selecionado == findViewById(R.id.SeriesFilmes).getId()){
                        System.out.println("1 -- Series");
                        Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                        intentGame.putExtra("Categoria",Categoria.FILMES_SERIES);
                        startActivity(intentGame);
                    }else if(selecionado == findViewById(R.id.Carros).getId()){
                        System.out.println("1 -- Carros");
                        Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                        intentGame.putExtra("Categoria",Categoria.CARROS);
                        startActivity(intentGame);
                    }else if(selecionado == findViewById(R.id.Esporte).getId()){
                        System.out.println("1 -- Esportes");
                        Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                        intentGame.putExtra("Categoria",Categoria.ESPORTE);
                        startActivity(intentGame);
                    }else if(selecionado == findViewById(R.id.Brasil).getId()){
                        System.out.println("1 -- Brasil");
                        Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                        intentGame.putExtra("Categoria",Categoria.BRASIL);
                        startActivity(intentGame);
                    }else{

                    }
                }
            }
        });

        Button btnRanking = findViewById(R.id.btnRanking);
        btnRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRanking = new Intent(HomeActivity.this, RankingActivity.class);
                startActivity(intentRanking);
            }
        });

    }
}
