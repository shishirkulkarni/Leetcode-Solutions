package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

public class ListLoopDetection {
	public static void main(String[] args) {
		
	}
	
	public boolean hasCycle(ListNode head) {
		
		ListNode slow = head, fast = head;
		do {
			if(slow == null)
				return false;
			if(fast == null || fast.next == null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		} while(slow != fast);
		
		return true;
    }

}
