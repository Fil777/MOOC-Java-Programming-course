package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fil
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        dictionary = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary() {
        this(null);
    }
    
    public void setFile(String file){
        this.file = file;
    }

    public void print() {
        dictionary.keySet().stream()
                .forEach(key -> System.out.println(key + ":" + dictionary.get(key)));
    }

    public void add(String word1, String word2) {
        addNewWord(word1, word2);
        addNewWord(word2, word1);
    }

    public void addNewWord(String word, String translation) {
        if (word == null || translation == null) {
            return;
        }
        if (dictionary.containsKey(word)) {
            return;
        }
        dictionary.put(word, translation);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        dictionary.remove(dictionary.get(word));
        dictionary.remove(word);
    }

    public boolean load() {
        if (file == null) {
            return false;
        }
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String[] words = reader.nextLine().split(":");
                add(words[0], words[1]);
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean save() {
        if (file == null) {
            return false;
        }
        ArrayList wasPrinted = new ArrayList<>();
        try (PrintWriter writer = new PrintWriter(file)) {
            dictionary.keySet().stream()
                    .filter(key -> !wasPrinted.contains(dictionary.get(key)))
                    .forEach(key -> {
                        writer.println(key + ":" + dictionary.get(key));
                        wasPrinted.add(key);
                    });
            writer.close();
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
