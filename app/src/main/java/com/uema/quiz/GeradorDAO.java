package com.uema.quiz;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class GeradorDAO extends DAO{

    public ArrayList<Questao> Escolhidas;

    public GeradorDAO(Context ctx){
        super(ctx);
    }

    public void capturarQuestoes(String Categoria){
        String select = SQLDao.QUESTAO_ID + " = ?";
        Cursor x = database.rawQuery("SELECT * FROM " + SQLDao.TABLE_QUESTAO + " WHERE "
                + SQLDao.QUESTAO_CATEGORIA + " = '" + Categoria +"' ORDER BY RANDOM() LIMIT 3", null);
        x.moveToFirst();
        while (!x.isAfterLast()){
            System.out.println("Pergunta" + x.getString(1));
            x.moveToNext();
        }
        System.out.println("Questoes selecionadas" + x.getCount());
    }

    public boolean verificarResposta(int opcao, Questao respondida){
        if(respondida.getCorreta() == opcao){
            return true;
        }
        return false;
    }
}
