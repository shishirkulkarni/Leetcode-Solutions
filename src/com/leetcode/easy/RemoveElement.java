package com.leetcode.easy;

public class RemoveElement {
	
	public static void main(String[] args) {
		new RemoveElement().removeElement(new int[] {3,2,2,3}, 3);
	}
	
	public int removeElement(int[] nums, int val) {
		int occurences = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == val)
				occurences++;
			else {
				nums[i - occurences] = nums[i];
			}
		}
		
		return nums.length - occurences;
	}
}
