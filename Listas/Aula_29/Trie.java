import java.util.HashMap;

public class Trie{

	private TrieNode root;

	public Trie(){
		root = new TrieNode();
		root.setParent(new TrieNode());
	}
	
	/**
	 * Inserts a word in the tree.
	 * @param word - The word to be inserted.
	 */
	public void insertWord(String word){

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
				currentChar.setLeaf(true);
			}			

		}

	}

	/**
	 * This method search a word in the tree.
	 * @param word - The word to be searched.
	 */
	public boolean search(String word){

		TrieNode w = searcher(word);

		if(w != null && w.isLeaf()){
			return true;
		}

		return false;

	}

	/**
	 * This method helps the search method.
	 * @param word - The word to be searched.
	 */
	private TrieNode searcher(String word){

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


}