import java.util.ArrayList;

public class Main{

	public static void main(String [] args){
		
		int fisical = 0, legal = 0;
		ArrayList<Client> clients = new ArrayList<Client>();
		
		FisicalPerson client1 = new FisicalPerson("CJ", "Groove Street, Los Santos/San Andreas", "555-4523", "888.999.654-78");
		FisicalPerson client2 = new FisicalPerson("Mario", "Mushroom Kingdon", "198-9000", "484.158.966-78");
		FisicalPerson client3 = new FisicalPerson("Bilbo Baggins", "Shire, Middle Earth", "7789-8888", "125.478.899-05");
		
		LegalPerson client4 = new LegalPerson("Wesker", "Racoon City", "8879-4516", "7778966/5", "Umbrella Comporation");
		LegalPerson client5 = new LegalPerson("Vidic", "Roma", "5554-8897", "1225479/8", "Abstergo Industries");
		LegalPerson client6 = new LegalPerson("Cave Johnson", "Unknown", "555-4848", "4144816/6", "Aperture Science");
		
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		clients.add(client4);
		clients.add(client5);
		clients.add(client6);
		
		for(Client c : clients){
			if(c instanceof FisicalPerson){
				fisical++;
			}else{
				legal++;
			}
			c.printData();
		}
		System.out.println("There are(is) " + fisical + " fisical client(s) and there are(is) " + legal + " legal client(s)");
	
	}

}
