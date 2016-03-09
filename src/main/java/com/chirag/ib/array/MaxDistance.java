package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDistance {

	/*public int maximumGap(final List<Integer> a)
	{
		if(a==null || a.size()==0)
			return -1;
		
		int aLength = a.size();
		int maxDist = -1;
		
		for(int i=0; i<aLength; i++)
		{
			if(aLength-i-1<maxDist)
				break;
			
			Integer curInt = a.get(i);
			int curMaxDist = 0;
			for(int j=aLength-1; j>i; j--)
			{
				if(curInt.compareTo(a.get(j))<=0)
				{
					curMaxDist = j - i;
					break;
				}
			}
			
			if(maxDist<curMaxDist)
				maxDist = curMaxDist;
		}
		
		return maxDist;
	}*/
	
	public int maximumGap(final List<Integer> a)
	{
		if(a==null || a.size()==0)
			return -1;
		
		int aLength = a.size();
		Integer[] LMin = new Integer[aLength];
		Integer[] RMax = new Integer[aLength];
		
		LMin[0] = a.get(0);
		for(int i=1; i<aLength; i++)
			LMin[i] = Math.min(LMin[i-1], a.get(i));
		
		RMax[aLength-1] = a.get(aLength-1);
		for(int i=aLength-2; i>=0; i--)
			RMax[i] = Math.max(RMax[i+1], a.get(i));
		
		
		
		
		int i=0, j=0, maxDist=-1;
		
		while(i<aLength && j<aLength)
		{
			if(LMin[i]<=RMax[j])
			{
				maxDist = Math.max(maxDist, j-i);
				j++;
			}
			else
				i++;
		}
		
		return maxDist;
	}
	
	public static void main(String[] args)
	{
		MaxDistance obj = new MaxDistance();
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3, 5, 4, 2));
		System.out.println("Max Distance = " + obj.maximumGap(input));
		
		input = new ArrayList<Integer>(Arrays.asList(3, 5, 4, 2, 6));
		System.out.println("Max Distance = " + obj.maximumGap(input));
		
		input = new ArrayList<Integer>(Arrays.asList(3, 1, 4, 2, 6, 2, 1));
		System.out.println("Max Distance = " + obj.maximumGap(input));
	}

}
