package com.uema.quiz.Model;

import com.uema.quiz.Categoria;
import com.uema.quiz.Model.Questao;

import java.util.ArrayList;

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
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "NOME DO DIRETOR DO FILME X",
                "SEI LA",
                "talves",
                "nunca",
                "quem sabe",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Qual o dia da proclamacao da republica",
                "1994",
                "1995",
                "1503",
                "1505",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quantos paus se faz uma canoa",
                "3",
                "4",
                "5",
                "nenhum",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "Quem foi Dom pedro 3",
                "rei",
                "monarca",
                "ze ninguem",
                "sei la",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        lista.add(new Questao(
                "O dia em que a terra parou",
                "30-12-2019",
                "30-1-2019",
                "30-2-2019",
                "coloca qualquer merda ai",
                3,
                Categoria.CONHECIMENTOS_GERAIS));
        return lista;
    }
}
