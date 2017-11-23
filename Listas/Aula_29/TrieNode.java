/**
 * This class represents a node for the tree. 
 *
 * @author Rayan Avelino
 * @version 21.11.2017
 */
import java.util.HashMap;

public class TrieNode{
	
	private char character;
	private TrieNode parent;
	private HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	private boolean endOfWord;

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
		children = new HashMap<Character, TrieNode>();
	}

}