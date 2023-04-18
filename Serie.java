package exercicio.streaming;

public class Serie extends Video{
    private int temporadas;
    private int episodios;

    public Serie(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int ClassicacaoIndicativa, int temporadas, int episodios){
        super(titulo, diretor, elenco, genero, sinopse, anoLancamento, ClassicacaoIndicativa);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getEpisodios(){
        return episodios;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
}
