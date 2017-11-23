/**
 * This class represents a simple Trie Tree. 
 *
 * @author Rayan Avelino
 * @version 21.11.2017
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Trie{

	private TrieNode root;

	/**
	 * Creates a Trie Tree.
	 */
	public Trie(){
		root = new TrieNode();
		root.setParent(new TrieNode());
	}
	
	/**
	 * Inserts a word in the tree.
	 * @param word - The word to be inserted.
	 */
	public void insert(String word){

		/// Retrieving the root's children.
		HashMap<Character, TrieNode> children = root.getChildren();

		/// The parent node.
		TrieNode parent = root;

		/// Storing the word.
		for(int i = 0; i < word.length(); i++){

			TrieNode currentChar = null;

			char c = word.charAt(i);

			/// Checking if the Key 'c' already exists.
			if(children.containsKey(c)){
				currentChar = children.get(c);
			}else{
				currentChar = new TrieNode(c);
				children.put(c, currentChar);
				currentChar.setParent(parent);
			}

			parent = currentChar;
			children = currentChar.getChildren();

			/// When it reaches the last character
			if(i == (word.length()-1)){
				currentChar.setEndOfWord(true);
			}			

		}

	}

	/**
	 * This method searchs a word in the tree.
	 * @param word - The word to be searched.
	 */
	public boolean search(String word){

		TrieNode w = searcher(word);

		if(w != null && w.isEndOfWord()){
			return true;
		}

		return false;

	}

	/**
	 * This method removes a word in the tree.
	 * @param word - The word to be searched.
	 */
	public boolean remove(String word){

		TrieNode currentChar = searcher(word);

		if(currentChar != null && currentChar.isEndOfWord()){

			TrieNode parent = currentChar.getParent();
			char c = currentChar.getCharacter();

			/// Deleting when there is one child.
			while(parent.getChildren().size() == 1){
				parent.resetChildren();
				currentChar = parent;
				c = currentChar.getCharacter();
				parent = currentChar.getParent();
			}

			/// Deleting the remaining
			char delete = c;
			parent.getChildren().entrySet().removeIf(e -> e.getKey().equals(delete));

			return true;

		}

		return false;

	}

	/**
	 * This method helps the search and remove methods.
	 * @param word - The word to be searched.
	 */
	public TrieNode searcher(String word){

		HashMap<Character, TrieNode> children = root.getChildren();

		TrieNode currentChar = null;

		for(int i = 0; i < word.length(); i++){

			char c = word.charAt(i);

			if(children.containsKey(c)){
				currentChar = children.get(c);
				children = currentChar.getChildren();
			}else{
				return null;
			}

		}

		return currentChar;

	}

	public void print(){

		String word = new String();
		print(root, word);
		System.out.println();

	}

	private void print(TrieNode node, String word){

		HashMap<Character, TrieNode> children = node.getChildren();

		for(TrieNode n : children.values()){

			if(!n.getChildren().isEmpty()){

				word = word + n.getCharacter();
				if(n.isEndOfWord()){
					System.out.println(" - " + word);
				}
				print(n, word);
				word = word.substring(0, word.length()-1);

			}else{

				word = word + n.getCharacter();
				System.out.println(" - " + word);
				word = word.substring(0, word.length()-1);

			}

		}

	}

}