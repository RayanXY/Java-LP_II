package src;

/**
 * This class represents a simple Trie Tree.
 *
 * @author Anderson Caio da Fonseca Santos.
 * @author Erick de Oliveira Silva.
 * @author Rayan Avelino dos Santos.
 * @version 30.11.2017
 */
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
     * This method helps the search methods.
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

        if (search(word) == false) {
            return false;
        }

        TrieNode currentChar = lastLetter(word);
        if (currentChar.getChildren() != null) {
            currentChar.setEndOfWord(false);
            return true;
        }

        remove(currentChar);
        return true;

    }

    /**
     * The recursive portion of the fucntion above.
     *
     * @param node - The current node.
     */
    private void remove(TrieNode node) {

        TrieNode aux = node.getParent();
        if (aux.getChildren().size() == 1 && !aux.isEndOfWord()) {
            remove(aux);
        } else {
            node = null;
        }

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
                //microsoft.txt: 1 ocorrência da palavra ‘computador’ na linha 1
                result = result + word + ": " + file + " - Line: " + line + " - Occurency: " + lines.get(line) + "\n";
            }

        }

        return result;

    }

    public void save() throws IOException {
        String word = new String();
        FileWriter writer = new FileWriter("/home/rayan/Codes/Java/Netbeans/GUI/src/backup/backup.txt");
        save(root, writer, word);
        writer.close();
    }

    /**
     *
     *
     * @param node
     * @param writer
     * @param word
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
        
        //writer.close();
        
    }

}
