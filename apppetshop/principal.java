package apppetshop;

public class principal {
	  public static void main(String[] args) {
	       
	        petshop pet = new petshop(0, "", "", "", "");

	        
	        pet.cadastrarPet(1, "123456", "Rex", "01/01/2010", "Labrador");

	  // Exibição dos detalhes do pet cadastrado
System.out.println("Detalhes do pet cadastrado:");

// Exibe o código do pet
System.out.println("Código: " + pet.getCodPet());

// Exibe o chip do pet
System.out.println("Chip: " + pet.getChipPet());

// Exibe o nome do pet
System.out.println("Nome: " + pet.getNomePet());

// Exibe a data de nascimento do pet
System.out.println("Data de Nascimento: " + pet.getDataNascPet());

// Exibe a raça do pet
System.out.println("Raça: " + pet.getRacaPet());
	    }
}
