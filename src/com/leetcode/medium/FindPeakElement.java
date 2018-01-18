package com.leetcode.medium;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		if(nums.length == 1)
			return 0;
		int prev = Integer.MIN_VALUE, next = Integer.MIN_VALUE, peak = prev;
		for(int i = 0; i < nums.length; i++) {
			next = i + 1 >= nums.length ? Integer.MIN_VALUE : nums[i + 1];
			prev = i - 1 < 0 ? Integer.MIN_VALUE : nums[i - 1];
			if(nums[i] > next && nums[i] > prev) {
				return i;
			}
		}
		return -1;
	}
}
