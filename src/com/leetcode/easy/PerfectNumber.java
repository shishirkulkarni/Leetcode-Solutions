package com.leetcode.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(new PerfectNumber().checkPerfectNumber(20));
	}
	
	private boolean checkPerfectNumber(int n) {
		// TODO Auto-generated method stub
		if(n <= 1)
			return false;
		int sum = 1;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				sum += i + n / i;
			}
		}
		
		if(sum == n)
			return true;
		return false;
	}
}
