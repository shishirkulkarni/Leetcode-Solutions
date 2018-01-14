package com.leetcode.easy;

public class NumberOf1Bits {

	public int hammingWeight(int n) {
		int count = 0;
		/*Trick to convert signed into unsigned*/
		if((n & Integer.MIN_VALUE) != 0) {
			count++;
			n = n & Integer.MAX_VALUE;
		}

		do {
			if(n % 2 == 1)
				count++;
			n = n >> 1;
		} while(n > 0);

		return count;
	}
}
