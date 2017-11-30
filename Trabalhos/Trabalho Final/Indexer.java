/**
 * This class is where the files will be added to the tree. 
 *
 * @author Anderson Caio da Fonseca Santos, Erick de Oliveira Silva and Rayan Avelino dos Santos 
 * @version 30.11.2017
 */
public class Indexer{

	private Trie trie;
	private Reader reader;

	/**
	 * Creates an indexer.
	 * @param trie - The Trie Tree where the words will be stored.
	 */
	public Indexer(Trie trie){

		this.trie = trie;
		reader = new Reader();

	}

	/**
	 * Adds the file's words to the tree.
	 */
	public void start(){
		reader.readFile(trie);
	}

}