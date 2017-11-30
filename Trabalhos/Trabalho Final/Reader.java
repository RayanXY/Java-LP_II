/**
 * This class is where the files will be read. 
 *
 * @author Anderson Caio da Fonseca Santos, Erick de Oliveira Silva and Rayan Avelino dos Santos 
 * @version 30.11.2017
 */
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

public class Reader{
	
	private BufferedReader reader;
	private static String[] files = {"files/apple.txt", "files/google.txt", "files/microsoft.txt"};

	/**
	 * Default constructor;
	 */
	public Reader(){}

	/**
	 * Reads the files and adds the words to the Trie Tree.
	 * @param trie - The Trie Tree where the words will stored.
	 */
	public void readFile(Trie trie){

		try{

			/// Reads each file passed.
			for(String currentFile : files){

				int lineCont = 1;									   //!< The line where the word is found.

				reader = new BufferedReader(new FileReader(currentFile));
				String line = reader.readLine();

				while(line != null){

					String[] split_line = line.split("\\s");
					for(String current : split_line){
						current = current.toLowerCase();				//!< Puts the word in lower case.
						current = current.replaceAll("\\p{P}+", "");	//!< Removes any punctuation.
						trie.insert(currentFile, current, lineCont);	//!< Inserts the word in the tree.
					}
					
					line = reader.readLine();
					lineCont++;

				}

				reader.close();

			}

		}catch(IOException e){
			JOptionPane.showMessageDialog( null, e.getMessage() );
		}

	}

}