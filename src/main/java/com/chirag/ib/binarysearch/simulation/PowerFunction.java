package com.chirag.ib.binarysearch.simulation;

public class PowerFunction
{
	private long getRemainder(long x, long d)
	{
		long rem = x>=0 ? x%d : d+(x%d);
		return rem; 
	}
	
	private long powLong(long x, long n, long d)
	{
		if(x==0)
			return 0;
		else if(n==0)
			return 1;
		else if(n==1)
			return getRemainder(x, d);
		else
		{
			long temp = powLong(x, n>>1, d)%d;
			long tempSqr = getRemainder(temp*temp, d);
			return n%2==0 ? tempSqr : getRemainder(tempSqr*x, d);
		}
	}
	
	public int pow(int x, int n, int d)
	{
		int result = (int)powLong(x, n, d);
		return result;
	}
}
