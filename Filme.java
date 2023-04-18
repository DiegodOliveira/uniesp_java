package exercicio.streaming;

public class Filme extends Video{
    private int duracao;

    public Filme(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int ClassificacaoIndicativa, int duracao){
        super(titulo, diretor, elenco, genero, sinopse, anoLancamento, ClassificacaoIndicativa);
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

}
