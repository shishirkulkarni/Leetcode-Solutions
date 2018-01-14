package com.leetcode.medium;

public class ComplexNumberMult {
	public static void main(String[] args) {
		System.out.println(new ComplexNumberMult().complexNumberMultiply("78+-76i", "-86+72i"));
	}
	
	public String complexNumberMultiply(String a, String b) {
		int num1[] = parseNumber(a), num2[] = parseNumber(b), res[] = new int[2];
		res[0] = (num1[0] * num2[0]) - (num1[1] * num2[1]);
		res[1] = (num1[1] * num2[0]) + (num1[0] * num2[1]);
		return complexify(res);
	}
	
	private int[] parseNumber(String n) {
		int res[] = new int[2], i = 0, l = n.length();
		StringBuilder s = new StringBuilder();
		
		for(i = 0; ; i++) {
			if(n.charAt(i) == '+' || n.charAt(i) == '-')
				if(i == 0) {
					s.append(n.charAt(i));
					continue;
				}
				else
					break;
			s.append(n.charAt(i));
		}
		
		res[0] = Integer.parseInt(s.toString());
		i++;
		s = new StringBuilder();
		
		for(; n.charAt(i) != 'i'; i++) {
			s.append(n.charAt(i));
		}
		
		res[1] = Integer.parseInt(s.toString());
//		System.out.println(res[0] + " " + res[1]);
		return res;
	}
	
	private String complexify(int[] num) {
		StringBuilder s = new StringBuilder();
		s.append(num[0]);
		s.append('+');
		s.append(num[1]);
		s.append("i");
		return s.toString();
	}
}
