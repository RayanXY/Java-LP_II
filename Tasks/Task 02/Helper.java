/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  Rayan Avelino
 * @version 26/08/2017
 */
public class Helper{

	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper(){
    	/* Empty */
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp(){

		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();						//!< Car #1
		taxiCo1.addTaxi();						//!< Car #2
		taxiCo1.addShuttle();					//!< Shuttle #3

	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook(){
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("> Funcionou");
		}else{ 
			System.out.println("> Alguma coisa errada");
		}
		
		Taxi taxi2 = (Taxi) taxiCo1.lookup("Car #2");		
		taxi2.book("Olho d'Água do Borges");
		if ("Olho d'Água do Borges".equalsIgnoreCase(taxi2.getDestination()) ) {
			System.out.println("> Funcionou");
		}else{ 
			System.out.println("> Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived(){		
		Taxi taxi2 = (Taxi) taxiCo1.lookup("Car #2");
		taxi1.book("Olho d'Água do Borges");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "Olho d'Água do Borges".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("> Funcionou");
		}else{ 
			System.out.println("> Alguma coisa errada");
		}
	}

	public void testStatus(){
		taxiCo1.showStatus();
	}

	public void testClient(String destination){
		Vehicle vehicle = taxiCo1.clientRequest(destination);
		if(vehicle == null){
			System.out.println("> There are no cars available right now.");
		}else{
			System.out.println("> The " + vehicle.getID() + " is going to your destination.");
		}
	}

	public static void main(String[] args){

		Helper helper = new Helper();

		System.out.println(">>> First test:");
		helper.testBook();
		
		System.out.println(">>> Second test:");
		helper.testArrived();

		System.out.println(">>> Third test:");
		helper.testStatus();

		System.out.println(">>> Fourth test:");
		helper.testClient("Whitstable");

	}
}


