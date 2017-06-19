package com.eip.chapter7;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RunLengthEncodingDecoding {

    public String encoding(String s) {
        StringBuffer encodedString = new StringBuffer();
        char c = s.charAt(0);
        int charCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                charCount++;
            } else {
                encodedString.append(charCount);
                encodedString.append(c);
                c = s.charAt(i);
                charCount = 1;
            }
        }
        encodedString.append(charCount);
        encodedString.append(c);
        return encodedString.toString();
    }

    public String decoding(String s) {
        StringBuffer decodedString = new StringBuffer();
        for (int i = 0; i < s.length(); i = i + 2) {
            int charCount = Character.getNumericValue(s.charAt(i));
            char c = s.charAt(i + 1);
            for (int j = 0; j < charCount; j++)
                decodedString.append(c);
        }

        return decodedString.toString();
    }
}
