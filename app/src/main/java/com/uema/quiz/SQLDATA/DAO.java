package com.uema.quiz.SQLDATA;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public abstract class DAO {

    protected SQLiteDatabase database;

    protected SQLDao startSQL;

    protected String[] COLUMNS_TABLE_QUESTAO = {
            SQLDao.QUESTAO_ID , SQLDao.QUESTAO_PERGUNTA , SQLDao.QUESTAO_RESPOSTA1 ,
            SQLDao.QUESTAO_RESPOSTA2 , SQLDao.QUESTAO_RESPOSTA3 , SQLDao.QUESTAO_RESPOSTA4,
            SQLDao.QUESTAO_CATEGORIA
    };

    protected String[] COLUMNS_TABLE_RANKING = {
            SQLDao.RANKING_ID , SQLDao.RANKING_NOME , SQLDao.RANKING_PONTUACAO
    };

    public void open() throws SQLException {
        this.database = this.startSQL.getWritableDatabase();
    }

    public void close() throws SQLException{
        startSQL.close();
    }

    public DAO(Context ctx){
        this.startSQL = new SQLDao(ctx);
    }
}
