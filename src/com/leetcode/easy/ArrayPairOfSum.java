package com.leetcode.easy;

import java.util.Arrays;

public class ArrayPairOfSum {
	
	public static void main(String[] args) {
		System.out.println(new ArrayPairOfSum().arrayPairOfSum(new int[] {2, 3, 1, 4}));
	}
	
	public int arrayPairOfSum(int num[]) {
		int sum = 0;
		Arrays.sort(num);
		for(int i = 0; i < num.length; i += 2) {
			sum += num[i];
		}
		return sum;
	}
}
