package src;

/**
 * This class represents a simple Trie Tree.
 *
 * @author Anderson Caio da Fonseca Santos.
 * @author Erick de Oliveira Silva.
 * @author Rayan Avelino dos Santos.
 * @version 30.11.2017
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashMap;

public class Trie {

    private TrieNode root;

    /**
     * Creates a Trie Tree.
     */
    public Trie() {
        root = new TrieNode();
        root.setParent(new TrieNode());
    }

    /**
     * Inserts a word in the tree.
     *
     * @param file - The file where the word is.
     * @param word - The word to be inserted.
     * @param line - The line where the word was found.
     */
    public void insert(String file, String word, int line) {

        
        
        /// Verifies if the word already exists.
        if (search(word)) {

            TrieNode n = lastLetter(word);

            /// Retrieving the registry.
            HashMap<String, HashMap<Integer, Integer>> registry = n.getRegistry();

            /// Checks if it's in the same file.
            if (registry.containsKey(file)) {

                HashMap<Integer, Integer> lines = registry.get(file);

                /// Checks if it's in the same line.
                if (lines.containsKey(line)) {
                    lines.put(line, lines.get(line) + 1);
                    registry.put(file, lines);
                } else {
                    lines.put(line, 1);
                    registry.put(file, lines);
                }

            } else {

                HashMap<Integer, Integer> newLines = new HashMap<>();
                newLines.put(line, 1);
                registry.put(file, newLines);

            }

        } else {

            /// Retrieving the root's children.
            HashMap<Character, TrieNode> children = root.getChildren();

            /// The parent node.
            TrieNode parent = root;

            /// Storing the word.
            for (int i = 0; i < word.length(); i++) {

                TrieNode currentChar = null;

                char c = word.charAt(i);

                /// Checking if the Key 'c' already exists.
                if (children.containsKey(c)) {
                    currentChar = children.get(c);
                } else {
                    currentChar = new TrieNode(c);
                    children.put(c, currentChar);
                    currentChar.setParent(parent);
                }

                parent = currentChar;
                children = currentChar.getChildren();

                /// When it reaches the last character.
                if (i == (word.length() - 1)) {
                    HashMap<String, HashMap<Integer, Integer>> registry = currentChar.getRegistry();
                    HashMap<Integer, Integer> newLines = new HashMap<>();
                    newLines.put(line, 1);
                    registry.put(file, newLines);
                    currentChar.setEndOfWord(true);
                }

            }

        }

    }

    /**
     * This method searchs a word in the tree.
     *
     * @param word - The word to be searched.
     * @return True if the word was found. False if the word wasn't found.
     */
    public boolean search(String word) {

        TrieNode w = searcher(word);

        if (w != null && w.isEndOfWord()) {
            return true;
        }

        return false;

    }

    /**
     * This method helps the search and remove methods.
     *
     * @param word - The word to be searched.
     * @return The node where the word ends.
     */
    public TrieNode searcher(String word) {

        HashMap<Character, TrieNode> children = root.getChildren();

        TrieNode currentChar = null;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (children.containsKey(c)) {
                currentChar = children.get(c);
                children = currentChar.getChildren();
            } else {
                return null;
            }

        }

        return currentChar;

    }

    /**
     * This method removes a word in the tree.
     *
     * @param word - The word to be searched.
     * @return True if the word was removed False if the was not found;
     */
    public boolean remove(String word) {

        TrieNode currentChar = searcher(word);

        if (currentChar != null && currentChar.isEndOfWord()) {

            TrieNode parent = currentChar.getParent();
            char c = currentChar.getCharacter();

            /// Deleting when there is one child.
            while (parent.getChildren().size() == 1) {
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
     * Helps the remove to get in the node that has the last letter of the word
     *
     * @param word - word to found the last letter
     * @return the node that has the last letter of the word
     */
    public TrieNode lastLetter(String word) {

        if (!search(word)) {
            return null;
        } else {

            TrieNode nowNode = root;
            HashMap<Character, TrieNode> nodeChildren = nowNode.getChildren();
            TrieNode aux = null;

            for (int i = 0; i < word.length(); ++i) {

                aux = null;
                char char_ = word.charAt(i);

                if (nodeChildren.containsKey(char_)) {
                    aux = nodeChildren.get(char_);
                    if (i == (word.length() - 1)) {
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
     * Prints the word with its registry.
     *
     * @param word - The word that will be printed.
     * @return the word.
     */
    public String print(String word) {

        TrieNode n = lastLetter(word);
        String result = new String();

        HashMap<String, HashMap<Integer, Integer>> hashmap = n.getRegistry();

        Set<String> map = hashmap.keySet();
        String[] files = map.toArray(new String[map.size()]);

        for (String file : files) {

            HashMap<Integer, Integer> lines = hashmap.get(file);

            Set<Integer> lineSet = lines.keySet();
            Integer[] lineKeys = lineSet.toArray(new Integer[lines.size()]);

            for (Integer line : lineKeys) {
                result = result + word + ": " + file + " - Line: " + line + " - Occurency: " + lines.get(line) + "\n";
            }

        }

        return result;

    }

    /**
     * Save the current tree into a file.
     *
     * @throws java.io.IOException
     */
    public void save() throws IOException {
        String word = new String();
        FileWriter writer = new FileWriter("/home/rayan/Codes/Java/Netbeans/GUI/src/backup/backup.txt");
        save(root, writer, word);
        writer.close();
    }

    /**
     * The recursive portion of the function above.
     *
     * @param node - The node where began the write.
     * @param writer - It will create the file.
     * @param word - Auxiliar to write the full word.
     */
    public void save(TrieNode node, FileWriter writer, String word) throws IOException {

        HashMap<Character, TrieNode> children = node.getChildren();

        for (TrieNode n : children.values()) {

            if (!n.getChildren().isEmpty()) {

                word = word + n.getCharacter();

                if (n.isEndOfWord()) {

                    HashMap<String, HashMap<Integer, Integer>> hashmap = n.getRegistry();
                    Set<String> map = hashmap.keySet();
                    String[] files = map.toArray(new String[map.size()]);

                    for (String file : files) {

                        HashMap<Integer, Integer> lines = hashmap.get(file);

                        Set<Integer> lineSet = lines.keySet();
                        Integer[] lineKeys = lineSet.toArray(new Integer[lines.size()]);

                        for (Integer line : lineKeys) {
                            writer.write(word + " " + file + " " + line + " " + lines.get(line) + "\n");
                        }
                    }

                }

                save(n, writer, word);
                word = word.substring(0, word.length() - 1);

            } else {

                word = word + n.getCharacter();
                HashMap<String, HashMap<Integer, Integer>> hashmap = n.getRegistry();
                Set<String> map = hashmap.keySet();
                String[] files = map.toArray(new String[map.size()]);

                for (String file : files) {

                    HashMap<Integer, Integer> lines = hashmap.get(file);

                    Set<Integer> lineSet = lines.keySet();
                    Integer[] lineKeys = lineSet.toArray(new Integer[lines.size()]);

                    for (Integer line : lineKeys) {
                        writer.write(word + " " + file + " " + line + " " + lines.get(line) + "\n");
                    }
                }
                word = word.substring(0, word.length() - 1);

            }

        }

    }

    /**
     * Loads the backup file into the tree.
     * @param f the backup file to be loaded.
     * @throws IOException
     */
    public void recovery(File f) throws FileNotFoundException, IOException {

        //File f = new File("/home/rayan/Codes/Java/Netbeans/GUI/src/backup/backup.txt");
        if (f.exists()) {

            BufferedReader reader = new BufferedReader(new FileReader(f));

            if (reader == null) {

            }

            String fileLine = reader.readLine();
            while (fileLine != null) {
                String[] toInsert = fileLine.split("\\s");

                String word = toInsert[0];
                String file = toInsert[1];
                int line = Integer.parseInt(toInsert[2]);
                int times = Integer.parseInt(toInsert[3]);

                for (int i = 0; i < times; ++i) {
                    insert(file, word, line);
                }

                fileLine = reader.readLine();
            }

        }

    }

    /**
     * This method return only if the words passed exists in the same file.
     * @param searched
     * @return True if the words are in the same file
     *         False if they're not.
     */
    public boolean and(String searched) {

        String[] words = searched.split("\\s");

        for (String word : words) {
            if (!search(word)) {
                return false;
            }
        }

        TrieNode node = lastLetter(words[0]);
        HashMap<String, HashMap<Integer, Integer>> files = node.getRegistry();
        Set<String> keys = files.keySet();

        for (String word : words) {

            TrieNode n = lastLetter(word);
            HashMap<String, HashMap<Integer, Integer>> file = n.getRegistry();
            
            for(String key : keys){
                if(!file.containsKey(key)){
                    return false;
                }
            }

        }

        return true;

    }
    
}
