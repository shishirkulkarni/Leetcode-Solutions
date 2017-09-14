package com.leetcode.datastructures;

public class Trie {
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		for(String s: new String[] {"Shishir", "Pavan", "Surana", "Patil", "Modani"}) {
			t.insert(s);
		}
		
		for(String s: new String[] {"Shi", "Pan", "Suran", "Ptil", "Moda", "Pitam"}) {
			System.out.println(t.startsWith(s));
		}
	}
	
	public boolean search(String s) {
		TrieNode current = root, temp;
		for(char c: s.toCharArray()) {
			if((current = current.getCharInMap(c)) == null) {
				return false;
			}
		}
		return current.isEndOfWord();
	}
	
	public void insert(String s) {
		//TODO: implement this method
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
	
	public boolean startsWith(String s) {
		TrieNode current = root;
		for(char c: s.toCharArray()) {
			if((current = current.getCharInMap(c)) == null) {
				return false;
			}
		}
		
		return current.elements.size() > 0 || current.isEndOfWord() ? true : false;
	}

}
