package projetos;

import java.util.Scanner;

public class fichaderpg {
     public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Ficha de Personagem RPG");
        System.out.println("===================================");


        System.out.print("nome do personagem: ");
        String nome = output.nextLine();

        System.out.print("Raça do personagem: ");
        String raca = output.nextLine();

        System.out.print("Classe do personagem: ");
        String classe = output.nextLine();


        System.out.println("Atributos do personagem:");

        System.out.print("Força: ");
        int forca = output.nextInt();

        System.out.print("Destreza: ");
        int destreza = output.nextInt();

        System.out.print("Constituição: ");
        int constituicao = output.nextInt();

        System.out.print("Inteligência: ");
        int inteligencia = output.nextInt();

        System.out.print("Sabedoria: ");
        int sabedoria = output.nextInt();

        System.out.print("Carisma: ");
        int carisma = output.nextInt();


        System.out.println("\nFicha do Personagem:");
        System.out.println("===========================");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Classe: " + classe);
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constituição: " + constituicao);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Sabedoria: " + sabedoria);
        System.out.println("Carisma: " + carisma);

        output.close();
    }
}
