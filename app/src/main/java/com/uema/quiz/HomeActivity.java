package com.uema.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*CargaDAO DAO = new CargaDAO(this);
        DAO.open();
        boolean x = DAO.salvarBancoQuestoes(Carga.GetListQuestoes());
        if(x == true){
            Toast.makeText(this, "Conexao feita com Sucesso!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Conexao falhou!", Toast.LENGTH_LONG).show();
        }
        DAO.close();*/
    }
}
