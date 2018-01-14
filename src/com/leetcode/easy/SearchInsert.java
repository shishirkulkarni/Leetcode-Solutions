package com.leetcode.easy;

public class SearchInsert {
	public static void main(String[] args) {
		System.out.println(new SearchInsert().searchInsert(new int[] {1,3,5,6}, 0));
	}
	
	public int searchInsert(int[] nums, int target) {
		int i = 0, j = nums.length - 1, mid = (i + j) / 2;
		while(i <= j) {
			if(nums[mid] == target)
				return mid;
			if(target > nums[mid])
				i = mid + 1;
			else {
				j = mid - 1;
			}
			mid = (i + j) / 2;
		}
		
		return i;
	}
}
