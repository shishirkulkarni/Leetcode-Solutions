package com.leetcode.easy;

public class MinCostClimbingStairs {
	public static void main(String[] args) {
		System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}
	
    public int minCostClimbingStairs(int[] cost) {
    	int opt[] = new int[cost.length];
    	opt[0] = cost[0];
    	opt[1] = cost[1];
    	for(int i = 2; i < cost.length; i++) {
    		opt[i] = Math.min(cost[i] + opt[i - 1], cost[i] + opt[i - 2]);
    	}
    	
    	return Math.min(opt[opt.length - 2], opt[opt.length - 1]);
    }
}
