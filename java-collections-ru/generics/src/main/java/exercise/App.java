package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(
            List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (var book : books) {
            int score = 0;
            for (Map.Entry<String, String> field : where.entrySet()) {
                if (book.get(field.getKey()).equals(field.getValue())) {
                    score++;
                }
            }
            if (score == where.entrySet().size()) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
