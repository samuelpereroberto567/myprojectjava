package filme;

public class Filme {
	String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

   
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = 0.0;
        this.totalDeAvaliacoes = 0;
    }

    
  // Método para exibir a ficha técnica do filme
public void exibeFichaTecnica() {
    // Exibe o nome do filme
    System.out.println("Nome: " + nome);

    // Exibe o ano de lançamento do filme
    System.out.println("Ano de Lançamento: " + anoDeLancamento);

    // Exibe a duração do filme em minutos
    System.out.println("Duração em Minutos: " + duracaoEmMinutos);

    // Exibe se o filme está incluído no plano
    System.out.println("Incluído no Plano: " + (incluidoNoPlano ? "Sim" : "Não"));
}
    
    public void avalia(int avaliacao) {
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacoes++;
    }

    
    public double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0.0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
