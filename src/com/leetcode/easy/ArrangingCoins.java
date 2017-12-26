package com.leetcode.easy;

public class ArrangingCoins {
	public static void main(String[] args) {
		System.out.println(new ArrangingCoins().arrangeCoins(1804289383));
	}
	
	public int arrangeCoins(int n) {
		return (int)(Math.sqrt(2.0 * n + 0.25) - 0.5);
	}
}
