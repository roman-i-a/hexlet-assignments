package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<>();
        }
        var map = new HashMap<String, Integer>();
        for (String word : sentence.split(" ")) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
                continue;
            }
            map.put(word, 1);
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
//END
