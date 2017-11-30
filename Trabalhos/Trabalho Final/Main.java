import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		Trie trie = new Trie();

		Indexer indexer = new Indexer(trie);
		indexer.start();

		/// Priting the tree.
		System.out.println(">>> Tree:");
		trie.print();

	}

}