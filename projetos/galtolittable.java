package projetos;
public class galtolittable {
	public static void main(String[] args) {
        double gallons, liters; // Declaração de variáveis para galões e litros
        int counter; // Declaração de uma variável contador
        counter = 0; // Inicialização do contador

        // Loop para converter de 1 a 100 galões para litros
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // Converte galões para litros
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++; // Incrementa o contador

            // Verifica se o contador atingiu 10
            if (counter == 10) {
                System.out.println(); // Exibe uma linha em branco
                counter = 0; // Reseta o contador
            }
        }
 /* 
Este programa converte galões para litros em um loop de 1 a 100.
Para cada galão, a conversão é feita multiplicando por 3.7854, 
e o resultado é exibido na tela. A cada 10 linhas, o programa 
exibe uma linha em branco para melhorar a legibilidade.
*/
	}
}



