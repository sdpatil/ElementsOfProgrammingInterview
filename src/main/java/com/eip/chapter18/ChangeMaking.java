package com.eip.chapter18;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class ChangeMaking {

    public int makeChange(int cents){
        final int[] COINS = new int[]{100,50,25,10,5,1};
        int numOfCoins = 0;

        for(int i = 0; i < COINS.length;i++){
            numOfCoins = numOfCoins + (cents / COINS[i]);
            cents = cents % COINS[i];
        }
        return numOfCoins;
    }

    public List<Integer> coinList(int cents){
        final int[] COINS = new int[]{100,50,25,10,5,1};
       List<Integer> coinsList = new ArrayList<Integer>();

        for(int i = 0; i < COINS.length;i++){
            int numOfCoins = (cents / COINS[i]);
            for(int j = 0 ; j < numOfCoins; j++)
                coinsList.add(COINS[i]);
            cents = cents % COINS[i];
        }
        return coinsList;
    }
}
