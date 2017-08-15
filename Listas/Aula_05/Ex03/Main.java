public class Main{
	
	public static void main(String [] args){

		Playlist p = new Playlist();

		p.addFile("audio/BoB-Airplane.mp3");

		p.listFiles();

		p.playFile("audio/BoB-Airplane.mp3");

		p.playAll();
		
		p.removeFile("Olar");

		p.listFiles();

	}

}