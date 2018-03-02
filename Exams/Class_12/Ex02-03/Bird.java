public class Bird extends Animal{

	private String species;
	
	public Bird(String owner, String name, String species){
	
		super(owner, name);
		this.species = species;
	
	}
	
	public String species(){
		return species;
	}
	
	public void setSpecies(){
		this.species = species;
	}
	
	public String toString(){
		return "> NAME: " + getName() + "\n> SPECIES: " + species + "\n> OWNER: " + getOwner() + "\n";
	}

}
