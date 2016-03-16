package com.chirag.ib.bits.array;

import java.util.ArrayList;

public class SingleNumberTwo
{
	public int singleNumberTwo(ArrayList<Integer> a)
	{
		if(a==null || a.isEmpty())
			return -1;
		
		/*int ones = 0, twos = 0;
		int commonBitsMask = 0;
		
		for (Integer inNum : a)
		{
			twos |= (inNum&ones);
			ones ^= inNum;
			commonBitsMask = ~(ones^twos);
			ones &= commonBitsMask;
			twos &= commonBitsMask;
		}*/
		
		int result = 0;
		final int BIT_COUNT = 32;
		int aLength = a.size();
		Integer[] aArr = a.toArray(new Integer[aLength]);
		
		int[] bitComparator = new int[BIT_COUNT];
		
		for(int i=0; i<BIT_COUNT; i++)
		{
			bitComparator[i] = (1<<i);
			int bitCount = 0;
			
			for(int j=0; j<aLength; j++)
			{
				int curNum = aArr[j];
				if((curNum&bitComparator[i])>0){
					bitCount++;
				}
			}
			
			if(bitCount%3>0)
			result |= bitComparator[i];
		}
			
		return result;
	}
}
