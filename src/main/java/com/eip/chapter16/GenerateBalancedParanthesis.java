package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateBalancedParanthesis {

    /*
        Problem: Given a number generate different combinations of that number of balanced parenthesis
         Ex. if no. of parenthesis is 2 then there are 2 ways of generating it [(()), ()()]
         If no. of parentheis is 5 then there are 5 ways to do it [((())), (()()), (())(), ()(()), ()()()]
     */
    public List<String> generateBalancedParanthesis(int numPairs) {
        List<String> result = new ArrayList<>();
        backtrack(numPairs,numPairs,"",result);
        return result;
    }

    public void backtrack(int leftParensNeeded, int rightParenNeeded, String tempString,
                          List<String> result){
        //If we have both required number of right and left parenthesis add this to result
        if(leftParensNeeded == 0 && rightParenNeeded == 0){
            result.add(tempString);
            return;
        }

        //If number of left parenthesis is not 0 then add one left to partial string and go for next
        // round of backtrack
        if(leftParensNeeded > 0){
            backtrack(leftParensNeeded-1,rightParenNeeded,
                    tempString+"(",result);
        }

        // Here check to make sure that number of right parenthesis is always less than
        // number of right if not, that will cause imbalance
        if(leftParensNeeded < rightParenNeeded){
            backtrack(leftParensNeeded,rightParenNeeded-1,
                    tempString+")",result);
        }
    }


/*        public List<String> generateBalancedParanthesis(int numPairs){
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
    }*/
}
