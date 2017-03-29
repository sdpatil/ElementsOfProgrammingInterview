package alg.misc;

import com.alg.misc.WordPermutation;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/24/17.
 */
public class WordPermutationTest {
    WordPermutation wordPermutation;

    @Before
    public void setup(){
        wordPermutation = new WordPermutation();
    }

    @Test
    public void simpleTest(){
       List<String> result = wordPermutation.permutation("ABC");
       System.out.println("Result " + result);
    }
}
