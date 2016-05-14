package tokenizer;

import org.junit.Before;

import java.util.stream.Stream;

import static org.junit.Assert.*;


public class TokenizerImplTest  {

    TokenizerImpl test_class;
    String[] test_word;
    String test_text;
    String by;
    char by_char;


    @Before
    public void setAp(){
        this.test_class = new TokenizerImpl();
        this.test_word = new String[]{"Тестовое", "слово"};
        this.by_char = ';';
        this.by = ""+by_char;
        this.test_text = getText(by);
    }

    public  String getText(String by){
        String test_text = test_word[0];
        for(int i=1;i<test_word.length;i++){
            test_text+=by+test_word[i];
        }
        return test_text;
    }

    public void testDivided(String[] expected, String[] actual){

        assertArrayEquals("Word is wrong divided",expected,actual);

    }

    @org.junit.Test
    public void testDividedBy() throws Exception {
        testDivided(test_class.dividedBy(by,test_text),test_word);
    }

    @org.junit.Test
    public void testDividedBy1() throws Exception {
        testDivided(test_class.dividedBy(by_char,test_text),test_word);
    }

    @org.junit.Test
    public void testSplit() throws Exception {
        String test_text = "Тестовое слово";
        String[] test_word = new String[]{"Тестовое", "слово"};
        testDivided(test_class.split(test_text),test_word);
    }
}