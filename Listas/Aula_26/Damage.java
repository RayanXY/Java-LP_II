public class Damage{
	
	private Citzen citzen;
	private String type_of_damage, nameCitzen, addressCitzen, phoneCitzen;
	private float losses;

	public Damage(Citzen citzen, String type_of_damage, float losses){

		nameCitzen = citzen.getName();
		addressCitzen = citzen.getAddress();
		phoneCitzen = citzen.getPhone();
		this.type_of_damage = type_of_damage;
		this.losses = losses;

	}

	public String getTypeDamage(){
		return type_of_damage;
	}

	public float getLosses(){
		return losses;
	}

}