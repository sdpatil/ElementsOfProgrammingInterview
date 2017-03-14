package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RunLengthEncodingDecodingTest {
    RunLengthEncodingDecoding runLengthEncodingDecoding;

    @Before
    public void setup() {
        runLengthEncodingDecoding = new RunLengthEncodingDecoding();
    }

    @Test
    public void encodingTest() {
        String input = "aaaabcccaa";
        String encodedString = runLengthEncodingDecoding.encoding(input);
        System.out.println("Return String " + encodedString);
        assert encodedString.equals("4a1b3c2a");
    }

    @Test
    public void decodingTest() {
        String input = "4a1b3c2a";
        String encodedString = runLengthEncodingDecoding.decoding(input);
        System.out.println("Return String " + encodedString);

        assert encodedString.equals("aaaabcccaa");
    }

    @Test
    public void decoding2Test() {
        String input = "3e4f2e";
        String encodedString = runLengthEncodingDecoding.decoding(input);
        System.out.println("Return String " + encodedString);

        assert encodedString.equals("eeeffffee");
    }
}
