/**
 * This class represents a simple Trie Tree. 
 *
 * @author Anderson Caio da Fonseca Santos, Erick de Oliveira Silva and Rayan Avelino dos Santos 
 * @version 30.11.2017
 */
import java.util.Set;
import java.util.HashMap;

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
	public void insert(String file, String word, int line){

		/// Verifies if the word already exists.
		if(search(word)){
	
			TrieNode n = lastLetter(word);

			/// Retrieving the registry.
			HashMap<String, HashMap<Integer, Integer>> registry = n.getRegistry();

			/// Checks if it's in the same file.
			if(registry.containsKey(file)){

				HashMap<Integer, Integer> lines = registry.get(file);

				/// Checks if it's in the same line.
				if(lines.containsKey(line)){
					lines.put(line, lines.get(line)+1);
					registry.put(file, lines);
				}else{
					lines.put(line, 1);
					registry.put(file, lines);
				}

			}else{
				n.setFirstRegistry(file, line);
			}

		}else{

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

				/// When it reaches the last character.
				if(i == (word.length()-1)){
					currentChar.setFirstRegistry(file, line);
					currentChar.setEndOfWord(true);
				}			

			}

		}

	}

	/**
	 * This method searchs a word in the tree.
	 * @param word - The word to be searched.
	 * @return True if the word was found.
	 *         False if the word wasn't found. 
	 */
	public boolean search(String word){

		TrieNode w = searcher(word);

		if(w != null && w.isEndOfWord()){
			return true;
		}

		return false;

	}

	/**
	 * This method helps the search methods.
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

	/**
	 * This method removes a word in the tree.
	 * @param word - The word to be searched.
	 */
	public boolean remove(String word){

		if(search(word) == false){
			return false;
		}

		TrieNode currentChar = lastLetter(word);
		if(currentChar.getChildren() != null){
			currentChar.setEndOfWord(false);
			return true;
		}

		remove(currentChar);
		return true;

	}

	/**
	 * The recursive portion of the fucntion above.
	 * @param node - The current node.
	 */
	private void remove(TrieNode node){

		TrieNode aux = node.getParent();
		if(aux.getChildren().size() == 1 && !aux.isEndOfWord()){
			remove(aux);
		}else{
			node = null;
		}

	}

	/**
	 * Helps the remove to get in the node that has the last letter of the word
	 * @param word - word to found the last letter
	 * @return the node that has the last letter of the word
	 */
	public TrieNode lastLetter(String word){

		if(!search(word)){
			return null;
		}else{

			TrieNode nowNode = root;
			HashMap<Character,TrieNode> nodeChildren = nowNode.getChildren();
			TrieNode aux = null;

			for(int i = 0; i < word.length(); ++i){

				aux = null;
				char char_ = word.charAt(i);

				if(nodeChildren.containsKey(char_)){
					aux = nodeChildren.get(char_);
					if(i == (word.length() - 1) ){
						break;
					}
				}
				nowNode = aux;
				nodeChildren = nowNode.getChildren();

			}

			return aux;

		}

	}


    /**
	 * Prints all the words in the tree.
	 */
	public void print(){

		String word = new String();
		print(root, word);
		System.out.println();

	}

	/**
	 * The recursive portion of the fucntion above.
	 * @param node - The current node.
	 * @param word - The word about to be checked.
	 */
	private void print(TrieNode node, String word){

		HashMap<Character, TrieNode> children = node.getChildren();

		for(TrieNode n : children.values()){

			if(!n.getChildren().isEmpty()){

				word = word + n.getCharacter();
				if(n.isEndOfWord()){
					HashMap<String, HashMap<Integer, Integer>> registry = n.getRegistry();
					System.out.println(" > " + word + ":");
					printMap(registry);
				}
				print(n, word);
				word = word.substring(0, word.length()-1);

			}else{

				word = word + n.getCharacter();
				HashMap<String, HashMap<Integer, Integer>> registry = n.getRegistry();
				System.out.println(" > " + word + ":");
				printMap(registry);
				word = word.substring(0, word.length()-1);

			}

		}

	}

	/**
	 * Auxiliar print to print the lines and occurencies.
	 * @param hashmap - The hashmap containing the registry.
	 */
	private void printMap(HashMap<String, HashMap<Integer, Integer>> hashmap){

		Set<String> map = hashmap.keySet();
		String[] files = map.toArray(new String[map.size()]);

		for(String file : files){

			System.out.println("   - " + file);

			HashMap<Integer, Integer> lines = hashmap.get(file);

			Set<Integer> lineSet = lines.keySet();
			Integer[] lineKeys = lineSet.toArray(new Integer[lines.size()]);

			for(Integer line : lineKeys){

				System.out.println("     - Line: " + line + " Ocurrency: " + lines.get(line));
				
			}

		}

	}

}