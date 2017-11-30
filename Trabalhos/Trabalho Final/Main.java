import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		/// Creating the Trie.
		Trie trie = new Trie();

		/// Populating
		trie.insert("google.txt", "Casarao",1);
		trie.insert("microsoft.txt", "Casa",4);
		trie.insert("apple.txt", "Casa",2);
		trie.insert("google.txt", "Casarao",1);
		trie.insert("microsoft.txt", "Casamento",3);
		trie.insert("apple.txt", "Casar",2);
		trie.insert("microsoft.txt", "Casar",2);
		trie.insert("apple.txt", "Casar",3);
		trie.insert("google.txt", "Casaco",1);

		/// Priting the tree.
		System.out.println(">>> Tree:");
		trie.print();
/*
		trie.remove("Casar");

		System.out.println(">>> Tree:");
		trie.print();
*/
	}

}