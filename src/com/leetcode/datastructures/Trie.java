package com.leetcode.datastructures;

import java.util.Iterator;
import java.util.Set;

public class Trie {
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.buildDict(new String[] {"hello", "leetcode"});
		
		System.out.println(t.switchSearch("hello"));
		System.out.println(t.switchSearch("hhllo"));
		System.out.println(t.switchSearch("hell"));
		System.out.println(t.switchSearch("leetcoded"));

	}
	//LeetCode 208
	public boolean search(String s) {
		TrieNode current = root, temp;
		for(char c: s.toCharArray()) {
			if((current = current.getCharInMap(c)) == null) {
				return false;
			}
		}
		return current.isEndOfWord();
	}
	
	public void buildDict(String[] strings) {
		//TODO: implement this method
		for(String s: strings) {
			char str[] = s.toCharArray();
			TrieNode current = root, temp;
			for(char c: s.toCharArray()) {
				if((temp = current.getCharInMap(c)) == null) {
					current = current.putCharInMap(c);
				} else {
					current = temp;
				}
			}
			current.setEndOfWord();	
		}
	}
	
	//Leetcode 208
	public boolean startsWith(String s) {
		TrieNode current = root;
		for(char c: s.toCharArray()) {
			if((current = current.getCharInMap(c)) == null) {
				return false;
			}
		}
		
		return current.elements.size() > 0 || current.isEndOfWord() ? true : false;
	}
	
	//Leetcode 676
	public boolean switchSearch(String s) {
		TrieNode current = root, temp;
		char str[] = s.toCharArray();
		for(int i = 0; i < str.length; i++) {
			if(current != null && (temp = current.getCharInMap(str[i])) != null) {
				current = temp;
				continue;
			} else {
				Iterator<Character> it = current.elements.keySet().iterator();
				while(it.hasNext()) {
					char c = it.next();
					str[i] = c;
					if(subSearch(str, current, i) == true) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	//Leetcode 676
	public boolean subSearch(char[] str, TrieNode root, int i) {
		for(; i < str.length; i++) {
			if((root = root.getCharInMap(str[i])) == null) {
				return false;
			}
		}
		
		return root.elements.size() > 0 || root.isEndOfWord() ? true : false;
	}

}
