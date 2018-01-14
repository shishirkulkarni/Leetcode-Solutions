package com.leetcode.easy;

public class MaximumSubarray {
	public static void main(String[] args) {
		System.out.println(new MaximumSubarray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	public int maxSubArray(int[] nums) {
			int []opt = new int[nums.length];
			
			for(int i = 0; i < nums.length; i++) {
				opt[i] = nums[i];
			}
			
			int max = opt[0];
			
			for(int i = 1; i < nums.length; i++) {
				opt[i] = Math.max(opt[i], nums[i] + opt[i - 1]);
				if(max < opt[i]) {
					max = opt[i];
				}
			}
			
			return max;
	}
}
