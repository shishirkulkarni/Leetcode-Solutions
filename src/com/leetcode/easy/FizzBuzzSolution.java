package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {
	public static void main(String[] args) {
		System.out.println(new FizzBuzzSolution().fizzBuzz(15));
	}
	
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			StringBuilder s = new StringBuilder();
			if(i % 3 == 0) {
				s.append("Fizz");
			}
			
			if(i % 5 == 0) {
				s.append("Buzz");
			}
			
			if(i % 3 != 0 && i % 5 != 0) {
				s.append(i);
			}
			
			list.add(s.toString());
		}
		
		return list;
    }
}
