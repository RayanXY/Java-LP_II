public class Main{
	
	public static void main(String [] args){

		Trie trie = new Trie();

		trie.insertWord("Olar");

		System.out.println(trie.search("Olar"));

	}

}