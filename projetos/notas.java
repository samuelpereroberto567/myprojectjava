package projetos;
import java.util.Scanner;
public class notas {
	public static void main(String[] args) {
        Scanner output = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        // Leitura dos nomes e notas dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = output.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = output.nextDouble();
            output.nextLine(); // Consumir a quebra de linha
        }

        // Ordenação dos alunos por nota (ordem crescente)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double tempNota = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = tempNota;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        // Exibição dos alunos cadastrados em ordem crescente de nota
        System.out.println("\nAlunos cadastrados em ordem crescente de nota:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " - " + notas[i]);
        }

        output.close();
    }
	}

