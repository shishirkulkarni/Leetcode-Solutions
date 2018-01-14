package com.leetcode.easy;

import java.util.LinkedList;

public class BaseballSolution {
	
	public static void main(String[] args) {
		System.out.println(new BaseballSolution().calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
	}
	
	
	public int calPoints(String[] ops) {
		int sum = 0;
		LinkedList<String> stack = new LinkedList<>();
		for(String s: ops) {
			switch(s) {
				case "C":
					try {
						String elm = stack.removeFirst();
						sum -= Integer.parseInt(elm);
					} catch(Exception e) {}
					break;
				case "D":
					try {
						String elm = stack.peekFirst();
						sum += (Integer.parseInt(elm) * 2);
						stack.addFirst("" + (Integer.parseInt(elm) * 2));
					} catch (Exception e) {}
					break;
				case "+":
					String val1, val2;
					try {
						val1 = stack.removeFirst();
					} catch(Exception e) {
						val1 = "0";
					}
					
					try {
						val2 = stack.removeFirst();
					} catch(Exception e) {
						val2 = "0";
					}
					
					sum += Integer.parseInt(val1) + Integer.parseInt(val2);
					stack.addFirst(val2);
					stack.addFirst(val1);
					stack.addFirst("" + (Integer.parseInt(val1) + Integer.parseInt(val2)));
					break;
				default:
					sum += Integer.parseInt(s);
					stack.addFirst(s);
			}
//			System.out.println(stack + ", " + sum);
		}
		
		return sum;
    }
	
}
