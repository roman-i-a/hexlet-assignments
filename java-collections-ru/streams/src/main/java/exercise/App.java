package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    private static List<String> free = Arrays.asList(
            "gmail.com",
            "yandex.ru",
            "hotmail.com");
    public static int getCountOfFreeEmails(List<String> emails) {
        return (int) emails.stream()
                .filter((e) -> getFree().contains(e.split("@")[1]))
                .count();
    }

    public static List<String> getFree() {
        return free;
    }
}
// END
