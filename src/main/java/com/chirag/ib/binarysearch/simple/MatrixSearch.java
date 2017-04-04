package com.chirag.ib.binarysearch.simple;

import java.util.ArrayList;

public class MatrixSearch
{
	private boolean containsElement(ArrayList<Integer> a, int b)
	{
		int low = 0, high=a.size()-1;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			Integer curNum = a.get(mid);
		
			if(curNum.compareTo(b)==0)
				return true;
			else if(curNum.compareTo(b)<0)
				low = mid + 1;
			else
				high = mid -1;
		}
		
		return false;
	}
	
	private int getRow(ArrayList<ArrayList<Integer>> a, int b)
	{
		int low = 0, high=a.size();
		int result = -1;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			Integer curRowStart = a.get(mid).get(0);
		
			if(curRowStart.compareTo(b)==0)
				return mid;
			else if(curRowStart.compareTo(b)<0)
			{
				result = mid;
				low = mid + 1;
			}
			else
				high = mid -1;
		}
		
		return result;
	}
	
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b)
	{
		if(a==null || a.isEmpty() || a.get(0)==null || a.get(0).isEmpty())
			return 0;
		
		int row = getRow(a, b);
		int result = 0;
		
		if(row>=0)
		{
			result = containsElement(a.get(row), b) ? 1 : 0;
		}
		
		return result;
	}
}
