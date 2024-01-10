package org.filmes.calculos;

public class FiltroRecomendacao {

    public void filtra(Classficacao classficacao){
        if(classficacao.getClassficacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if(classficacao.getClassficacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");

        }
    }

}
