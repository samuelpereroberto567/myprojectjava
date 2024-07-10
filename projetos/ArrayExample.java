package projetos;

import java.util.Scanner;

public class ArrayExample {
     public static void main(String[] args) {
        Scanner troca = new Scanner(System.in);

        // Declaração de um buffer de bytes com comprimento 1024
        byte[] buffer = new byte[1024];

        // Declaração de um array de inteiros com 10 elementos
        int[] numerais = new int[10];

        // Declaração de um array de strings com 3 elementos
        String[] chamada = new String[3];

        // Exibição do comprimento do buffer
        System.out.println("Comprimento do buffer: " + buffer.length);

        // Exibição do valor do 9º elemento do array 'numerais' (índice 8, pois começa em 0)
        System.out.println("Valor do 9º elemento em numerais: " + numerais[8]);

        // Exibição do comprimento do array 'chamada'
        System.out.println("Comprimento do chamada: " + chamada.length);

        // Declaração e inicialização de um array de inteiros
        int[] vetor = { 10, 20, 30 };

        // Exibição do valor do 3º elemento do array 'vetor' (índice 2)
        System.out.println("Valor do 3º elemento em vetor: " + vetor[2]);

        // Declaração de um array de doubles com 5 elementos
        double[] arrayD = new double[5];

        // Leitura de valores do usuário e armazenamento no array 'arrayD'
        System.out.println("Digite 5 valores para o array de doubles:");
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = troca.nextDouble();
        }

        // Exibição dos valores armazenados no array 'arrayD'
        System.out.println("Valores em arrayD:");
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }

        // Declaração e inicialização de um array de inteiros
        int[] num = { 1, 2, 3 };

        // Exibição do valor do 1º elemento do array 'num' (índice 0)
        System.out.println("Valor do 1º elemento em num: " + num[0]);

        // Exibição do comprimento do array 'num'
        System.out.println("Comprimento de num: " + num.length);

        // Alteração do valor do 3º elemento do array 'num' (índice 2)
        num[2] = 50;
        System.out.println("Novo valor do 3º elemento em num: " + num[2]);

        // Alteração do valor do 1º elemento do array 'num' (índice 0)
        num[0] = 10;
        System.out.println("Novo valor do 1º elemento em num: " + num[0]);

        troca.close(); // Fechar o Scanner para liberar recursos
    }
}
