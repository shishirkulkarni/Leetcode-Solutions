package com.leetcode.easy;

public class NumberComplementSolution {
	public static void main(String[] args) {
		System.out.println(new NumberComplementSolution().findComplement(5));
	}
	
	public int size(int n) {
		int size = 0;
		while(n > 0) {
			n = n / 2;
			size++;
		}
		return size;
	}
	
	public int findComplement(int num) {
		int mask = ~0;
		mask = mask << size(num);
        return ~num & ~mask;
    }
}
