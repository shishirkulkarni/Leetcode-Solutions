package com.leetcode.easy;

public class BestTimeStocks {
	public static void main(String[] args) {
		System.out.println(new BestTimeStocks().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
	}
	
	public int maxProfit(int[] prices) {
        if(prices.length <= 1) // Cannot buy or sell stock
            return 0;
        int min = prices[0], profit = 0;
        for(int i = 0; i < prices.length; i++) {
        	min = Math.min(min, prices[i]);
        	profit = Math.max(profit,  prices[i] - min);
        }
        return profit;
    }
}
