public class TestingNationality{


	public static void main(String [] args){
		Traveler v1 = new Brazilian("João");
		Traveler v2 = new Spanish("Javier");
		Traveler v3 = new American("William");
	
		v1.speak();
		v2.speak();
		v3.speak();
	}

}
