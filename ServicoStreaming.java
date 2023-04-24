package exercicio.streaming;
import java.util.ArrayList;

public class ServicoStreaming {
    private ArrayList<Video> videosDisponiveis;
    private ArrayList<Usuario> usuariosCadastrados;
    private ArrayList<Acesso> acessosRegistrados;

    public ServicoStreaming(){
        this.videosDisponiveis = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
        this.acessosRegistrados = new ArrayList<>();
    }

    public void adicionarVideo(Video video){
        videosDisponiveis.add(video);
    }

    public void removerVideo(Video video){
        videosDisponiveis.remove(video);
    }

    public ArrayList<Video> getVideosDisponiveis(){
        return videosDisponiveis;
    }

    public void setVideosDisponiveis(ArrayList<Video> videosDisponiveis){
        this.videosDisponiveis = videosDisponiveis;
    }

    public ArrayList<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(ArrayList<Usuario> usuariosCadastrados){
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public ArrayList<Acesso> getAcessosRegistrados() {
        return acessosRegistrados;
    }

    public void setAcessosRegistrados(ArrayList<Acesso> acessosRegistrados) {
        this.acessosRegistrados = acessosRegistrados;
    }

    public boolean validarClassificacao(Usuario usuario, Video video){
        ValidadorClassificacao validador = new ValidadorClassificacao();
        return validador.validar(1);
    }


    public boolean adicionarFavorito(Usuario usuario, Video video){
        Favoritos favoritos = new Favoritos(usuario);
        return favoritos.adicionarVideoFavorito(video);
    }

    public boolean removerFavorito(Usuario usuario, Video video) {
        Favoritos favoritos = new Favoritos(usuario);
        return favoritos.removerVideoFavorito(video);
    }

    public Playlist criarPlaylist(Usuario usuario, String nomePlaylist) {
        Playlist playlist = new Playlist(nomePlaylist);
        Playlist.adicionarVideoPlaylist(playlist);
        return playlist;
    }

    public void removerPlaylist(Usuario usuario, Playlist playlist) {
        Playlist.removerVideoPlaylist(playlist);
    }

    public boolean adicionarItemPlaylist(Playlist playlist, ItemPlaylist item) {
        return playlist.adicionarItem(item);
    }

    public boolean removerItemPlaylist(Playlist playlist, ItemPlaylist item) {
        return playlist.removerItem(item);
    }

    public void reproduzirItemPlaylist(Playlist playlist) {
        playlist.reproduzir();
    }


}
