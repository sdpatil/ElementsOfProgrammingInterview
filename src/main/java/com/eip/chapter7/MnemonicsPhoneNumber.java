package com.eip.chapter7;

import java.util.*;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class MnemonicsPhoneNumber {
    public List<String> phoneMnemonic2(String phoneNumber) {
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
            } else {
                if (digit != 0)
                    phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, mnemonicsStr + i);
                else
                    phoneMnemonic(phoneNumber, digit + 1, mnemonicsList, "" + i);
            }
        }

    }


    Map<Integer, List<String>> numberMap = new HashMap<Integer, List<String>>();

    /**
     * This method takes a phone number and returns all possible String combinations for it
     * Ex. 5103293523 can be represented using 8476 different letters.
     * This is simple backtracking problem
     */
    public List<String> phoneMnemonic(String phoneNumber) {
        char[] partialMnemonic = new char[phoneNumber.length()];
        List<String> mnemonicsList = new ArrayList<>();
        phoneMnemonicHelper(phoneNumber, 0, partialMnemonic, mnemonicsList);
        return mnemonicsList;
    }

    private static final String[] MAPPING = {
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    public void phoneMnemonicHelper(String phoneNumber, int digit, char[] partialMnemonic, List<String> mnemonicsList) {
        if (digit == phoneNumber.length()) {
            mnemonicsList.add(new String(partialMnemonic));
            return;
        }
        int currentChar = Character.getNumericValue(phoneNumber.charAt(digit));
        for (int i = 0; i < MAPPING[currentChar].length(); i++) {
            partialMnemonic[digit] = MAPPING[currentChar].charAt(i);
            phoneMnemonicHelper(phoneNumber,digit+1,partialMnemonic,mnemonicsList);
        }
    }
}