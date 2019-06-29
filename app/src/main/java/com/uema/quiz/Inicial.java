package com.uema.quiz;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);


    }

    private class Task extends AsyncTask<String, String, String>{

        private String Mensagem = "Falha ao realizar a operação de conexão!";

        @Override
        protected String doInBackground(String... strings) {
            try{

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return Mensagem;
        }
    }

}
