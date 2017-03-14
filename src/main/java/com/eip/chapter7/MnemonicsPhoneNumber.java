package com.eip.chapter7;

import java.util.*;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class MnemonicsPhoneNumber {
    public List<String> phoneMnemonic(String phoneNumber) {
        List<String> mnemonicsList = new ArrayList<String>();
        numberMap.put(2, Arrays.asList("A", "B", "C"));
        numberMap.put(3, Arrays.asList("D", "E", "F"));
        numberMap.put(4, Arrays.asList("G", "H", "I"));
        numberMap.put(5, Arrays.asList("J", "K", "L"));
        numberMap.put(6, Arrays.asList("M", "N", "O"));
        numberMap.put(7, Arrays.asList("P", "Q", "R", "S"));
        numberMap.put(8, Arrays.asList("T", "U", "V"));
        numberMap.put(9, Arrays.asList("W", "X", "Y", "Z"));

        phoneMnemonic(phoneNumber, 0, mnemonicsList, "");

        return mnemonicsList;
    }

    public void phoneMnemonic(String phoneNumber, int digit, List<String> mnemonicsList, String mnemonicsStr) {
        if (phoneNumber.length() - 1 == digit) {
            int i = Character.getNumericValue(phoneNumber.charAt(digit));

            List<String> charList = numberMap.get(i);
            for (String s : charList) {
                mnemonicsList.add(mnemonicsStr + s);
            }
        } else {
            int i = Character.getNumericValue(phoneNumber.charAt(digit));
            if (numberMap.containsKey(i)) {
                List<String> charList = numberMap.get(i);
                for (String s : charList) {
                    if (digit != 0)
                        phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, mnemonicsStr + s);
                    else
                        phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, "" + s);
                }
            }else{
                if (digit != 0)
                    phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, mnemonicsStr + i);
                else
                    phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, "" + i);
            }
        }

    }

    Map<Integer, List<String>> numberMap = new HashMap<Integer, List<String>>();

}
