package src;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is where the files will be added to the tree.
 *
 * @author Anderson Caio da Fonseca Santos.
 * @author Erick de Oliveira Silva.
 * @author Rayan Avelino dos Santos.
 * @version 30.11.2017
 */
public class Indexer {
    
    private File f;
    private Trie trie;
    private Reader reader;

    /**
     * Creates an indexer.
     *
     * @param trie - The Trie Tree where the words will be stored.
     */
    public Indexer() {
        f = new File("/home/rayan/Codes/Java/Netbeans/GUI/src/backup/backup.txt");
        trie = new Trie();
        reader = new Reader();

    }

    /**
     * Loads the backup file, if it exists.
     * @throws java.io.IOException
     */
    public void start() throws IOException{
        trie.recovery(f);
        f.delete();
    }
    
    /**
     * Save the current tree into a file.
     * @throws java.io.IOException
     */
    public void save() throws IOException{
        trie.save();
    }
    
    /**
     * Remove a word form the tree.
     * @param word that will be removed.
     * @return True if the word was removed.
     *         False otherwise.
     */
    public boolean remove(String word){
        return trie.remove(word);
    }
    
    /**
     * The true if the words exists in the file on the tree.
     * @param words that will be checked. 
     * @return True if the words match the condition.
     *         False otherwise.
     */
    public boolean and(String words){
        return trie.and(words);
    }
    
    /**
     * This method searchs a word in the tree.
     *
     * @param word - The word to be searched.
     * @return True if the word was found. False if the word wasn't found.
     */
    public boolean search(String word){
        return trie.search(word);
    }
    
    /**
     * Prints the word with its registry.
     * @param word - The word that will be printed.
     * @return the word.
     */
    public String print(String word){
        return trie.print(word);
    }
    
    /**
     * Adds the file to the tree.
     * @param path - The directory where the file is.
     */
    public void addFile(File path){
        reader.addFile(path);
    }
    
    /**
     * Load the files to the tree.
     * @throws IOException 
     */
    public void load() throws IOException{
        reader.readFile(trie);
    }
    
    /**
     * Checks if the file is already stored.
     * @param file thar will be checked.
     * @return True if the file exists
     *         False otherwise.
     */
    public boolean fileExists(File file){
        return reader.fileExists(file);
    }

}
