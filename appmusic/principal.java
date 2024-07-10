package appmusic;

public class principal {
	  public static void main(String[] args) {
	       
	        Podcast podcast = new Podcast("Podcast de Tecnologia", "bolhaDev", 1800, "samuel");
	        podcast.reproduzir();

	        
	        Musica musica = new Musica("its my life", "Bon jovi", 240, "rock");
	        musica.reproduzir();
	    }
}
