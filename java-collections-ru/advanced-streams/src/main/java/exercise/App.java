package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;


// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        String[] lines = config.split("\n");
        return Arrays.stream(lines)
                .filter(line -> line.startsWith("environment"))
                .map((line) -> line.replaceAll("environment=\"", ""))
                .map(line -> line.replaceAll(" ", ""))
                .map(line -> line.replaceAll("\"",""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(p -> p.startsWith("X_FORWARDED_"))
                .map(p -> p.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
