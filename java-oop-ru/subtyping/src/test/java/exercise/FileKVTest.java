package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
    }

    // BEGIN
    static Map<String, String> expected;
    @BeforeEach
    public void initMap() {
        expected = new HashMap<>();
        expected.put("key1", "value1");
        expected.put("key2", "value2");
        expected.put("key3", "value3");
        expected.put("key4", "value4");
    }
    @Test
    public void FileKVCreateTest() {
        var fileStorage = new FileKV(filepath.toString(), expected);
        assertEquals(expected, fileStorage.toMap());
    }

    @Test
    public void testGetAndSet() {
        var fileStorage = new FileKV(filepath.toString(), expected);
        assertEquals(expected.get("key1"), fileStorage.get("key1", ""));
        assertEquals("", fileStorage.get("key6", ""));
        fileStorage.set("key6", "value6");
        assertEquals("value6", fileStorage.get("key6", ""));
    }
    // END
}
