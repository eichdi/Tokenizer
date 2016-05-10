package tokenizer;

public interface Tokenizer {
    String[] dividedBy(String by, String text);

    String[] dividedBy(char by, String text);

    String[] split(String text);
}
