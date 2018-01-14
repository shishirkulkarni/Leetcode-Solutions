package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

public class NthEndNode {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		System.out.println(new NthEndNode().removeNthFromEnd(head, 1));
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null)
			return head;
		
		ListNode cur = head, prev = null;
		
		while(n > 0) {
			if(cur == null)
				return head;
			n--;
			cur = cur.next;
		}
		
		if(cur == null)
			return head.next;
		else
			cur = cur.next;
		
		
		prev = head;
		
		while(cur != null) {
			cur = cur.next;
			prev = prev.next;
		}
				
		prev.next = prev.next.next;
		
		return head;
    }
}
