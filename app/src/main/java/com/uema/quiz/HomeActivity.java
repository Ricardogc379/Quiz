package com.uema.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.sql.SQLException;

public class HomeActivity extends AppCompatActivity {


    private RadioGroup grupo;

    private RadioButton radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        try{
            CargaDAO carga = new CargaDAO(this);
            carga.open();
            boolean var = carga.salvarBancoQuestoes(Carga.GetListQuestoes());
            if(var == true){
                Toast.makeText(this,"Carga feita com sucesso",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Carga falhou",Toast.LENGTH_LONG).show();
            }
            carga.close();
            GeradorDAO dao = new GeradorDAO(this);
            dao.open();
            dao.capturarQuestoes(Categoria.CONHECIMENTOS_GERAIS);
            System.out.println("Busca feita");
        }catch (Exception e){
            System.out.println("Falha ao realiza a conexao"+ e.getMessage());
        }

        grupo = (RadioGroup) findViewById(R.id.radio);
        Button btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selecionado = grupo.getCheckedRadioButtonId();
                if(selecionado == findViewById(R.id.ConhecimentosGerais).getId()){
                    System.out.println("1 -- Conhecimentos Gerais");
                    Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);
                    intentGame.putExtra("Categoria",Categoria.CONHECIMENTOS_GERAIS);
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
        });

        //Troca de telas
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
