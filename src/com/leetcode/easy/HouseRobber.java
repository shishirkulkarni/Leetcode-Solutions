package com.leetcode.easy;

public class HouseRobber {
	public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        if(nums.length == 1) {
            return nums[0];
        }
        
        int opt[] = new int[nums.length];
        opt[0] = nums[0];
        opt[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++) {
            opt[i] = Math.max(opt[i - 1], nums[i] + opt[i - 2]);
        }
        return opt[opt.length - 1];
    }
}
