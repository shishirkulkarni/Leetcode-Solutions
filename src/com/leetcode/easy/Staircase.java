package com.leetcode.easy;

public class Staircase {
	public static void main(String[] args) {
		System.out.println(new Staircase().staircase(8));
	}
	
	public int staircase(int n) {
		switch(n) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		}
		
		int[] opt = new int[n + 1];
		opt[0] = 0;
		opt[1] = 1;
		opt[2] = 2;
		for(int i = 3; i < opt.length; i++) {
			opt[i] = opt[i - 1] + opt[i - 2];
		}
		
		return opt[n];
	}
}
