package com.leetcode.easy;

public class JudgeCircle {
	public static void main(String[] args) {
		System.out.println(new JudgeCircle().judgeCircle("LL"));
	}
	
	public boolean judgeCircle(String moves) {
		int x = 0, y = 0, len = moves.length();
		for(int i = 0; i < len; i++) {
			switch (moves.charAt(i)) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'L':
				x++;
				break;
			case 'R':
				x--;
				break;
			}
		}
		if(x == 0 && y == 0)
			return true;
		return false;
	}
}
