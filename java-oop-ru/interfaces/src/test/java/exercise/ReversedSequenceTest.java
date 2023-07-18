package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedSequenceTest {
    @Test
    public void testReversedSequence() {
        CharSequence text = new ReversedSequence("abcdef");
        assertEquals("fedcba", text.toString()); // "fedcba"
        assertEquals('e', text.charAt(1)); // 'e'
        assertEquals(6, text.length()); // 6
        assertEquals("edc", text.subSequence(1, 4).toString()); // "edc"
    }
}
