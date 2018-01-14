package com.leetcode.easy;

import java.util.Stack;

import com.leetcode.datastructures.ListNode;

public class IsListPalin {
	public static void main(String[] args) {
		
	}
	
	public boolean isPalindrome(ListNode head) {
		if(head == null)
            return true;
        
        int length = 0;
        ListNode cur = head;
        
        while(cur != null) {
        	length++;
        	cur = cur.next;
        }
        
        if(length == 1) {
            return true;
        }
        
        
        cur = head;
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < length / 2; i++) {
        	s.push(cur.val);
        	cur = cur.next;
        }
        
        if(length % 2 != 0)
        	cur = cur.next;
        
        while(cur != null) {
        	if(s.pop() != cur.val) {
        		return false;
        	}
            cur = cur.next;
        }
        
        return true;
    }
}
