package com.chirag.ib.math.numbertheory;

public class TrailingZerosInFactorial
{
	public int getTrailingZeros(int a)
	{
		if(a<0)
			return -1;
		
		int trailingZeros = 0;
		
		for(int i=5; Math.floor(a/i)>=1; i*=5)
			trailingZeros += Math.floor(a/i);
		
		return trailingZeros;
	}
}
