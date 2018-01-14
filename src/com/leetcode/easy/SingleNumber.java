package com.leetcode.easy;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		System.out.println(new SingleNumber().singleNumber(new int[] {1,1,3,2,2}));
	}
	
	public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2) {
        	if(i + 1 >= nums.length || nums[i] != nums[i + 1])
        		return nums[i];
        }
        return 0;
    }
}
