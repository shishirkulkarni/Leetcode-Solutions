package com.leetcode.medium;

public class IncreasingTripletSubsequence {
	public static void main(String[] args) {
		System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[] {2,1,5,0,4,6}));
	}
	
	public boolean increasingTriplet(int[] nums) {
        int one = 0, two = -1, three = -1;
        if(nums.length < 3)
            return false;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[one]) {
                three = two;
                two = one;
                one = i;
            }
        }
        
        if(one != -1 && two != -1 && three != -1)
            return true;
        
        return false;
    }
}
