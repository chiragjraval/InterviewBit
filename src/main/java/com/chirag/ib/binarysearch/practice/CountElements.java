package com.chirag.ib.binarysearch.practice;

import java.util.List;

public class CountElements
{
	private int findFirstIndex(List<Integer> a, int b)
	{
		int result = -1;
		int low = 0, high = a.size()-1;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			int curNum = a.get(mid); 
		
			if(curNum==b)
			{
				result = mid;
				high = mid-1;
			}
			else if(curNum<b)
				low = mid+1;
			else
				high = mid-1;
		}
		
		return result;
	}
	
	public int findCount(final List<Integer> a, int b)
	{
		if(a==null || a.isEmpty())
			return 0;
		
		int firstOccurence = findFirstIndex(a, b);
		int numOccurecne = 0;
		
		if(firstOccurence>=0)
		{
			for(int i=firstOccurence; i<a.size() && a.get(i).equals(b); i++)
				numOccurecne++;
		}
		
		return numOccurecne;
	}
}
