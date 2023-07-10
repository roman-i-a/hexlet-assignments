package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static final String UNCHANGED = "unchanged";
    public static final String ADDED = "added";
    public static final String DELETED = "deleted";
    public static final String CHANGED = "changed";

    public static Map<String, String> genDiff(
            final Map<String, Object> first,
            final  Map<String, Object> second) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(first.keySet());
        keys.addAll(second.keySet());
        for (var key : keys) {
            if (!first.containsKey(key)) {
                result.put(key, ADDED);
                continue;
            }
            if (!second.containsKey(key)) {
                result.put(key, DELETED);
                continue;
            }
            if (first.get(key).equals(second.get(key))) {
                result.put(key, UNCHANGED);
                continue;
            }
            result.put(key, CHANGED);
        }
        return result;
    }
}
//END
