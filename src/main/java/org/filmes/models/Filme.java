package org.filmes.models;

import org.filmes.calculos.Classficacao;

public class Filme extends Titulo implements Classficacao {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassficacao() {
        return (int)pegaMedia() /2;
    }
}
