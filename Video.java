package exercicio.streaming;

public class Video {
    private String titulo;
    private String diretor;
    private String[] elenco;
    private String genero;
    private String sinopse;
    private int anoLancamento;
    private int ClassificacaoInfdicativa;


    public Video(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int ClassificacaoIndicativa){
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
        this.ClassificacaoInfdicativa = ClassificacaoIndicativa;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String[] getElenco(){
        return elenco;
    }

    public void setElenco(String[] elenco){
        this.elenco = elenco;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getSinopse(){
        return sinopse;
    }

    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public int getClassificacaoInfdicativa(){
        return ClassificacaoInfdicativa;
    }

    public void setClassificacaoInfdicativa(int ClassificacaoIndicativa){
        this.ClassificacaoInfdicativa = ClassificacaoIndicativa;
    }
}
