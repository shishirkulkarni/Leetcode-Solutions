package com.leetcode.datastructures;

public class ListNode {
	
	/* Making easier to access */
	public int val;
	public ListNode next;
	
	public ListNode() {
		this.val = 0;
		this.next = null;
	}
	
	public ListNode(int data) {
		this.val = data;
		this.next = null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListNode it = this;
		
		while(it != null) {
			sb.append(it.val + " ");
			it = it.next;
		}
		
		return sb.toString();
	}

}
