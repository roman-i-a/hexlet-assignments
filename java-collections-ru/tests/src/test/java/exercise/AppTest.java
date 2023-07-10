package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var actual = App.take(list, 3);
        assertThat(actual).isEqualTo(Arrays.asList(1, 2, 3));
        assertThat(list).isEqualTo(Arrays.asList(1, 2, 3, 4));

        var actual2 = App.take(list, 10);
        assertThat(actual2).isEqualTo(list);


        var actual3 = App.take(Arrays.asList(), 5);
        assertThat(actual3).isEqualTo(Arrays.asList());
        // END
    }
}
