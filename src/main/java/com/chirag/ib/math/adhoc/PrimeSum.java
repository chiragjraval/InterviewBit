package com.chirag.ib.math.adhoc;

import java.util.ArrayList;

public class PrimeSum
{
	private boolean isPrime(int num)
	{
		if(num<2)
			return false;
		
		int sqrtNum = (int)Math.sqrt(num);
		
		for(int i=2; i<=sqrtNum; i++)
			if(num%i==0)
				return false;
		
		return true;
	}
	
	public ArrayList<Integer> getPrimeSumPair(int num)
	{
		if(num<2 || num%2!=0)
			return new ArrayList<Integer>();
		
		int halfNum = num>>1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=2; i<=halfNum; i++)
		{
			if(isPrime(i) && isPrime(num-i))
			{
				result.add(i);
				result.add(num-i);
				return result;
			}
		}
		
		return result;
	}
}
