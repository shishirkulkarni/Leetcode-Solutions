package com.leetcode.easy;

import java.util.Arrays;

public class MaxProduct628 {
    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(nums[0] * nums[1] * nums[n - 1],
                nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
