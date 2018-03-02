public class Main{

	public static void main (String [] args){

		// Server.
		MailServer server = new MailServer();
	
		// Clients.
		MailClient client_1 = new MailClient(server, "Rayan");
		MailClient client_2 = new MailClient(server, "Lucas");
	
		// Sending an email.
		client_1.sendMailItem("Lucas", "SAM","kkk Eae, man");
	
		// Recieving an email.
		client_2.printNextMailItem();
		
		// Getting the next email.
		client_2.getNextMailItem();

	}
	
}
