package apppetshop;

public class petshop {
	 private int codPet;
	    private String chipPet;
	    private String nomePet;
	    private String dataNascPet;
	    private String racaPet;


	    public petshop(int codPet, String chipPet, String nomePet, String dataNascPet, String racaPet) {
	        this.codPet = codPet;
	        this.chipPet = chipPet;
	        this.nomePet = nomePet;
	        this.dataNascPet = dataNascPet;
	        this.racaPet = racaPet;
	    }

	    // Metodo para cadastrar um novo pet
	    public void cadastrarPet(int codPet, String chipPet, String nomePet, String dataNascPet, String racaPet) {
	        this.codPet = codPet;
	        this.chipPet = chipPet;
	        this.nomePet = nomePet;
	        this.dataNascPet = dataNascPet;
	        this.racaPet = racaPet;

	        System.out.println("Pet cadastrado com sucesso!");
	    }


	    public int getCodPet() {
	        return codPet;
	    }

	    public String getChipPet() {
	        return chipPet;
	    }

	    public String getNomePet() {
	        return nomePet;
	    }

	    public String getDataNascPet() {
	        return dataNascPet;
	    }

	    public String getRacaPet() {
	        return racaPet;
	    }
}
