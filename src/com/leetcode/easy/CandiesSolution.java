package com.leetcode.easy;

import java.util.HashMap;

public class CandiesSolution {
	public static void main(String[] args) {
//		System.out.println(new CandiesSolution().distributeCandies(new int[] {1, 1, 2, 3}));
		int[] arr = new int[new CandiesSolution().distributeCandies(new int[] {1, 1, 2, 3})];
		System.out.println(arr.length);
	}
	
	public int distributeCandies(int[] candies) {
        int count = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i: candies) {
        	if(map.get(i) == null) {
        		map.put(i, true);
        		count++;
        	}
        }
        if(count > candies.length / 2) {
        	return candies.length / 2;
        } else {
        	return count;
        }
    }
}
