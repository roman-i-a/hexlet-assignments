package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    String text;
    TagInterface tag;

    public LabelTag(String labelText, TagInterface labelTag) {
        this.text = labelText;
        this.tag = labelTag;
    }

    @Override
    public String render() {
        String pattern = "<label>%s%s</label>";
        return String.format(pattern, text, tag.render());
    }
}
// END
