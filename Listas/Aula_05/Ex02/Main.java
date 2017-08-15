import java.util.Scanner;

public class Main{

	public static void main(String [] args){
	
		// Variables	
		Scanner read = new Scanner(System.in);
		String phrase;
		String [] words;
		int len;
		
		// Reading the phrase
		System.out.print("Digite a frase: ");
		phrase = read.nextLine();
		
		// Storing the words of the phrase
		words = phrase.split(" ");
		len = words.length;
		
		// Counting and printing
		for(int i = 0; i < len; i++){
			int cont = 1;
			for(int j = i+1; j < len; j++){
				if(words[i].equals("x01")){
					i++;
				}else if(words[i].equals(words[j])){
					cont++;
					words[j] = "x01";
				}
			}
			if(!(words[i].equals("x01"))){
				System.out.println(words[i] + ": " + cont);
			}
		}
		 
	}

}
