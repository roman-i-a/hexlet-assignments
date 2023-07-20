package exercise;

import jdk.jshell.execution.Util;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {

    private String filepath;

    public FileKV(String filepath, Map<String, String> initMap) {
        this.filepath = filepath;
        var fileString = Utils.serialize(initMap);
        Utils.writeFile(filepath, fileString);
    }

    @Override
    public void set(String key, String value) {
        var map = this.toMap();
        if (map.containsKey(key)) {
            map.replace(key, value);
        }

        var s = Utils.serialize(map);
        Utils.writeFile(filepath, s);
    }

    @Override
    public void unset(String key) {

    }

    @Override
    public String get(String key, String defaultValue) {
        var map = this.toMap();
        return map.get(key) == null
                ? defaultValue
                : map.get(key);
    }

    @Override
    public Map<String, String> toMap() {
        var file = Utils.readFile(filepath);
        var map = Utils.unserialize(file);
        return map;
    }
}
// END
