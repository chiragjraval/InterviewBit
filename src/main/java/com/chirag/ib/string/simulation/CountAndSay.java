package com.chirag.ib.string.simulation;

public class CountAndSay
{
	private String getCountStr(String input)
	{
		StringBuilder countStrBuilder = new StringBuilder();
		char[] inputCharArr = input.toCharArray();
		
		for(int i=0; i<inputCharArr.length; )
		{
			int charCount = 1;
			while(i+1<inputCharArr.length && inputCharArr[i]==inputCharArr[i+1])
			{
				charCount++;
				i++;
			}
			countStrBuilder.append(charCount).append(inputCharArr[i]);
			i++;
		}
		
		return countStrBuilder.toString();
	}
	
	public String countAndSay(int a)
	{
		if(a<=0)
			return "";
		
		String result = "1";
		
		for(int i=1; i<a; i++)
			result = getCountStr(result);
		
		return result;
	}
}
