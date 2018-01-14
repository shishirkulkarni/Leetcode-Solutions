package com.leetcode.easy;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(-1563847412));
	}
	
	public int reverse(int x) {
		long res = 0;
		int sign = x < 0 ? -1 : 1;
		x = sign * x;
		while(x > 0) {
			res *= 10;
			int digit = x % 10;
			res += digit;
			x /= 10;
		}
		
		return (sign * res) > (long)Integer.MAX_VALUE || (sign * res) < (long)Integer.MIN_VALUE ? 0 : (int)(sign * res);
	}
}
