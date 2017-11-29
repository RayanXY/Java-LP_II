import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		/// Creating the Trie.
		Trie trie = new Trie();

		/// Populating
		trie.insert("Casarao",1);
		trie.insert("Casa",4);
		trie.insert("Casa",2);
		trie.insert("Casarao",1);
		trie.insert("Casamento",3);
		trie.insert("Casar",2);
		trie.insert("Casar",2);
		trie.insert("Casar",3);
		trie.insert("Casaco",1);

		/// Priting the tree.
		System.out.println(">>> Tree:");
		trie.print();

		trie.remove("Casar");

		System.out.println(">>> Tree:");
		trie.print();

	}

}