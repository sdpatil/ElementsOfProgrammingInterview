package com.eip.chapter7;

import java.util.*;

/**
 * Problem: This method takes a phone number and returns all possible String combinations for it
 */
public class MnemonicsPhoneNumber {

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