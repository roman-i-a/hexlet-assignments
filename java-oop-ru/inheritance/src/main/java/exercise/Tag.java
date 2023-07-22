package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> tagAttributes) {
        this.name = tagName;
        this.attributes = tagAttributes;
    }

    String generateOpenTag() {
        if (attributes.isEmpty()) {
            return "<" + name + ">";
        }
        String pattern = "<%s %s>";
        StringBuilder attributeString = new StringBuilder("");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            attributeString.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"").append(" ");
        }
        attributeString.deleteCharAt(attributeString.lastIndexOf(" "));
        return String.format(pattern, name, attributeString);
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
// END
