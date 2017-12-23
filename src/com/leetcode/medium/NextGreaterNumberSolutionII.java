package com.leetcode.medium;

public class NextGreaterNumberSolutionII {
	 
	public int[] nextGreaterElements(int[] nums) {
       int result[] = new int[nums.length];
		 
		 for(int i = 0; i < nums.length; i++) {
			 int j;
			 for(j = i + 1; j % nums.length != i; j++) {
				if(nums[j % nums.length] > nums[i]) {
                    break;
				}
			 }
			 
			 if((j % nums.length) == i) {
				 result[i] = -1;
			 } else {
				 result[i] = nums[j % nums.length];
			 }
		 }
		 
		 return result; 
	}
}
