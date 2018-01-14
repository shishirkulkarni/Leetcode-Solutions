package com.leetcode.easy;



public class RotateArray {

	public static void main(String[] args) {
		int nums[] = new int[] {1, 2};
		
		new RotateArray().rotate(nums, 1);
		
		for(int i: nums)
			System.out.print(i);
	}
	
	public void rotate(int[] nums, int k) {

		if(nums.length == 0)
			return;
		
		for(int i = 0, j = nums.length - k - 1; i < j; i++, j--) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
		
		for(int i = nums.length - k, j = nums.length - 1; i <= j; i++, j--) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
		
		for(int i = 0; i < nums.length / 2; i++) {
			int tmp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = tmp;
		}
	}

}
