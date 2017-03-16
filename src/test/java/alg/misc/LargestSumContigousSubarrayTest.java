package alg.misc;

import com.alg.misc.LargestSumContigousSubarray;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class LargestSumContigousSubarrayTest {
    LargestSumContigousSubarray largestSumContigousSubarray;

    @Before
    public void setup(){
        largestSumContigousSubarray = new LargestSumContigousSubarray();
    }

    @Test
    public void simpleTest(){
        int[] a = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int result = largestSumContigousSubarray.maxSubArray(a);

        System.out.println("Max sum  " + result);
        assert result ==7;
    }
}
