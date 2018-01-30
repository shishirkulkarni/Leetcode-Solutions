package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	
	private class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
	public static void main(String[] args) {
		MergeIntervals m = new MergeIntervals();
		List<Interval> intervals = new ArrayList<>();
		intervals.add(m.new Interval(1, 3));
		intervals.add(m.new Interval(2, 6));
		intervals.add(m.new Interval(8, 10));
		intervals.add(m.new Interval(15, 18));
		System.out.println(intervals);
	}
	
	public List<Interval> merge(List<Interval> intervals) {
		
		intervals.sort(new Comparator<Interval>() {

			@Override
			public int compare(MergeIntervals.Interval o1, MergeIntervals.Interval o2) {
				if(o1.start < o2.start)
					return -1;
				if(o1.start == o2.start)
					return 0;
				return 1;
			}
		});
		
		System.out.println(intervals);
		
		return null;
		
	}
}
