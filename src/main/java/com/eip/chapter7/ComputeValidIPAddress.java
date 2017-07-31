package com.eip.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: This method takes a String as input and return various ip addresses that you can make by adding . in appropriate
 * places. Ex. 19216811 string can make 9 different ip address
 * 92.168.1.11
 * 19.2.168.11
 * 19.21.68.11
 * 19.216.8.11
 * 19.216.81.1
 * 192.68.1.11
 * 192.16.8.11
 * 192.16.81.1
 * 192.168.1.1
 */
public class ComputeValidIPAddress {

    /*

    This method uses backtracking to calculate different combinations
     */
    public List<String> getValidIPAddress(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<String>(), result);
        return result;
    }

    //At every invocation add one more characetr to current part and call this method again
    public void backtrack(String s, int offset, List<String> partialNumberList, List<String> result) {
        if (offset == s.length() && partialNumberList.size() == 4) {
            result.add(buildAddress(partialNumberList));
            return;
        }
        for (int j = offset + 1; j <= s.length() && j - offset <= 3; j++) {
            String part = s.substring(offset, j);
            if (isValidPart(part) && partialNumberList.size() <= 3) {
                partialNumberList.add(part);
                backtrack(s, j, partialNumberList, result);
                partialNumberList.remove(part);
            }
        }
    }

    private String buildAddress(List<String> partList) {
        StringBuffer ipAddress = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            ipAddress.append(partList.get(i));
            if (i != 3)
                ipAddress.append(".");
        }
        return ipAddress.toString();
    }

    //Check if this string forms valid ip address part. i.e. length less than equal to 3 and does not start with 0
    private boolean isValidPart(String s) {
        if (s.length() > 3)
            return false;
        if (s.startsWith("0") && s.length() > 0)
            return false;
        int val = Integer.parseInt(s);
        return val <= 255 && val >= 0;
    }

}
