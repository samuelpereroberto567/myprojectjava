package projetos;

import java.util.Scanner;

public class anime {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do anime");
        String nome = scanner.nextLine();

        System.out.println("quem e o protagonista desse anime");
        String protagonista = scanner.nextLine();

        System.out.println("quem e o seu personagem favorito");
        String favorito = scanner.nextLine();

        System.out.println("digite quantas temporadas tem esse anime");
        int temporadas = scanner.nextInt();



        System.out.println("\nanime ");
        System.out.println("================");
        System.out.println("nome do anime: " + nome);
        System.out.println("protagonista: " + protagonista);
        System.out.println("personagem favorito: " + favorito);
        System.out.println("temporadas do anime: " + temporadas + " temporadas");

        scanner.close();
    }
}
