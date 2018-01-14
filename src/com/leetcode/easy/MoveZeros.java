package com.leetcode.easy;

public class MoveZeros {
	
	public static void main(String[] args) {
		new MoveZeros().moveZeroes(new int[] {0, 1, 0, 3, 12});
	}
	
	public void moveZeroes(int[] nums) {
		for(int i = -1, j = 0; j < nums.length; j++) {
			if(nums[j] != 0) {
				i++;
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		
		for(int i: nums) {
			System.out.println(i);
		}
	}
}
