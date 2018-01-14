package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));
	}
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> numbers = new ArrayList<>();
		for(int i = left; i <= right; i++) {
			char []digits = ("" + i).toCharArray();
			int j;
			for(j = 0; j < digits.length; j++) {
				if(digits[j] == '0')
					break;
				if(i % Integer.parseUnsignedInt("" + digits[j]) != 0)
					break;
			}
			
			if(j == digits.length)
				numbers.add(i);
		}
		return numbers;
	}
}
