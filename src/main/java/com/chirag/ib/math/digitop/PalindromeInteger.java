package com.chirag.ib.math.digitop;

public class PalindromeInteger
{
	public boolean isPalindromeInteger(int num)
	{
		if(num<0)
			return false;
		
		char[] numCharArray = String.valueOf(num).toCharArray();
		int arrLength = numCharArray.length;
		
		for(int i=0; i<(numCharArray.length>>1); i++)
		{
			if(numCharArray[i]!=numCharArray[arrLength-i-1])
				return false;
		}
		
		return true;
	}
}
