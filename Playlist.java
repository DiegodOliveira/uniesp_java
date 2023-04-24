package exercicio.streaming;
import java.util.ArrayList;

public class Playlist {
    private Usuario usuario;
    private ArrayList<Video> videosPlaylist;
    private String nome;

    public Playlist(Usuario usuario, String nome) {
        this.usuario = usuario;
        this.videosPlaylist = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarVideoPlaylist(Video video) {
        if (!videosPlaylist.contains(video)) {
            videosPlaylist.add(video);
        }
    }

    public void removerVideoPlaylist(Video video) {
        videosPlaylist.remove(video);
    }

    public ArrayList<Video> getVideosPlaylist() {
        return videosPlaylist;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getNome() {
        return nome;
    }


    public boolean adicionarItem(ItemPlaylist item) {
    }

    public boolean removerItem(ItemPlaylist item) {
    }

    public void reproduzir() {
    }
}
