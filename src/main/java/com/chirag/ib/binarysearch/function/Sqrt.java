package com.chirag.ib.binarysearch.function;

public class Sqrt
{
	public int sqrt(int a)
	{
		int result = -1;
		int low = 0, high = a;
		
		while(low<=high)
		{
			int mid = (low + high)>>1;
			long sqr = (long) Math.pow((double)mid, 2);
		
			if(sqr==a)
				return mid;
			else if(sqr<a)
			{
				low = mid + 1;
				result = mid;
			}
			else
				high = mid - 1;
		}
		
		return result;
	}
}
