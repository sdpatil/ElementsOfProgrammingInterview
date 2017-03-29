package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateBalancedParanthesis {

    public List<String> generateBalancedParanthesis(int numPairs){
        List<String> paranthesisList = new ArrayList<>();
        generateBalancedParanthesis(numPairs, numPairs,"", paranthesisList);
        return paranthesisList;
    }

    public void generateBalancedParanthesis(int numberOfLeftParanthesis, int numberOfRightParanthesis,
                                            String validPrefix, List<String> result){
       if(numberOfLeftParanthesis == 0 && numberOfRightParanthesis == 0){
           result.add(validPrefix);
           return;
       }
       if(numberOfLeftParanthesis >0){
           generateBalancedParanthesis(numberOfLeftParanthesis-1,
                   numberOfRightParanthesis, validPrefix+"(",result);
       }
       if(numberOfLeftParanthesis < numberOfRightParanthesis){
           generateBalancedParanthesis(numberOfLeftParanthesis,
                   numberOfRightParanthesis-1, validPrefix+")",result);

       }
    }
}
