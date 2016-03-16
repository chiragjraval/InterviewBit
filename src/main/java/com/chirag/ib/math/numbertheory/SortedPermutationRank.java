package com.chirag.ib.math.numbertheory;

import java.util.ArrayList;
import java.util.Collections;

public class SortedPermutationRank
{
	private static final int base = 1000003;
	
	private ArrayList<Character> getSortedCharList(char[] inCharArr)
	{
		ArrayList<Character> sortedCharList = new ArrayList<Character>(inCharArr.length);
		for (char c : inCharArr)
			sortedCharList.add(c);
		Collections.sort(sortedCharList);
		return sortedCharList;
	}
	
	private int factorial(int num)
	{
		if(num<=1)
			return 1;
		else
		{
			int factorial = 1;
			for(int i=2; i<=num; i++)
				factorial = (factorial*i)%base;
			return factorial;
		}
	}
	
	public int findRank(String a)
	{
		String inStr = a;
		
		if(a==null || a.isEmpty())
			return -1;
		
		int rank = 0;
		char[] inCharArr = inStr.toCharArray();
		ArrayList<Character> sortedCharList = getSortedCharList(inCharArr);
		
		for(int i=0; i<inCharArr.length-1; i++)
		{
			int combination = factorial(inCharArr.length-i-1);
			int smallerChar = sortedCharList.indexOf(inCharArr[i]);
			rank += combination*smallerChar;
			rank %= base;
			sortedCharList.remove((Character)inCharArr[i]);
		}
		
		return rank+1;
	}
}
