package exercicio.streaming;
import java.time.LocalDateTime;

public class Acesso {
    private Usuario usuario;
    private String titulo;
    private LocalDateTime dataHora;

    public Acesso(Usuario usuario, String titulo){
        this.usuario = usuario;
        this.titulo = titulo;
        this.dataHora = LocalDateTime.now();
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}


