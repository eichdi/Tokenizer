package tokenizer;

public class TokenizerImpl implements Tokenizer {

    @Override
    public String[] dividedBy(String by, String text) {
        return text.split(by);
    }

    @Override
    public String[] dividedBy(char by, String text) {
        return text.split(new String(new char[] { by }));
    }

    @Override
    public String[] split(String text) {
        String[] result =  text.split(" ");
        return  result;
    }
}
