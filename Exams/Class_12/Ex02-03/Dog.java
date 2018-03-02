public class Dog extends Animal{

	private String breed;
	
	public Dog(String owner, String name, String breed){
	
		super(owner, name);
		this.breed = breed;
	
	}
	
	public String getBreed(){
		return breed;
	}
	
	public String toString(){
	
		return "> NAME: " + getName() + "\n> BREED: " + breed + "\n> OWNER: " + getOwner() + "\n";
	
	}

}
