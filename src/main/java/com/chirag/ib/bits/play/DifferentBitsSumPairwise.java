package com.chirag.ib.bits.play;

import java.util.ArrayList;

public class DifferentBitsSumPairwise
{
	/*private int numberOfOneBits(long a)
	{
		int numberOfOneBits = 0;
		
		while(a!=0)
		{
			a = a & (a-1);
			numberOfOneBits++;
		}
		
		return numberOfOneBits;
	}*/
	
	/*public int diffBitsSumPairwise(ArrayList<Integer> a)
	{
		if(a==null || a.isEmpty())
			return 0;
		
		int result = 0;
		final int BASE = 1000000007; 
		int aLength = a.size();
		
		for(int i=0; i<aLength-1; i++)
		{
			int curNum = a.get(i);
			for(int j=i+1; j<aLength; j++)
			{
				int nextNum = a.get(j);
				int diffBitsCount = numberOfOneBits(curNum^nextNum);
				diffBitsCount = diffBitsCount<<1;
				result = result+diffBitsCount;
			}
			result = result%BASE;
		}
		
		return result;
	}*/
	
	public int diffBitsSumPairwise(ArrayList<Integer> A)
	{
		if(A==null || A.isEmpty())
			return 0;
		
		int result = 0;
		final int BIT_COUNT = 32, BASE = 1000000007;
		int aLength = A.size();
		Integer[] aArr = A.toArray(new Integer[aLength]);
		
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
			
			int curBitResult = (bitCount * (aLength-bitCount))<<1; 
			result = (result+curBitResult)%BASE;
		}
		
		return result;
	}
}
