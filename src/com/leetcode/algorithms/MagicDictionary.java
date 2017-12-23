package com.leetcode.algorithms;

import java.util.HashMap;

public class MagicDictionary {
	HashMap<String, Integer> dict;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicDictionary dict = new MagicDictionary();
		dict.buildDict(new String[] {"hello", "leetcode"});
		System.out.println(dict.search("hhllo"));
		
	}
	
	/** Initialize your data structure here. */
    public MagicDictionary() {
    	this.dict = new HashMap<>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
    	for(String s: dict) {
    		this.dict.put(s, 1);
    	}
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
    	StringBuilder s = new StringBuilder(word);
    	for (int i = 0; i < s.length(); i++) {
    		char temp = s.charAt(i);
    		for (char c = 'a'; c <= 'z'; c++) {
    			if(c != temp)
    				s.setCharAt(i, c);
    			if(dict.get(s.toString()) != null) {
    				dict.clear();
    				return true;
    			}
    		}
    		s.setCharAt(i, temp);
    	}
    	dict.clear();
    	return false;
    }

}
