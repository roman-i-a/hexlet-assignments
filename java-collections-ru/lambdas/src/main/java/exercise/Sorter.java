package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    private static final String BD = "birthday";
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .sorted(Comparator.comparing(user -> user.get(BD)))
                .filter(u -> u.get("gender").equals("male"))
                .map(user -> user.get("name"))
                .toList();
    }
}
// END
