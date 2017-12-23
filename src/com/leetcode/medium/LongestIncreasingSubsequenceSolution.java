package com.leetcode.medium;

public class LongestIncreasingSubsequenceSolution {
	public static void main(String[] args) {
		System.out.println(new LongestIncreasingSubsequenceSolution().lengthOfLIS(new int[] {110,9,2,5,3,7,101,18}));
	}
	public int lengthOfLIS(int[] nums) {
		int length = 0;
		int[] lookup = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			lookup[i]++;
			for(int j = 0; j < i; j++) {
				if(nums[j] < nums[i]) {
					lookup[i]++;
				}
			}
			
			if(length < lookup[i])
				length = lookup[i];
		}
		return length;
    }
}
