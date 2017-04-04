package com.chirag.ib.string.search;

public class ImplementStrstr
{
	public int strStr(final String haystack, final String needle)
	{
		if(haystack==null || needle==null || haystack.isEmpty() || needle.isEmpty() || haystack.length()<needle.length())
			return -1;
		
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		
		for(int i=0; i<haystackLength-needleLength+1; i++)
		{
			boolean match = true;
			for(int j=0; j<needleLength; j++)
			{
				if(haystack.charAt(i+j)!=needle.charAt(j))
				{
					match = false;
					break;
				}
			}
			
			if(match) return i;
		}
		
		return -1;
	}
}
