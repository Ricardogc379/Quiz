package com.uema.quiz;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    ImageView imagemCerta;
    TextView resultado;
    TextView respostaCorreta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        Intent receiver = getIntent();
        GameActivity.Lista.get(GameActivity.numeroQuestao);

        int id = receiver.getIntExtra("Pergunta",0);
        Questao obj = buscar(id);
        if(obj == null){
            System.out.println("Chegiu aqui");
            finish();
        }

        int respondida = receiver.getIntExtra("Respondida",0);

        System.out.println("Respondida: " + respondida);
        System.out.println("Resposta Correta " + obj.getCorreta());

        imagemCerta = (ImageView) findViewById(R.id.certo);
        resultado = (TextView) findViewById(R.id.resultado);
        respostaCorreta = (TextView) findViewById(R.id.respostaCorreta);

        if(respondida == obj.getCorreta()){
            imagemCerta.setImageDrawable(getResources().getDrawable(R.drawable.checkmark));
            resultado.setText("Acertou");
            respostaCorreta.setText(respostaCorreta(obj));
        }else{
            imagemCerta.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
            resultado.setText("Errou");
            respostaCorreta.setText(respostaCorreta(obj));
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finish();
            }
        });
        thread.start();
    }

    private String respostaCorreta(Questao x){
        switch (x.getCorreta()){
            case 1:
                return x.getResposta1();
            case 2:
                return x.getResposta2();
            case 3:
                return x.getResposta3();
            case 4:
                return x.getResposta4();
            default:
                return "";
        }
    }

    private Questao buscar(int id){
        for(int i = 0; i < GameActivity.Lista.size(); i++){
            if(GameActivity.Lista.get(i).getID() == id){
                return GameActivity.Lista.get(i);
            }
        }
        return null;
    }
}
