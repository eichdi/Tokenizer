import tokenizer.Tokenizer;
import tokenizer.TokenizerImpl;

public class main {

    public static void main(String[] args) {
        String text = "sluchaini tekst dlya Marselya";
        Tokenizer tokenizer = new TokenizerImpl();
        for (String word:
                tokenizer.split(text)) {

            System.out.printf(word + "\n");

        }
    }

}