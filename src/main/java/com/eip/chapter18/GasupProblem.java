package com.eip.chapter18;

import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class GasupProblem {

    public static class CityAndRemainingGas{
        public Integer city;
        public Integer remainingGallons;

        public CityAndRemainingGas(Integer city, Integer remainingGallons) {
            this.city = city;
            this.remainingGallons = remainingGallons;
        }
    }

    private static final int MPG = 20;

    /*
    Start from 0 at every city figure out how much gas your getting and how much distance you need to travel to go to
    next city. Find the city with the minimum remaining gas and return that
     */
    public int findAmpleCity(List<Integer> gallons, List<Integer> distance){
        int remainingGallons = 0;
        CityAndRemainingGas min = new CityAndRemainingGas(0,0);

        for(int i = 1 ; i < gallons.size(); i++){
            remainingGallons = remainingGallons + gallons.get(i-1) -distance.get(i-1)/MPG;
            System.out.println(i +" -> " + remainingGallons);
            if(remainingGallons < min.remainingGallons)
                min = new CityAndRemainingGas(i, remainingGallons);
         }
         return min.city;
    }
}
