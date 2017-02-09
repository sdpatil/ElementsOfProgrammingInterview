package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SpreadsheetColumnEncodingTest {
    SpreadsheetColumnEncoding spreadsheetColumnEncoding;

    @Before
    public void setup(){
        spreadsheetColumnEncoding =new SpreadsheetColumnEncoding();
    }

    @Test
    public void simpleTest(){
        assert spreadsheetColumnEncoding.ssDecodeColID("A") ==1;
        assert spreadsheetColumnEncoding.ssDecodeColID("D") ==4;
    }

    @Test
    public void twoLetterColumnTest(){
        assert spreadsheetColumnEncoding.ssDecodeColID("AA") ==27;
        assert spreadsheetColumnEncoding.ssDecodeColID("ZZ") ==702;
    }

    @Test
    public void ssDecodColIDA0(){
        assert spreadsheetColumnEncoding.ssDecodeColIDA0("A") ==0;
        assert spreadsheetColumnEncoding.ssDecodeColIDA0("D") ==3;
    }
}
