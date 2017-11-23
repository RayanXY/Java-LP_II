import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		/// Creating the Trie.
		Trie trie = new Trie();

		/// Inserting Tests.
		System.out.println(">>> Inserting words.");
		trie.insert("Mario");
		trie.insert("Peach");
		trie.insert("Luigi");
		trie.insert("Daisy");
		trie.insert("Leon");
		trie.insert("Ada");
		trie.insert("Nilce");
		trie.insert("Dante");
		trie.insert("Kratos");
		trie.insert("Atena");
		trie.insert("Zeus");
		trie.insert("Calíope");

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
		System.out.println(">>> Tree:");
		trie.print();

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
			userTrie.insert(new_word);
		}

		/// Printing the words inserted by the user.
		System.out.println(">>> User Tree:");
		userTrie.print();
	}

}