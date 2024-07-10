package projetos;

import java.util.ArrayList;

public class pokemoninicial {
     public static void main(String[] args) {
        ArrayList<String> output = new ArrayList<String>();

        output.add("Pikachu");
        output.add("Bulbassauro");
        output.add("Charmander ");
        output.add("Squirtle");

        //output.remove(0);
        for (String nome : output) {
            System.out.println(nome);
        }
    }
}
