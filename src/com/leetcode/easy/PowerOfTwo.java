package com.leetcode.easy;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println(new PowerOfTwo().isPowerOfTwo(3));
	}
	
	public boolean isPowerOfTwo(int n) {
		while(n > 1) {
			if(n % 2 != 0) {
				break;
			}
			
			n = n / 2;
		}
		
		if(n <= 1)
			return true;
		return false;
	}
}
