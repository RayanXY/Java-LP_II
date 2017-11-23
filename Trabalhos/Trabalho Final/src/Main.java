import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		/// Creating the Trie.
		Trie trie = new Trie();

		/// Inserting Tests.
		System.out.println(">>> Inserting words.");
		trie.insertWord("Mario");
		trie.insertWord("Peach");
		trie.insertWord("Luigi");
		trie.insertWord("Daisy");
		trie.insertWord("Leon");
		trie.insertWord("Ada");
		trie.insertWord("Nilce");
		trie.insertWord("Dante");
		trie.insertWord("Kratos");
		trie.insertWord("Atena");
		trie.insertWord("Zeus");
		trie.insertWord("Calíope");

		System.out.println();

		/// Searching Tests.
		System.out.println(">>> Searching Test.");
		if(trie.search("Luigi")){                  //!< True
			System.out.println(" - Found!");
		}else{
			System.out.println(" - Not found!");
		}

		if(trie.search("Kratos")){                 //!< True
			System.out.println(" - Found!");
		}else{
			System.out.println(" - Not found!");
		}

		if(trie.search("Ada")){                    //!< True
			System.out.println(" - Found!");
		}else{
			System.out.println(" - Not found!");
		}

		if(trie.search("Irineu")){       		   //!< False
			System.out.println(" - Found!");
		}else{
			System.out.println(" - Not found!");
		}

		System.out.println();

		/// Removing Tests.
		System.out.println(">>> Removing Test.");
		if(trie.search("Mario")){       		   
			System.out.println(" - Still here!");
		}else{
			System.out.println(" - Not found or removed!");
		}

		trie.remove("Mario");

		if(trie.search("Mario")){       		   
			System.out.println(" - Still here!");
		}else{
			System.out.println(" - Not found or removed!");
		}

		System.out.println();

		/// Priting the tree.
		ArrayList<String> words = trie.print();

		System.out.println(">>> Tree:");
		for(String w : words){
			System.out.println(" - " + w);
		}

		System.out.println();

		/// User
		Scanner read = new Scanner(System.in);
		/// Creating a new Trie Tree for the user.
		Trie userTrie = new Trie();
		/// Interface
		System.out.println(">>> Start filling the tree with words. To stop just put 'exit':");
		
		while(true){
			String new_word = read.next();
			if(new_word.equals("exit") || new_word.equals("Exit")){
				break;
			}
			userTrie.insertWord(new_word);
		}

		System.out.println();

		/// Printing the words inserted by the user.
		ArrayList<String> user_words = userTrie.print();

		System.out.println(">>> User Tree:");
		for(String w : user_words){
			System.out.println(" - " + w);
		}

	}

}