package com.uema.quiz.SQLDATA;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLDao extends SQLiteOpenHelper {

    private static final String DB_NAME     = "QUIZ.db";

    public static final String TABLE_QUESTAO      = "QUESTAO";
    public static final String QUESTAO_ID         = "ID";
    public static final String QUESTAO_PERGUNTA   = "PERGUNTA";
    public static final String QUESTAO_RESPOSTA1  = "RESPOSTA1";
    public static final String QUESTAO_RESPOSTA2  = "RESPOSTA2";
    public static final String QUESTAO_RESPOSTA3  = "RESPOSTA3";
    public static final String QUESTAO_RESPOSTA4  = "RESPOSTA4";
    public static final String QUESTAO_CORRETA    = "CORRETA";
    public static final String QUESTAO_CATEGORIA  = "CATEGORIA";

    public static final String TABLE_RANKING      = "RANKING";
    public static final String RANKING_ID         = "ID";
    public static final String RANKING_NOME       = "NOME";
    public static final String RANKING_CATEGORIA  = "CATEGORIA";
    public static final String RANKING_PONTUACAO  = "PONTUACAO";

    private static final String DB_CREATE_TABLE_QUESTAO =
            "CREATE TABLE "+ TABLE_QUESTAO +" ("
            + QUESTAO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + QUESTAO_PERGUNTA + " TEXT NOT NULL, "+ QUESTAO_RESPOSTA1 +" TEXT NOT NULL, "+ QUESTAO_RESPOSTA2 + " TEXT NOT NULL, "
            + QUESTAO_RESPOSTA3 + " TEXT NOT NULL, "+ QUESTAO_RESPOSTA4 +" TEXT NOT NULL, " + QUESTAO_CORRETA + " INTEGER NOT NULL, "
            + QUESTAO_CATEGORIA + " TEXT NOT NULL );";

    private static final String DB_CREATE_TABLE_RANKING = "CREATE TABLE " + TABLE_RANKING + " ("
            + RANKING_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + RANKING_NOME + " TEXT NOT NULL, "
            + RANKING_CATEGORIA + " TEXT NOT NULL, "
            + RANKING_PONTUACAO + " INTEGER NOT NULL );";

    private static final int DB_VERSION = 1;

    public SQLDao(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE_TABLE_QUESTAO);
        db.execSQL(DB_CREATE_TABLE_RANKING);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTAO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RANKING);
        onCreate(db);
    }

    public void resetarDB(){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTAO);
        db.execSQL(DB_CREATE_TABLE_QUESTAO);
    }

}
