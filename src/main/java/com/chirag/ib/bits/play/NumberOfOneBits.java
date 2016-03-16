package com.chirag.ib.bits.play;

public class NumberOfOneBits
{
	public int numberOfOneBits(long a)
	{
		int numberOfOneBits = 0;
		
		while(a!=0)
		{
			a = a & (a-1);
			numberOfOneBits++;
		}
		
		return numberOfOneBits;
	}
}
