package com.leetcode.easy;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int  i, j , k;
        
        for(i = m - 1, j = n - 1, k = m + n - 1; i >= 0 && j >= 0 && k >= 0; k--) {
            if(nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
        }
        
        while(j >= 0 && k >= 0)
            nums1[k--] = nums2[j--];
        
        while(i >= 0 && k >= 0)
            nums1[k--] = nums1[i--];
    }
}
