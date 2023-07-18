package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homeList, int count) {
        return homeList.stream().sorted(Home::compareTo).limit(count)
                .map(Object::toString).toList();
    }
}
// END
