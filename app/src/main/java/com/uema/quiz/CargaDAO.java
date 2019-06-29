package com.uema.quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CargaDAO {

    private SQLiteDatabase database;

    private SQLDao startSQL;

    private String[] TABLE_QUESTAO = {
            SQLDao.QUESTAO_ID , SQLDao.QUESTAO_PERGUNTA , SQLDao.QUESTAO_RESPOSTA1 ,
            SQLDao.QUESTAO_RESPOSTA2 , SQLDao.QUESTAO_RESPOSTA3 , SQLDao.QUESTAO_RESPOSTA4,
            SQLDao.QUESTAO_CATEGORIA
    };

    public CargaDAO(Context ctx){
        this.startSQL = new SQLDao(ctx);
    }

    public void open() throws SQLException{
        this.database = this.startSQL.getWritableDatabase();
    }

    public void close() throws SQLException{
        startSQL.close();
    }

    public boolean salvarBancoQuestoes(ArrayList<Questao> questoes){
        try{
            ContentValues campos = new ContentValues();
            int count = questoes.size();
            System.out.println("Numero de Questoes na lista: " + count);
            for (int x = 0 ; x < questoes.size(); x++) {
                Questao obj = questoes.get(x);
                campos.put(SQLDao.QUESTAO_PERGUNTA, obj.getPergunta());
                campos.put(SQLDao.QUESTAO_RESPOSTA1, obj.getResposta1());
                campos.put(SQLDao.QUESTAO_RESPOSTA2, obj.getResposta2());
                campos.put(SQLDao.QUESTAO_RESPOSTA3, obj.getResposta3());
                campos.put(SQLDao.QUESTAO_RESPOSTA4, obj.getResposta4());
                campos.put(SQLDao.QUESTAO_CORRETA, obj.getCorreta());
                campos.put(SQLDao.QUESTAO_CATEGORIA, obj.getCategoria());
                database.insert(SQLDao.TABLE_QUESTAO, null, campos);
            }
            Cursor cursor = database.query(SQLDao.TABLE_QUESTAO,
                    TABLE_QUESTAO,null,null,null,null,null );
            cursor.moveToFirst();
            System.out.println("Numero de Questoes salvas no SQLite: " + cursor.getCount());
            return true;
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }catch (Exception o){
            System.out.println("Erro: " + o.getMessage());
            return false;
        }
    }

}
