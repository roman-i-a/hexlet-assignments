package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence {
    private char[] sequence;

    public ReversedSequence(String initSequence) {
        int length = initSequence.length();
        this.sequence = new char[length];
        for (int i = 0; i < length; i++) {
            this.sequence[i] = initSequence.charAt(length - i - 1);
        }
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int i) {
        return sequence[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new String(sequence).substring(i, i1);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (char c : sequence) {
            result.append(c);
        }
        return result.toString();
    }
}
// END
