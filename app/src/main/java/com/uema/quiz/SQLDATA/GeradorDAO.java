package com.uema.quiz.SQLDATA;

import android.content.Context;
import android.database.Cursor;

import com.uema.quiz.Model.Questao;

import java.util.ArrayList;

public class GeradorDAO extends DAO {

    public ArrayList<Questao> Escolhidas;

    public GeradorDAO(Context ctx){
        super(ctx);
    }

    public ArrayList<Questao> capturarQuestoes(String Categoria){
        String select = SQLDao.QUESTAO_ID + " = ?";
        Cursor x = database.rawQuery("SELECT * FROM " + SQLDao.TABLE_QUESTAO + " WHERE "
                + SQLDao.QUESTAO_CATEGORIA + " = '" + Categoria +"' ORDER BY RANDOM() LIMIT 10", null);
        x.moveToFirst();

        ArrayList<Questao> questoes = new ArrayList<Questao>();

        while (!x.isAfterLast()){
            System.out.println("Pergunta" + x.getString(1));
            Questao obj = new Questao(x.getString(1),
                    x.getString(2),
                    x.getString(3),
                    x.getString(4),
                    x.getString(5),
                    x.getInt(6),
                    x.getString(7));
            obj.setID(x.getInt(0));
            questoes.add(obj);
            x.moveToNext();
        }
        System.out.println("Questoes selecionadas" + x.getCount());
        return questoes;
    }

    public boolean verificarResposta(int opcao, Questao respondida){
        if(respondida.getCorreta() == opcao){
            return true;
        }
        return false;
    }
}
