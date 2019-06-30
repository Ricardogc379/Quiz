package com.uema.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.SQLException;

public class HomeActivity extends AppCompatActivity {

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


        //Troca de telas
        Button btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGame = new Intent(HomeActivity.this, GameActivity.class);

                startActivity(intentGame);
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
