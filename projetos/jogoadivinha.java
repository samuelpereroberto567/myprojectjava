package projetos;
import java.util.Scanner;
public class jogoadivinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int no = 42;  // Número secreto
        int numerousuario;
        int tentativas = 0;
        final int maxTentativas = 5;
        boolean acertou = false;

        do {
            tentativas = 0; // Reseta o número de tentativas para a nova rodada
            while (tentativas < maxTentativas) {
                System.out.print("Digite um numero: ");
                numerousuario = entrada.nextInt();
                tentativas++;

                if (numerousuario < no) {
                    System.out.println("Maior");
                } else if (numerousuario > no) {
                    System.out.println("Menor");
                } else {
                    System.out.println("Parabens, voce acertou!");
                    acertou = true;
                    break;
                }
            }

            if (!acertou) {
                System.out.println("Você excedeu o número de tentativas.");
                System.out.print("Você quer continuar? (s/n): ");
                entrada.nextLine(); // Consumir a quebra de linha pendente
                String resposta = entrada.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    break;
                }
            }
        } while (!acertou);

        entrada.close();
    }
}

