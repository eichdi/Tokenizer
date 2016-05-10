import tokenizer.Tokenizer;
import tokenizer.TokenizerImpl;

/**
 * Created by SOTI on 08.05.2016.
 */
public class main {
    public static void main(String[] args) {
        String text = "sluchaini tekst dlya Marselya";
        Tokenizer tokenizer = new TokenizerImpl();
        for (String word:
                tokenizer.split(text)) {
            System.out.printf(word+"\n");
        }
    }
}