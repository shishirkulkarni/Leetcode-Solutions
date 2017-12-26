package com.leetcode.easy;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int ones = 0, maxOnes = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				while(i < nums.length && nums[i] == 1) {
					ones++;
					i++;
				}
				if(maxOnes < ones) {
					maxOnes = ones;
				}

				ones = 0;				
			}
		}
		
		return maxOnes;
	}
}
