package com.leetcode.easy;

public class PivotSearch {

    public static void main(String[] args) {
        PivotSearch ps = new PivotSearch();

        System.out.println(ps.searchPivot(new int[] {4,5,6,7,-1,1,2}));
    }

    int searchPivot(int[] nums) {

        if(nums[0] < nums[nums.length - 1]) return 0;

        int start = 0, end = nums.length - 1, mid;

        while(start < end) {
            mid = (start + end) / 2;

            if(nums[mid + 1] < nums[mid]) return nums[mid + 1];

            if(nums[mid] < nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
