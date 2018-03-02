/**
 * This class represents a node for the tree. 
 *
 * @author Anderson Caio da Fonseca Santos, Erick de Oliveira Silva and Rayan Avelino dos Santos 
 * @version 30.11.2017
 */
import java.util.HashMap;

public class TrieNode{
	
	private char character;
	private TrieNode parent;
	private boolean endOfWord;
	private HashMap<Integer, Integer> lines = new HashMap<>();
	private HashMap<Character, TrieNode> children = new HashMap<>();
	private HashMap<String, HashMap<Integer, Integer>> registry = new HashMap<>();

	/**
	 * Default constructor;
	 */
	public TrieNode(){};

	/**
	 * Creates a new node.
	 * @param character - The Character of the node.
	 */
	public TrieNode(char character){
		this.character = character;
	}

	/**
	 * @return The character of the node.
	 */
	public char getCharacter(){
		return character;
	}

	/**
	 * @return The parent of the node.
	 */
	public TrieNode getParent(){
		return parent;
	}

	/**
	 * @return The children of the node.
	 */
	public HashMap<Character, TrieNode> getChildren(){
		return children;
	}

	/**
	 * @return The registry of the node.
	 */
	public HashMap<String, HashMap<Integer, Integer>> getRegistry(){
		return registry;
	}

	/**
	 * Sets a character for the node.
	 * @param character - The character to be addressed.
	 */
	public void setCharacter(char character){
		this.character = character;
	}

	/**
	 * Sets a parent for the node.
	 * @param parent - The node that will be a parent.
	 */ 
	public void setParent(TrieNode parent){
		this.parent = parent;
	}

	/**
	 * Sets the first registry for the node.
	 * @param file - The file where the word appears.
	 * @param line - The line where the word appears.
	 */
	public void setFirstRegistry(String file, int line){
		lines.put(line, 1);
		registry.put(file, lines);
	}

	/**
	 * Sets if the node is the end of word.
	 * @param leaf - True if the node is the end of the word.
	 *               False if the node isn't the end of the word. 
	 */ 
	public void setEndOfWord(boolean endOfWord){
		this.endOfWord = endOfWord;
	}

	/**
	 * @return True if the node is the end of the word.
	 *         False if the node isn't the end of the word.
	 */
	public boolean isEndOfWord(){
		return endOfWord;
	}

	/**
	 * Resets the children of the node.
	 */
	public void resetChildren(){
		children = new HashMap<>();
	}

}