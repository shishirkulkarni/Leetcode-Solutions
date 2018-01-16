package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StrStr {
	public static void main(String[] args) {
		
		System.out.println(new StrStr().strStr("sdasdasd", "asdasd"));
	}
	
	public int strStr(String haystack, String needle) {		
		if(haystack.length() == 0 && needle.length() == 0)
            return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for(j = 0; j < needle.length() && j < haystack.length(); j++) {
                if(needle.charAt(j) != haystack.charAt(i + j))
                    break;
            }
            if(j == needle.length())
                return i;
        }

        return -1;
    }
}
