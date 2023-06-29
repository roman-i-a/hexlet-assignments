package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String heap, String word) {
        word = word.toLowerCase();
        var wordList = new ArrayList<>(Arrays.asList(word.split("")));
        for (String symbol : heap.split("")) {
            wordList.remove(symbol);
        }
        return wordList.isEmpty();
    }
}
//END
