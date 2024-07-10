package projetos;

import javax.swing.JOptionPane;

public class aluno {
      public static void main(String[] args) {
        // Solicitação das informações do aluno
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno:"));
        String telefone = JOptionPane.showInputDialog(null, "Digite o número de telefone do aluno:");
        String endereco = JOptionPane.showInputDialog(null, "Digite o endereço do aluno:");
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do aluno:");
        String nomePai = JOptionPane.showInputDialog(null, "Digite o nome do pai do aluno:");
        String nomeMae = JOptionPane.showInputDialog(null, "Digite o nome da mãe do aluno:");
        String instituicao = JOptionPane.showInputDialog(null, "Digite o nome da instituição de ensino (faculdade):");

        // Solicitação das notas do aluno
        float n1 = obterNota("Digite a primeira nota:");
        float n2 = obterNota("Digite a segunda nota:");
        float n3 = obterNota("Digite a terceira nota:");
        float n4 = obterNota("Digite a quarta nota:");
        float n5 = obterNota("Digite a quinta nota:");
        float n6 = obterNota("Digite a sexta nota:");

        // Cálculo da média das notas
        float media = calcularMedia(n1, n2, n3, n4, n5, n6);

        // Exibição dos dados do aluno e sua média
        JOptionPane.showMessageDialog(null, "Aluno: " + nome +
                                          "\nIdade: " + idade +
                                          "\nTelefone: " + telefone +
                                          "\nEndereço: " + endereco +
                                          "\nCPF: " + cpf +
                                          "\nNome do Pai: " + nomePai +
                                          "\nNome da Mãe: " + nomeMae +
                                          "\nInstituição de Ensino: " + instituicao +
                                          "\nMédia: " + media);

        // Determinação e exibição do status do aluno baseado na média
        String status = determinarStatus(media);
        JOptionPane.showMessageDialog(null, "O aluno " + nome + " está " + status);
    }

    // Função para obter uma nota, tratando exceções
    private static float obterNota(String mensagem) {
        float nota = 0;
        boolean notaValida = false;

        while (!notaValida) {
            try {
                nota = Float.parseFloat(JOptionPane.showInputDialog(null, mensagem));
                if (nota >= 0 && nota <= 10) {
                    notaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Nota inválida. Digite uma nota entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um valor numérico válido.");
            }
        }

        return nota;
    }

    // Função para calcular a média das notas
    private static float calcularMedia(float n1, float n2, float n3, float n4, float n5, float n6) {
        return (n1 + n2 + n3 + n4 + n5 + n6) / 6;
    }

    // Função para determinar o status do aluno baseado na média
    private static String determinarStatus(float media) {
        if (media >= 7) {
            return "aprovado";
        } else if (media >= 5) {
            return "em recuperação";
        } else {
            return "reprovado";
        }
    }
}
