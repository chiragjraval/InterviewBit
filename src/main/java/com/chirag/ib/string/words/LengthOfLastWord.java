package com.chirag.ib.string.words;

public class LengthOfLastWord
{
	public int lengthOfLastWord(String a)
	{
		if(a==null || a.isEmpty())
			return -1;
		
		int aLength = a.length();
		int lastWordLength = 0, curWordLength = 0;
		
		for(int i=0; i<aLength; i++)
		{
			if(a.charAt(i)==' ')
			{
				lastWordLength = curWordLength>0 ? curWordLength : lastWordLength;
				curWordLength = 0;
			}
			else
				curWordLength++;
		}
		
		if(curWordLength>0)
			lastWordLength = curWordLength;
		
		return lastWordLength;
	}
}
