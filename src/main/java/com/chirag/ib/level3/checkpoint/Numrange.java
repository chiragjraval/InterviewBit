package com.chirag.ib.level3.checkpoint;

import java.util.ArrayList;

import com.chirag.ib.util.ArrayUtil;

public class Numrange
{
	public int numRange(ArrayList<Integer> a, int b, int c)
	{
		if(a==null || a.isEmpty())
			return 0;
		
		int numSubsequence = 0;
		Integer curSum = 0;
		int aLength = a.size();
		int i=0, j=0;
		
		while ( i<aLength && j<aLength )
		{
			Integer curNum = a.get(j);
			
			if(curNum > c)
			{
				int k = i+1;
				while(k<j && curSum-a.get(k)>=b)
				{
					numSubsequence++;
					k++;
					curSum-= a.get(k);
					ArrayUtil.printList(a, k, j);
				}
				j++;
				i=j;
				curSum=0;
			}
			else if(curSum + curNum > c)
			{
				curSum -= a.get(i);
				i++;
				if(curSum>=b)
				{
					numSubsequence++;
					ArrayUtil.printList(a, i, j-1);
				}
			}
			else if(curSum + curNum < b)
			{
				j++;
				curSum += curNum;
			}
			else
			{
				numSubsequence++;
				ArrayUtil.printList(a, i, j);
				j++;
				curSum += curNum;
			}
		}
		
		while(i<aLength && curSum-a.get(i)>=b)
		{
			numSubsequence++;
			curSum-= a.get(i++);
			ArrayUtil.printList(a, i, j);
		}
		
		return numSubsequence;
	}

}
