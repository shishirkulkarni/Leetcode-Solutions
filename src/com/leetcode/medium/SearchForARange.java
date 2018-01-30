package com.leetcode.medium;

public class SearchForARange {
	public static void main(String[] args) {
		SearchForARange obj = new SearchForARange();
		int []res = obj.searchRange(new int[] {2,2}, 1);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

	public int[] searchRange(int[] nums, int target) {
		int low = 0, high = nums.length - 1, mid = (low + high) / 2;
		int res[] = new int[] {-1, -1};
		if(nums.length == 0) {
			return res;
		}
		while(low < high) {
			if(nums[mid] == target) {
				break;
			}
			if(nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high) / 2;
		}

		if(low == high) {
			if(nums[low] == target) {
				res[0] = low;
				res[1] = high;
			}
		} else {
			int i = mid, j = mid;
			while(i >= 0 && nums[i] == target )
				i--;
			while(j < nums.length && nums[j] == target)
				j++;                
			res[0] = i + 1;
			res[1] = j - 1;
			return res;
		}

		return res;
	}
}
