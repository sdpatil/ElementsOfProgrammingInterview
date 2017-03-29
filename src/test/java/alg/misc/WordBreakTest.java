package alg.misc;

import com.alg.misc.WordBreak;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 3/24/17.
 */
public class WordBreakTest {
    WordBreak wordBreak;

    @Before
    public void setup(){
        wordBreak = new WordBreak();
    }

    @Test
    public void simpleTest(){
        HashSet<String> dictonary = new HashSet<String>();
        dictonary.add("I");
        dictonary.add("have");
        dictonary.add("Patil");
        dictonary.add("Sunil");
        dictonary.add("am");
        dictonary.add("this");
        dictonary.add("dog");


        List<String> result= wordBreak.wordBreak("IamSunil",dictonary);
        System.out.println("Result " + result);
    }
}
