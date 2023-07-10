package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        var result = Arrays.stream(array)
                .map(line -> Arrays.stream(line)
                        .flatMap(e -> Stream.of(e, e))
                        .toArray(String[]::new))
                .flatMap(e -> Stream.of(e, e))
                .toArray(String[][]::new);
        return result;
    }
}
// END
