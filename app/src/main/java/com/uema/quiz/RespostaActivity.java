package com.uema.quiz;

import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                finish();
            }
        });

        thread.start();


    }
}
