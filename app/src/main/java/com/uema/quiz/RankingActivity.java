package com.uema.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.uema.quiz.Model.Pessoa;
import com.uema.quiz.Model.Ranking;
import com.uema.quiz.SQLDATA.RankingDAO;

import java.util.ArrayList;
import java.util.List;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        ListView listaRanking = findViewById(R.id.ranking);

        RankingDAO ranking = new RankingDAO(this);
        ranking.open();

        List<Ranking> objs = ranking.getListaRanking();

        ArrayAdapter<Ranking> adapter = new ArrayAdapter<Ranking>(this,android.R.layout.simple_list_item_1,objs);

        listaRanking.setAdapter(adapter);


    }
}
