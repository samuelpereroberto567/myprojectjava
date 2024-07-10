package filme;

public class media {
	public static void main(String[] args) {
        
        Filme output = new Filme("batman", 2023, 100, true);

       
        output.exibeFichaTecnica();

        
        output.avalia(8); 
        output.avalia(9); 
        output.avalia(7); 
        output.avalia(9);
       
        System.out.println("Media das Avaliações: " + output.pegaMedia());
    }
}
