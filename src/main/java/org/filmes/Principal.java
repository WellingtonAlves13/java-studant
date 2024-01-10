package org.filmes;

import org.filmes.calculos.CalculadoraDeTempo;
import org.filmes.calculos.FiltroRecomendacao;
import org.filmes.models.Episodio;
import org.filmes.models.Filme;
import org.filmes.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilmes = new Filme();
        meuFilmes.setNome("Carga explosiva");
        meuFilmes.setAnoDeLancamento(2008);
        meuFilmes.setDuracaoEmMinutos(180);
        meuFilmes.setIncluindoNoPlano(true);
        meuFilmes.setSomaDasAvaliacoes(10);
        meuFilmes.exibeFichaTecnica();
        System.out.println("Duração do filme " + meuFilmes.getDuracaoEmMinutos());


        System.out.println();
        Serie csi = new Serie();
        csi.setNome("CSI");
        csi.setAnoDeLancamento(2000);
        csi.exibeFichaTecnica();
        csi.setTemporadas(10);
        csi.setEpisodiosPorTemporada(10);
        csi.setMinutosPorEpisodio(50);
        System.out.println("Maratonar " + csi.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilmes);
        calculadora.inclui(csi);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilmes);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(csi);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);


    }
}
