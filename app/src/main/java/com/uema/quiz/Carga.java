package com.uema.quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Carga {

    public static ArrayList<Questao> GetListQuestoes(){
        ArrayList<Questao> lista = new ArrayList<Questao>();
        lista.add(new Questao(
                "EM QUE ANO NASCEU DOM PEDRO I",
                "1950",
                "1530",
                "1532",
                "1615",
                4,
                Categoria.HISTORIA));
        lista.add(new Questao(
                "NOME DO DIRETOR DO FILME X",
                "SEI LA",
                "DSAD",
                "DSAD",
                "DSAD",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "DASDSA",
                "WEQWEQ",
                "DSAD",
                "YTR",
                "YUTUYT",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "BVBCNCV",
                "GFDGHGF",
                "FDSFSD",
                "RWER",
                "FDSUYE",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "EWQEQWEWQWQE",
                "YTUYT",
                "GFFDGFD",
                "HJHGJHGJ",
                "NVBNBV",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "NBVNVNBV",
                "HGFH",
                "TDSFD",
                "UYUEDDA",
                "QWEVDSA",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        return lista;
    }
}
