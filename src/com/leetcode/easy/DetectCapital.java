package com.leetcode.easy;

public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(new DetectCapital().detectCapitalUse("FlaG"));
	}
	
	public boolean detectCapitalUse(String word) {
		if(word.length() <= 1)
			return true;
		if(Character.isUpperCase(word.charAt(1))) {
			for(char c: word.toCharArray()) {
				if(Character.isLowerCase(c))
					return false;
			}
		} else {
			char[] charArr = word.toCharArray();
			for(int i = 1; i < charArr.length; i++) {
				if(Character.isUpperCase(charArr[i]))
					return false;
			}
		}
		
		return true;
	}
}
