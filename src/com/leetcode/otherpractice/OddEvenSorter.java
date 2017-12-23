package com.leetcode.otherpractice;

public class OddEvenSorter {
	public static void main(String[] args) {
		int []a = new int[] {1, 10, 11, 12, 3, 2, 5, 4};
		for(int i = -1, j = 0; j < a.length; j++) {
			if(a[j] % 2 == 0) { // if j is even
				i++;
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		
		for(int i: a) {
			System.out.println(i);
		}
	}
}
