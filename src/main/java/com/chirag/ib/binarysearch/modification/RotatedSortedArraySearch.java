package com.chirag.ib.binarysearch.modification;

import java.util.List;

public class RotatedSortedArraySearch
{
	/*private int findPivot(final List<Integer> a)
	{
		if(a==null || a.isEmpty())
			return -1;
		
		int low = 0, high = a.size()-1;
		
		if(a.get(low).compareTo(a.get(high))<=0)
			return low;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			Integer curNum = a.get(mid); 
		
			if(curNum.compareTo(a.get(mid-1))<0 && curNum.compareTo(a.get(mid+1))<0)
				return mid;
			else if(curNum.compareTo(a.get(0))<0)
				high = mid-1;
			else
				low = mid+1;
		}
		
		return -1;
	}
	
	private int binarySearch(final List<Integer> a, int low, int high, int key)
	{
		if(a==null || a.isEmpty())
			return -1;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			Integer curNum = a.get(mid); 
		
			if(curNum.equals(key))
				return mid;
			else if(curNum.compareTo(key)<0)
				low = mid+1;
			else
				high = mid-1;
		}
		
		return -1;
	}
	
	public int search(final List<Integer> a, int b)
	{
		int pivot = findPivot(a);
		int aLength = a.size();
		
		if(pivot==-1)
			return binarySearch(a, 0, aLength-1, b);
		else if(a.get(pivot).compareTo(b)==0)
			return pivot;
		else if(a.get(0).compareTo(b)<=0)
			return binarySearch(a, 0, pivot-1, b);
		else
			return binarySearch(a, pivot+1, aLength, b);
	}*/
	
	private int search(final List<Integer> a, int low, int high, int b)
	{
		if(low > high)
			return -1;
		
		int mid = (low+high)>>1;
		
		if(a.get(mid).compareTo(b)==0)
			return mid;
		else if(a.get(low).compareTo(a.get(mid))<=0)
		{
			if(a.get(low).compareTo(b)<=0 && a.get(mid).compareTo(b)>0)
				return search(a, low, mid-1, b);
			else
				return search(a, mid+1, high, b);
		}
		else
		{
			if(a.get(mid).compareTo(b)<0 && a.get(high).compareTo(b)>=0)
				return search(a, mid+1, high, b);
			else
				return search(a, low, mid-1, b);
		}
		
	}
	
	public int search(final List<Integer> a, int b)
	{
		if(a==null || a.size()==0)
			return -1;
		
		return search(a, 0, a.size()-1, b);
	}
}
