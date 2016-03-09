package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.chirag.ib.util.ArrayUtil;



public class MergeOverlappingIntervals {

	static class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e;}
		
		public String toString()
		{
			return "[" + this.start + ", " + this.end + "]";
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
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals)
	{
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		if(intervals==null || intervals.size()==0)
			return result;
		
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
		MergeOverlappingIntervals obj = new MergeOverlappingIntervals();
		
		ArrayList<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(15, 18));
		input.add(new Interval(1, 3));
		input.add(new Interval(8, 10));
		input.add(new Interval(3, 6));
		ArrayList<Interval> result = obj.merge(input);
		ArrayUtil.printList(result);
	}

}
