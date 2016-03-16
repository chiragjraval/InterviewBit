package com.chirag.ib.string.simulation;

import java.util.ArrayList;

public class LongestCommonPrefix
{
	private String getCommonPrefixString(String s1, String s2)
	{
		StringBuilder commonPrefixStrBuilder = new StringBuilder();
		int comparableLength = s1.length()<s2.length() ? s1.length() : s2.length();
		
		for(int i=0; i<comparableLength; i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				commonPrefixStrBuilder.append(s1.charAt(i));
		}
		
		return commonPrefixStrBuilder.toString();
	}
	
	public String longestCommonPrefix(ArrayList<String> a)
	{
		if(a==null || a.size()<=0)
			return ""; 
		
		String commonPrefixStr = a.get(0); 
		
		for (int i = 1; i < a.size(); i++)
			commonPrefixStr = getCommonPrefixString(a.get(i), commonPrefixStr);
		
		return commonPrefixStr;
	}
}
