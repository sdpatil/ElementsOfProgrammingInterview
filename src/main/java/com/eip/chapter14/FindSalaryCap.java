package com.eip.chapter14;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class FindSalaryCap {
    public double findSalaryCap(double targetPayroll, List<Double> currentSalaries) {
        Collections.sort(currentSalaries);

        double unadjustedSalariesSum = 0;
        int salariesSize = currentSalaries.size();
        for(int i = 0 ; i < currentSalaries.size();i++){
            double  adjustedSalariesSum =  (salariesSize-i)*currentSalaries.get(i);
            if(unadjustedSalariesSum + adjustedSalariesSum >= targetPayroll ){
                return (targetPayroll - unadjustedSalariesSum)/(currentSalaries.size()-i);
            }
            unadjustedSalariesSum += currentSalaries.get(i);
        }
        return 0;
    }
}
