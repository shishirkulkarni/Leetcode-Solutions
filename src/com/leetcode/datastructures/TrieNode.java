package com.leetcode.datastructures;

import java.util.HashMap;
import java.util.Iterator;

public class TrieNode {
	HashMap<Character, TrieNode> elements;
	boolean endOfWord;
	
	public TrieNode() {
		this.elements = new HashMap<Character, TrieNode>();
		this.endOfWord = false;
	}
	
	public TrieNode getCharInMap(char c) {
		return elements.get(c);
	}
	
	public TrieNode putCharInMap(char c) {
		TrieNode newNode = new TrieNode();
		elements.put(c, newNode);
		return newNode;
	}
	
	public void setEndOfWord() {
		endOfWord = true;
	}
	
	public void unsetEndOfWord() {
		endOfWord = false;
	}
	
	public boolean isEndOfWord() {
		return endOfWord;
	}
	

}
