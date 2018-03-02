import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		Trie trie = new Trie();

		Indexer indexer = new Indexer(trie);

		indexer.start();

		indexer.save();
/*
		/// Priting the tree.
		System.out.println(">>> Tree:");
		trie.print();
*/		
/*
		String word = "que";

		if(trie.search(word)){
			String r = trie.printWord(word);
			System.out.println(r);
		}else{
			System.out.println("Não conxegue");
		}
*/
	}

}