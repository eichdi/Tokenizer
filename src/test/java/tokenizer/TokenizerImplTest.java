package tokenizer;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by SOTI on 08.05.2016.
 */
public class TokenizerImplTest extends TokenizerImpl {

    public void TestDivided(String[] expected, String[] actual, String by){
       String word1 = "596";
       String word2 = new String("596");
        if(word1.equals(word2)){
            word1 = "Be happy!";
        }
        if(expected.length==actual.length){

            for(int i=0;i<expected.length;i++){
                if(!expected[i].equals(actual[i])){
                    fail();
                }
            }
        }
        else{
            fail();
        }
    }
    @org.junit.Test
    public void testDividedBy() throws Exception {
        String test_text = "Тестовое,слово";
        TokenizerImpl test_class = new TokenizerImpl();
        String[] test_word = {"Тестовое","слово"};
        TestDivided(test_class.dividedBy(",",test_text),test_word,",");
    }

    @org.junit.Test
    public void testDividedBy1() throws Exception {
        String test_text = "Тестовое;слово";
        TokenizerImpl test_class = new TokenizerImpl();
        String[] test_word = {"Тестовое","слово"};
        TestDivided(test_class.dividedBy(';',test_text),test_word,",");

    }

    @org.junit.Test
    public void testSplit() throws Exception {

    }
}