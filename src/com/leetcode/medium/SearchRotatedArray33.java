package com.leetcode.medium;

public class SearchRotatedArray33 {
    public static void main(String[] args) {
        SearchRotatedArray33 sra = new SearchRotatedArray33();
        int[] nums = new int[] {5, 1, 3};
        System.out.println(sra.search(nums, 1));
    }

    public int search(int[] nums, int target) {
        int l = 0, e = nums.length - 1, mid = -1;

        while(l <= e) {
            mid = (l + e) / 2;

            if(target == nums[mid]) return mid;

            if(nums[mid] <= nums[e]) {
                if(target > nums[mid] && target <= nums[e]) {
                    l = mid + 1;
                } else e = mid - 1;
            } else {
                if(target >= nums[l] && target < nums[mid]) {
                    e = mid - 1;
                } else l = mid + 1;
            }
        }

        return -1;
    }
}
