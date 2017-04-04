package com.chirag.ib.binarysearch.practice;

import java.util.List;

public class RotatedArray
{
	public int findMin(final List<Integer> a)
	{
		if(a==null || a.isEmpty())
			return -1;
		
		int low = 0, high = a.size()-1;
		
		if(a.get(low).compareTo(a.get(high))<=0)
			return a.get(low);
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			Integer curNum = a.get(mid); 
		
			if(curNum.compareTo(a.get(mid-1))<0 && curNum.compareTo(a.get(mid+1))<0)
			{
				return a.get(mid);
			}
			else if(curNum.compareTo(a.get(0))<0)
				high = mid-1;
			else
				low = mid+1;
		}
		
		return -1;
	}
}
