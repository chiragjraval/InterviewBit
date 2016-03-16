package com.chirag.ib.string.simulation;

public class PalindromeString
{
	public boolean isPalindrome(String a)
	{
		if(a==null || a.isEmpty())
			return true;
		
		String alphaNumericString = a.replaceAll("[^A-Za-z0-9]", "");
		alphaNumericString = alphaNumericString.toLowerCase();
		char[] alphaNumericArr = alphaNumericString.toCharArray();
		
		for(int i=0; i<(alphaNumericArr.length>>1); i++)
		{
			if(alphaNumericArr[i]!=alphaNumericArr[alphaNumericArr.length-i-1])
				return false;
		}
		
		return true;
	}
}
