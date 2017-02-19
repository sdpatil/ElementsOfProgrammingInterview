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

    public int findAmpleCity(List<Integer> gallons, List<Integer> distance){
        int remainingGallons = 0;
        CityAndRemainingGas min = new CityAndRemainingGas(0,0);

        for(int i = 1 ; i < gallons.size(); i++){
            remainingGallons = remainingGallons + gallons.get(i-1) -distance.get(i-1)/MPG;
            if(remainingGallons < min.remainingGallons)
                min = new CityAndRemainingGas(i, remainingGallons);
         }
         return min.city;
    }
}
