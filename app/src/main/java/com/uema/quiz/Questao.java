package com.uema.quiz;

public class Questao {

    private int ID;

    private String Pergunta;

    private String Resposta1;

    private String Resposta2;

    private String Resposta3;

    private String Resposta4;

    private int Correta;

    private String  Categoria;

    public Questao(String Pergunta, String Resposta1, String Resposta2, String Resposta3, String Resposta4, int Correta, String Categoria){
        this.Pergunta = Pergunta;
        this.Resposta1 = Resposta1;
        this.Resposta2 = Resposta2;
        this.Resposta3 = Resposta3;
        this.Resposta4 = Resposta4;
        this.Correta = Correta;
        this.Categoria = Categoria;
    }

    public String getPergunta() {
        return Pergunta;
    }

    public void setPergunta(String pergunta) {
        Pergunta = pergunta;
    }

    public String getResposta1() {
        return Resposta1;
    }

    public void setResposta1(String resposta1) {
        Resposta1 = resposta1;
    }

    public String getResposta2() {
        return Resposta2;
    }

    public void setResposta2(String resposta2) {
        Resposta2 = resposta2;
    }

    public String getResposta3() {
        return Resposta3;
    }

    public void setResposta3(String resposta3) {
        Resposta3 = resposta3;
    }

    public String getResposta4() {
        return Resposta4;
    }

    public void setResposta4(String resposta4) {
        Resposta4 = resposta4;
    }

    public int getCorreta() {
        return Correta;
    }

    public void setCorreta(int correta) {
        Correta = correta;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
