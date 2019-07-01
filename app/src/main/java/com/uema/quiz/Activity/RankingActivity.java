package com.uema.quiz.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.uema.quiz.Model.Pessoa;
import com.uema.quiz.Model.Ranking;
import com.uema.quiz.R;
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

        ArrayAdapter<Ranking> adapter = new ArrayAdapter<Ranking>(this,android.R.layout.simple_list_item_1,objs){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextColor(Color.WHITE);
                return view;
            }
        };

        listaRanking.setAdapter(adapter);


    }
}
