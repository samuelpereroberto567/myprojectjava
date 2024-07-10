package appmusic;

public class Podcast extends Audio {
	private String host;

    public Podcast(String titulo, String artista, int duracao, String host) {
        super(titulo, artista, duracao);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}

