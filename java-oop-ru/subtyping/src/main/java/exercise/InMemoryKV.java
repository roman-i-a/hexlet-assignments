package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private final Map<String, String> storage;

    public InMemoryKV() {
        this.storage = new HashMap<>();
    }

    public InMemoryKV (Map<String, String> map) {
        this.storage = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        if (storage.containsKey(key)) {
            storage.replace(key, value);
        } else {
            this.storage.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        this.storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
