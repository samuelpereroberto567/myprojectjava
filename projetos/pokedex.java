package projetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pokedex {
    public static void main(String[] args) {
        Map<String, Integer> poke = new HashMap<>();
        Scanner output = new Scanner(System.in);
        boolean executando = true;
        while (executando) {
            System.out.println("1. adicionar um pokemon ");
            System.out.println("2. remover um pokemon ");
            System.out.println("3. monstra  pokemon na pokedex");
            System.out.println("4. Sair do sistema");
            System.out.println("==========================================");
            System.out.print("Escolha uma opção: ");
            int opcao = output.nextInt();

            switch (opcao) {
                case 1:
                    adicionarpokemon(poke, output);
                    break;
                case 2:
                    removerpokemon(poke, output);
                    break;
                case 3:
                    monstrarpodex(poke, output);
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
        System.out.println("Sistema encerrado.");
        output.close();
    }

    private static void adicionarpokemon(Map<String, Integer> poke, Scanner output) {
        System.out.print("Digite o nome do pokemon: ");
        String pokemon = output.next();

        if (poke.containsKey(pokemon)) {
            System.out.println(pokemon + " já existe na sua pokedex");
        } else {
            poke.put(pokemon, 1);
            System.out.println(pokemon + " foi adicionado a sua pokedex");
        }
    }

    private static void removerpokemon(Map<String, Integer> poke, Scanner output) {
        System.out.print("Digite o nome do  pokemon: ");
        String pokemonremover = output.next();

        if (poke.containsKey(pokemonremover)) {
            poke.remove(pokemonremover);
            System.out.println(pokemonremover + " foi removido");
        } else {
            System.out.println("Pokémon não existe na sua pokedex");
        }
    }

    private static void monstrarpodex(Map<String, Integer> poke, Scanner output) {
        System.out.println("Pokédex:");

        System.out.print("Pesquisar por Pokémon: ");
        String pokemonPesquisar = output.next();

        for (String pokemon : poke.keySet()) {
            if (pokemon.contains(pokemonPesquisar)) {
                System.out.println(pokemon);
            }
        }
    }
}
