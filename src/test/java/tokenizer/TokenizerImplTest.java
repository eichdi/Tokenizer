package tokenizer;

import java.util.stream.Stream;

import static org.junit.Assert.*;


public class TokenizerImplTest extends TokenizerImpl {

    public void TestDivided(String[] expected, String[] actual, String by){
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
        String test_text = "Тестовое слово";
        TokenizerImpl test_class = new TokenizerImpl();
        String[] test_word = {"Тестовое","слово"};
        TestDivided(test_class.split(test_text),test_word,",");
    }
}