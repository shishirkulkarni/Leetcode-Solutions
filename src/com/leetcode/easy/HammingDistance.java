package com.leetcode.easy;

public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(new HammingDistance().hammingDistance(1, 4));
	}
	
	public int hammingDistance(int x, int y) {
		int hammingDistance = 0;
		while(x > 0 && y > 0) {
			if(x % 2 != y % 2)
				hammingDistance++;
			x = x / 2;
			y = y / 2;
		}
		
		while(x > 0) {
			if(x % 2 == 1)
				hammingDistance++;
			x = x / 2;
			
		}
		
		while(y > 0) {
			if(y % 2 == 1)
				hammingDistance++;
			y = y / 2;
		}
		
		return hammingDistance;
	}
}
