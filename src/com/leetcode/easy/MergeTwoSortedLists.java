package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        	return null;
        else if(l1 == null)
        	return l2;
        else if(l2 == null)
        	return l1;
		
		ListNode i = l1, j = l2;
        ListNode res = i.val <= j.val ? new ListNode(i.val) : new ListNode(j.val), tmp = res;
        
        if(i.val == tmp.val) {
        	i = i .next;
        } else {
        	j = j.next;
        }
        
        while(i != null && j != null) {
        	if(i.val < j.val) {
        		tmp.next = new ListNode(i.val);
        		i = i.next;
        	} else {
        		tmp.next = new ListNode(j.val);
        		j = j.next;
        	}
        	tmp = tmp.next;
        }
        
        while(i != null) {
        	tmp.next = new ListNode(i.val);
        	i = i.next;
        	tmp = tmp.next;
        }        
        
        while(j != null) {
        	tmp.next = new ListNode(j.val);
        	j = j.next;
        	tmp = tmp.next;
        }        
        
		return res;
    }
}
