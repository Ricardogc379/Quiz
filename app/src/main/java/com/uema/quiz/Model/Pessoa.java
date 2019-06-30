package com.uema.quiz.Model;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private int pontos;

    public Pessoa(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    //Isso aqui coloca a pontuacao do lado do nome na lista, como acontece?, é um misterio...
    @Override
    public String toString(){
        return getNome() + "  -  " + getPontos();
    }

}
