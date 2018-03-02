public class Cat extends Animal{

	private String pelage;
	
	public Cat(String owner, String name, String palage){
	
		super(owner, name);
		this.pelage = pelage;
	
	}
	
	public String getPelage(){
		return pelage;
	}
	
	public void setPelage(String pelage){
		this.pelage = pelage;
	}
	
	public String toString(){
		return "> NAME: " + getName() + "\n> PELAGE: " + pelage + "\n> OWNER: " + getOwner() + "\n";
	}

}
