package com.leetcode.datastructures;

/*
 * The famous two pointer technique
 * */

public class RemoveDuplicates {
		
	public int removeDuplicates(int[] nums) {
		if(nums.length <= 1) {
			return nums.length;
		}
		
		int i, j;
		
		for(i = 0, j = 0; j < nums.length; j++) {
			if(nums[j] == nums[i]) {
				continue;
			}
			
			i++;
			nums[i] = nums[j];
		}
		
		return i + 1;
    }
}
