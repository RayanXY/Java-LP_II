import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		Trie trie = new Trie();

		trie.insertWord("Casa");
		trie.insertWord("Carro");
		trie.insertWord("Casebre");
		trie.insertWord("Carlos");

		ArrayList<String> words = trie.print();

		for(String w : words){
			System.out.println(w);
		}

	/*
		System.out.println(trie.search("Olar"));
		System.out.println(trie.remove("Olar"));
		System.out.println(trie.search("Olar"));
	*/

	}

}