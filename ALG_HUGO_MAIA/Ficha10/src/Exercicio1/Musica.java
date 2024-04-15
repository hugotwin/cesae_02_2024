package Exercicio1;

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duração;


    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duração = duracao;

    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuração() {
        return duração;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
