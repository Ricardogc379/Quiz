package com.uema.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.uema.quiz.Model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        ListView listaPessoa = findViewById(R.id.ranking);

        List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa("Cicero",1);
        Pessoa p2 = new Pessoa("Lynna",3);
        Pessoa p3 = new Pessoa("Ricardo",2);
        Pessoa p4 = new Pessoa("Antonio",0);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this,android.R.layout.simple_list_item_1,lista);

        listaPessoa.setAdapter(adapter);


    }
}
