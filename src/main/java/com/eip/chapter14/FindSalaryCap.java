package com.eip.chapter14;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class FindSalaryCap {

    /**
     * Given salaries of different employees and target payroll come up with a cap by which people who get less than
     * that salary dont get affected by people who get more salary than cap get reduced to cap
     * Ex. Employee salaray {20,30,40,90,100} and total payroll of 210. Cap should be 60 and new salaries would be
     * {20,30,40,60,60}
     *
     */
    public double findSalaryCap2(double targetPayroll, List<Double> currentSalaries) {
        //First sort the current salaries
        Collections.sort(currentSalaries);
        double unAdjustedSalariesSum = 0;
        // Now imagine if current salary is the cap then take sum of all the salaries that are lower than current salary
        // plus current salary * no. of employees left, if that sum is more than cap then take
        // total cap - money left and divide that by number of employees left
        for(int i = 0 ; i < currentSalaries.size() ; i++){
            final  double adjustedSalaraySum = currentSalaries.get(i) * (currentSalaries.size()-i);
            if(unAdjustedSalariesSum + adjustedSalaraySum >= targetPayroll){
                return (targetPayroll - unAdjustedSalariesSum)/(currentSalaries.size()-i);
            }
            unAdjustedSalariesSum = unAdjustedSalariesSum + currentSalaries.get(i);
        }
        return -1.0;
    }


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
