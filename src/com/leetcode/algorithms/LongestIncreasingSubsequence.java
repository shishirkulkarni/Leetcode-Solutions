package com.leetcode.algorithms;

/*Given an unsorted array of integers, find the length of longest continuous increasing subsequence.*/

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLengthOfLCIS(new int[] {1, 3, 5, 7}));		

	}
	
	public static int findLengthOfLCIS(int[] nums) {
		if(nums.length == 0)
				return 0;
		int count = 0, max = count;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i - 1]) {
				count++;
			} else {
				if(max < count) {
					max = count;
				}
				count = 1;
			}
		}
		if(max < count) {
			max = count;
		}
		return max;
	}

}