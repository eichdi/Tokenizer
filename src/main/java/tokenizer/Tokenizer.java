package tokenizer;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer;

/**
 * Created by SOTI on 08.05.2016.
 */
public interface Tokenizer {
    String[] dividedBy(String by, String text);

    String[] dividedBy(char by, String text);

    String[] split(String text);
}
