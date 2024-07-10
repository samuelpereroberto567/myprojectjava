package projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class registroDOtrem {
      public static void main(String[] args) {
     
        double valorPassagem = 15.90;
        System.out.println("Valor da passagem: " + valorPassagem);

        ArrayList<String> passageirosMasculinos = new ArrayList<>();
        ArrayList<String> passageirosFemininos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do passageiro (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o genero do passageiro (M/F): ");
            String genero = scanner.nextLine();

            if (genero.equalsIgnoreCase("M")) {
                passageirosMasculinos.add(nome);
            } else if (genero.equalsIgnoreCase("F")) {
                passageirosFemininos.add(nome);
            } else {
                System.out.println("Genero invalido. Use M para masculino ou F para feminino.");
            }
        }

        scanner.close();

        System.out.println("\nPassageiros masculinos cadastrados:");
        for (String passageiro : passageirosMasculinos) {
            System.out.println("- " + passageiro);
        }

        System.out.println("\nPassageiros femininos cadastrados:");
        for (String passageiro : passageirosFemininos) {
            System.out.println("- " + passageiro);
        }
    }
}
