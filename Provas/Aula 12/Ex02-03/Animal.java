public class Animal{

	private String owner;
	private String name;
	
	public Animal(String owner, String name){
	
		this.owner = owner;
		this.name = name;
	
	}
	
	public String getOwner(){
		return owner;
	}
	
	public String getName(){
		return name;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public void setName(String name){
		this.name = name;
	}

}
