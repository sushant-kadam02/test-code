package com.sample.ListExample;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] stockPrices = {7,1,2,5,8,4,6};

        //int[] stockPrices = {7,6,5,4,3,2,1};

        System.out.println("max profit will be : "+ maxProfit(stockPrices));

    }

    private static int maxProfit(int[] stockPrices) {

        int maxProfit = 0;
        int buyPrice = stockPrices[0];

        for(int i = 1; i < stockPrices.length; i++) {
            int currentProfit = stockPrices[i] - buyPrice;

            if(currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            if(stockPrices[i] < buyPrice) {
                buyPrice = stockPrices[i];
            }
        }
        return maxProfit;
    }
}
