package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArrayProblem {

	// DO NOT MODFIY THE LIST. 
	public static int maxSubArray(final List<Integer> a)
	{
		assert(a!=null && a.size()>0);
		
		Integer maxSoFar = a.get(0);
		Integer currMax = a.get(0);
		
		for(int i=1; i<a.size(); i++)
		{
			Integer elem = a.get(i);
			currMax = Math.max(elem, currMax+elem);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		
		return maxSoFar;
	}
	
	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(-2);a.add(1);a.add(-3);a.add(4);a.add(-1);a.add(2);a.add(1);a.add(-5);a.add(4);
		
		System.out.println(maxSubArray(a));
	}
	
}
