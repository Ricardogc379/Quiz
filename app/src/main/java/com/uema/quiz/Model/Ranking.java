package com.uema.quiz.Model;

public class Ranking {

    private String Nome;

    private String Categoria;

    private int Pontuacao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        Pontuacao = pontuacao;
    }
}
