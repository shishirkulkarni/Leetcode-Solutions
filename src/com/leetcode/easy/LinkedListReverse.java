package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

public class LinkedListReverse {
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		
		System.out.println(new LinkedListReverse().reverseList(head));
	}
	
	public ListNode reverseList(ListNode head) {
		if(head == null)
			return head;
		
		ListNode tmp, cur = head, prev = null;
		while(cur!= null) {
			tmp = cur.next;
			if(prev == head)
				prev.next = null;
			if(prev != null)
				cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		
		
		head = prev;
		
		return head;
    }
}
