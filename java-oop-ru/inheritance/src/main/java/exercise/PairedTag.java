package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private final String body;
    private final List<Tag> childs;

    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> tagChilds) {
        super(tagName, tagAttributes);
        this.body = tagBody;
        this.childs = tagChilds;
    }

    @Override
    public String toString() {
        String open = this.generateOpenTag();
        String close = "</" + this.getName() + ">";
        return open + body + childs.stream().map(Object::toString).reduce("", String::concat) + close;
    }
}
// END
