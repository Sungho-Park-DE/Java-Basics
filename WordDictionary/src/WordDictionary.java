import java.util.HashMap;

public class WordDictionary {
    HashMap<String, String> wordDictionary = new HashMap<>();

    public void addWord(String key, String word) {
        wordDictionary.put(key, word);
    }

    public String find(String key) {

        key = key.toLowerCase();
        for (String keys : wordDictionary.keySet()
        ) {
            if (key.equals(keys.toLowerCase()))
                return wordDictionary.get(keys);
        }
        return null;
    }

}


