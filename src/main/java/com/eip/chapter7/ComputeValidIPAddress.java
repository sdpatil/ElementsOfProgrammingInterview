package com.eip.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class ComputeValidIPAddress {

    /*
    This method takes a String as input and return various ip addresses that you can make by adding . in appropriate
    places. Ex. 19216811 string can make 9 different ip address
    92.168.1.11
    19.2.168.11
    19.21.68.11
    19.216.8.11
    19.216.81.1
    192.68.1.11
    192.16.8.11
    192.16.81.1
    192.168.1.1
    This method uses backtracking to calculate different combinations
     */
    public List<String> getValidIPAddress(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s,0, new ArrayList<String>(),result);
        return result;
    }

    public void backtrack(String s, int offset, List<String> partialNumberList, List<String> result){
        if(offset == s.length() &&  partialNumberList.size() ==4 ){
            result.add(buildAddress(partialNumberList));
            return;
        }
        for(int j = offset+1; j <= s.length() && j -offset <=3 ; j++ ){
            String part = s.substring(offset,j);
            if(isValidPart(part) && partialNumberList.size() <=3){
                partialNumberList.add(part);
                backtrack(s,j,partialNumberList,result);
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
    private boolean isValidPart(String s){
        if(s.length() >3)
            return false;
        if(s.startsWith("0") && s.length() >0)
            return false;
        int val = Integer.parseInt(s);
        return val <= 255 && val >=0;
    }

    public List<String> getValidIPAddress2(String s){
        List<String> result = new ArrayList<String>();

        for(int i = 1; i < 4 && i < s.length(); i++){
            String first = s.substring(0,i);
            if(isValidPart(first)){
                for(int j = i; j < 4 && i + j < s.length() ; j++){
                    String second = s.substring(i, i+j);
                    if(isValidPart(second)){
                        for(int k = 1; i + j + k < s.length() && k < 4; k++){
                            String third = s.substring(i+j, i + j + k);
                            String four = s.substring( i + j +k);
                            if(isValidPart(third) && isValidPart(four))
                                result.add(first+"."+second+"."+third+"."+four);
                        }
                    }
                }
            }
        }

        return result;
    }

}
