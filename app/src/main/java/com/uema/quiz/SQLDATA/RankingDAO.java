package com.uema.quiz.SQLDATA;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;

import com.uema.quiz.Model.Ranking;

import java.util.ArrayList;

public class RankingDAO extends DAO{

    public RankingDAO(Context ctx) {
        super(ctx);
    }

    public void salvarPontuacao(Ranking receiver){
        try{
            ContentValues campos = new ContentValues();
            campos.put(SQLDao.RANKING_NOME, receiver.getNome());
            campos.put(SQLDao.RANKING_CATEGORIA, receiver.getCategoria());
            campos.put(SQLDao.RANKING_PONTUACAO, receiver.getPontuacao());
            database.insert(SQLDao.TABLE_RANKING, null, campos);
            System.out.println("Salvo com sucesso!");
        }catch (SQLException e){
            System.out.println("Erro ao salvar pontuação no Ranking!");
        }
    }

    public ArrayList<Ranking> getListaRanking(){
        ArrayList<Ranking> listaRanking = new ArrayList<Ranking>();
        try {
            Cursor strSQL = database.rawQuery("SELECT * FROM " + SQLDao.TABLE_RANKING + " ORDER BY " + SQLDao.RANKING_PONTUACAO + " DESC", null);
            strSQL.moveToFirst();
            if(strSQL.getCount() > 0){
                while(!strSQL.isAfterLast()){
                    Ranking obj = new Ranking();
                    obj.setNome(strSQL.getString(1));
                    obj.setCategoria(strSQL.getString(2));
                    obj.setPontuacao(strSQL.getInt(3));
                    listaRanking.add(obj);
                    strSQL.moveToNext();
                }
            }
        }catch (SQLException e){
            System.out.println("Erro ao listar o Ranking!");
        }
        return listaRanking;
    }
}
