package projetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class estoque {
      public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>(); // Mapa para armazenar produtos e suas quantidades
        Scanner output = new Scanner(System.in);
        boolean executando = true;

        // Loop principal do sistema
        while (executando) {
            // Exibição do menu
            System.out.println("Sistema de Registro de Estoque");
            System.out.println("1. Registrar entrada de produto");
            System.out.println("2. Registrar saida de produto");
            System.out.println("3. Verificar quantidade de produto");
            System.out.println("4. Sair do sistema");
            System.out.println("==========================================");
            System.out.print("Escolha uma opção: ");
            int opcao = output.nextInt(); // Leitura da opção escolhida pelo usuário

            // Execução da operação escolhida pelo usuário
            switch (opcao) {
                case 1:
                    registrarEntrada(estoque, output);
                    break;
                case 2:
                    registrarSaida(estoque, output);
                    break;
                case 3:
                    verificarQuantidade(estoque, output);
                    break;
                case 4:
                    executando = false; // Encerra o loop principal
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        }

        System.out.println("Sistema encerrado.");
        output.close(); // Fechar o Scanner para liberar recursos
    }

    // Método para registrar a entrada de um produto no estoque
    private static void registrarEntrada(Map<String, Integer> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.next(); // Leitura do nome do produto

        System.out.print("Digite a quantidade a ser adicionada: ");
        int quantidade = scanner.nextInt(); // Leitura da quantidade a ser adicionada

        if (estoque.containsKey(produto)) {
            int quantidadeAtual = estoque.get(produto);
            estoque.put(produto, quantidadeAtual + quantidade); // Atualiza a quantidade do produto existente
        } else {
            estoque.put(produto, quantidade); // Adiciona um novo produto ao estoque
        }

        System.out.println("Entrada de produto registrada com sucesso.");
    }

    // Método para registrar a saída de um produto do estoque
    private static void registrarSaida(Map<String, Integer> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.next(); // Leitura do nome do produto

        if (estoque.containsKey(produto)) {
            System.out.print("Digite a quantidade a ser retirada: ");
            int quantidade = scanner.nextInt(); // Leitura da quantidade a ser retirada

            int quantidadeAtual = estoque.get(produto);
            if (quantidade <= quantidadeAtual) {
                estoque.put(produto, quantidadeAtual - quantidade); // Atualiza a quantidade do produto
                System.out.println("Saída de produto registrada com sucesso.");
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para verificar a quantidade disponível de um produto no estoque
    private static void verificarQuantidade(Map<String, Integer> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.next(); // Leitura do nome do produto

        if (estoque.containsKey(produto)) {
            int quantidadeAtual = estoque.get(produto);
            System.out.println("Quantidade disponível: " + quantidadeAtual);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
