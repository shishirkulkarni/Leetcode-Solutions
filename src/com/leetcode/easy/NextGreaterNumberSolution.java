package com.leetcode.easy;

public class NextGreaterNumberSolution {
	 public static void main(String[] args) {
		 
	 }
	 
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 int result[] = new int[nums1.length];
		 
		 for(int i = 0; i < nums1.length; i++) {
			 int j;
			 for(j = 0; j < nums2.length; j++) {
				 if(nums2[j] == nums1[i])
					 break;
			 }
			 for(j = j + 1; j < nums2.length; j++) {
				 if(nums2[j] == nums1[i])
					 break;
			 }
			 
			 if(j == nums2.length) {
				 result[i] = -1;
			 } else {
				 result[i] = nums2[j];
			 }
		 }
		 
		 return result;
	 }
}
