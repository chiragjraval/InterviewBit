package com.chirag.ib.string.prettyprint;

import java.util.ArrayList;

public class ZigzagString
{
	public String zigzagString(String a, int n)
	{
		if(a==null || a.isEmpty() || n<1)
			return null;
		
		int aLength = a.length();
		ArrayList<ArrayList<Character>> resultList = new ArrayList<ArrayList<Character>>(n);
		for(int i=0; i<n; i++) resultList.add(new ArrayList<Character>(aLength/n+1));
		
		int i=0;
		while(i<aLength)
		{
			int j=0;
			for(; i+j<aLength && j<n; j++)
				resultList.get(j).add(a.charAt(i+j));
			
			for(int k=j-2; i+j<aLength && k>0; j++, k--)
				resultList.get(k).add(a.charAt(i+j));
			
			i += j; 
		}
		
		StringBuilder resultBuilder = new StringBuilder();
		for (ArrayList<Character> resultRow : resultList) {
			for (Character c : resultRow) {
				resultBuilder.append(c);
			}
		}
		
		return resultBuilder.toString();
	}
}
