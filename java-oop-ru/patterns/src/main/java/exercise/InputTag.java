package exercise;

// BEGIN
public class InputTag implements TagInterface {

    private final String type;
    private final String value;

    public InputTag(String inputType, String inputValue) {
        this.type = inputType;
        this.value = inputValue;
    }

    @Override
    public String render() {
        String PATTERN = "<input type=\"%s\" value=\"%s\">";
        return String.format(PATTERN, type, value);
    }
}
// END
