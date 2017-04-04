package com.chirag.ib.level5.checkpoint;

import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence
{
	public int longestConsecutive(final List<Integer> a)
	{
		int result = 0;
		
		if(a==null || a.size()==0)
			return result;
		
		HashSet<Integer> valueSet = new HashSet<Integer>(a.size());
		for (Integer inValue : a) valueSet.add(inValue);
		
		for (int i=0; i<a.size(); i++)
		{
			int curValue = a.get(i);
			if(!valueSet.contains(curValue-1))
			{
				int j = curValue;
				while(valueSet.contains(j)) j++;
				
				result = Math.max(result, j-curValue);
			}
		}
		
		return result;
	}
}
