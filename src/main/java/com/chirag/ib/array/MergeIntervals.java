package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.chirag.ib.util.ArrayUtil;

public class MergeIntervals {

	public static class Interval {
		int start;
		int end;
		public Interval() { start = 0; end = 0; }
		public Interval(int s, int e) { start = s; end = e;}
		
		public String toString()
		{
			return "[" + this.start + ", " + this.end + "]";
		}
		
		@Override
		public boolean equals(Object o)
		{
			if(!(o instanceof Interval) || o==null)
				return false;
			else if(this==o)
				return true;
			else
			{
				Interval other = (Interval)o;
				if(this.start==other.start && this.end==other.end)
					return true;
			}
			
			return false;
		}
	}
	
	public class IntervalComparator implements Comparator<Interval>
	{
		public int compare(Interval o1, Interval o2)
		{
			int res = Integer.compare(o1.start, o2.start);
			return res==0 ? Integer.compare(o1.end, o2.end) : res;
		}
		
	}
	
	private void swapIntervalBoundries(Interval interval)
	{
		int temp = interval.start;
		interval.start = interval.end;
		interval.end = temp;
	}
	
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval)
	{
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		if(intervals==null || newInterval==null)
			return result;
		
		if(newInterval.start>newInterval.end)
			swapIntervalBoundries(newInterval);
		
		intervals.add(newInterval);
		IntervalComparator cmp = new IntervalComparator();
		Collections.sort(intervals, cmp);
		
		for(int i=0; i<intervals.size();)
		{
			int j = i+1;
			while(j<intervals.size() && intervals.get(i).end>=intervals.get(j).start)
			{
				if(intervals.get(i).end<intervals.get(j).end)
					intervals.get(i).end = intervals.get(j).end;
				intervals.get(j).start = intervals.get(j).end = -1;
				j++;
			}
			i = j;
		}
		
		for(int i=0; i<intervals.size(); i++)
		{
			if(intervals.get(i).start!=-1 && intervals.get(i).end!=-1)
				result.add(intervals.get(i));
		}
		
		return result;
    }
	
	public static void main(String[] args)
	{
		MergeIntervals obj = new MergeIntervals();
		
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(12,16));
		input.add(new Interval(1, 2));
		input.add(new Interval(6, 6));
		input.add(new Interval(3, 5));
		input.add(new Interval(8,10));
		Interval newInterval = new Interval(4, 9); 
		ArrayList<Interval> result = obj.insert(input, newInterval);
		ArrayUtil.printList(result);
	}

}
