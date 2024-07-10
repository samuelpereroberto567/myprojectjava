package projetos;

import java.util.Scanner;

public class banco {
    private String nome; // Nome do titular da conta
    private String tipoConta; // Tipo de conta (Corrente, Poupança, etc.)
    private double saldo; // Saldo da conta

    // Construtor para inicializar os atributos da conta
    public banco(String nome, String tipoConta, double saldoInicial) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    // Método para realizar uma transferência e subtrair o valor do saldo, se houver saldo suficiente
    public void fazTransferencia(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    // Método para enviar um PIX, reutiliza o método de transferência
    public void enviaPix(double valor) {
        fazTransferencia(valor);
    }

    // Método para adicionar valor ao saldo (receber transferência)
    public void recebeTransferencia(double valor) {
        saldo += valor;
    }

    // Método para consultar e exibir o saldo atual da conta
    public void consultarSaldos() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        Scanner output = new Scanner(System.in); // Scanner para leitura de entrada do usuário

        // Criação de uma conta bancária virtual com dados iniciais
        System.out.println("Dados iniciais do cliente:");
        banco conta = new banco("Samuel", "Corrente", 6500.0);
        System.out.println("Nome: " + conta.nome);
        System.out.println("Tipo de conta: " + conta.tipoConta);
        System.out.println("Saldo inicial: R$" + conta.saldo);
        System.out.println("*********************");

        int opcao; // Variável para armazenar a opção escolhida pelo usuário no menu
        do {
            // Exibição do menu de operações
            System.out.println("\nOperações\n");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = output.nextInt(); // Leitura da opção escolhida pelo usuário

            // Execução da operação escolhida pelo usuário
            switch (opcao) {
                case 1:
                    // Consultar saldo
                    conta.consultarSaldos();
                    break;
                case 2:
                    // Receber valor
                    System.out.print("Informe o valor a receber: ");
                    double valorRecebido = output.nextDouble();
                    conta.recebeTransferencia(valorRecebido);
                    System.out.println("Saldo atualizado: R$" + conta.saldo);
                    break;
                case 3:
                    // Transferir valor
                    System.out.print("Informe o valor a transferir: ");
                    double valorTransferencia = output.nextDouble();
                    conta.enviaPix(valorTransferencia);
                    System.out.println("Saldo atualizado: R$" + conta.saldo);
                    break;
                case 4:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;
                default:
                    // Opção inválida
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4); // Repetir até que a opção de sair seja escolhida

        output.close(); // Fechar o Scanner para liberar recursos
    }
    }
    
    

