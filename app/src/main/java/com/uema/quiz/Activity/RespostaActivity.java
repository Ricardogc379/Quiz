package com.uema.quiz.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.uema.quiz.Model.Questao;
import com.uema.quiz.R;

public class RespostaActivity extends AppCompatActivity {

    ImageView imagemCerta;
    TextView resultado;
    TextView respostaCorreta;
    TextView categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        Intent receiver = getIntent();
        GameActivity.Lista.get(GameActivity.numeroQuestao);
        int id = receiver.getIntExtra("Pergunta",0);

        Questao obj = buscar(id);

        // EM CASO DE NÃO ENCONTRA A QUESTAO: ERRO FATAL
        // FINALIZA A ACTIVITY
        if(obj == null){
            finish();
        }

        int respondida = receiver.getIntExtra("Respondida",0);

        //------------------------------------------------------------------------------------------
        // CAPTURA DOS ELEMENTOS DO LAYOUT
        //------------------------------------------------------------------------------------------
        imagemCerta = (ImageView) findViewById(R.id.certo);
        resultado = (TextView) findViewById(R.id.resultado);
        respostaCorreta = (TextView) findViewById(R.id.respostaCorreta);
        categoria = (TextView) findViewById(R.id.tituloCategoria);
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------


        // DEFINE A CATEGORIA A QUAL A PERGUNTA PERTENCE
        categoria.setText(GameActivity.CategoriaSelecionada);

        // DEFINE SE AS RESPOSTA É A CORRETA, E ALTERA AS IMAGENS E TEXTS DO LAYOUT
        if(respondida == obj.getCorreta()){
            imagemCerta.setImageDrawable(getResources().getDrawable(R.drawable.checkmark));
            resultado.setText("Acertou!");
            respostaCorreta.setText(respostaCorreta(obj));
            // ADICIONA A CONTAGEM DO NUMERO DE PERGUNTAS RESPONDIDAS CORRETAMENTE
            GameActivity.contador = GameActivity.contador + 1;
        }else{
            imagemCerta.setImageDrawable(getResources().getDrawable(R.drawable.wrong));
            resultado.setText("Errou!");
            respostaCorreta.setText(respostaCorreta(obj));
        }

        //------------------------------------------------------------------------------------------
        // THREAD QUE REALIZA A FINALIZAÇÃO AUTOMATICA DA ACTIVITY NOS SEGUNDOS ESTIPULADOS
        //------------------------------------------------------------------------------------------
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finish();
            }
        });
        thread.start();
        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
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
