package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        return Arrays.stream(config.split("\n"))
                .filter(line -> line.startsWith("environment"))
                .map((e) -> e.replaceAll("environment=\"", ""))
                .flatMap((e) -> Arrays.stream(e.split(","))
                        .filter(p -> p.startsWith("X_FORWARDED_"))
                        .map(p -> p.replace("X_FORWARDED_", "")))
                //.forEach(System.out::print)
                .toList()
                .toString()
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .replace("\"","");
    }
}
//END
