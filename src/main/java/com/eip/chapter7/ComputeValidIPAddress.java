package com.eip.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class ComputeValidIPAddress {

    public List<String> getValidIPAddress(String s){
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

    private boolean isValidPart(String s){
        if(s.length() >3)
            return false;

        if(s.startsWith("0") && s.length() >0)
            return false;

        int val = Integer.parseInt(s);
        return val <= 255 && val >=0;
    }
}
