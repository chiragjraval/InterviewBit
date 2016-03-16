package com.chirag.ib.math.numbertheory;

public class SortedPermutationRankWithRepeats
{
	private static final int base = 1000003;
	
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
	
	private int permutations(int chars, int[] charCountArr)
	{
		int permutations = factorial(chars);
		
		for (int count : charCountArr) {
			if(count>1)
				permutations =  (permutations/factorial(count))%base;
		}
		
		return permutations;
	}
	
	private int getSmallerChars(char c, int[] charCountArr)
	{
		int smallerChars = 0;
		
		for(int i=c-1; i>=0; i--)
			if(charCountArr[i]>0)
				smallerChars++;
		
		return smallerChars;
	}
	
	public int findRank(String a)
	{
		if(a==null || a.length()<1)
			return -1;
		
		int[] charCountArr = new int[256];
		char[] inCharArr = a.toCharArray();
		int rank = 0;
		
		for (char c : inCharArr)
			charCountArr[c]++;
		
		for (int i=0; i<inCharArr.length; i++)
		{
			char curChar = inCharArr[i];
			int smallerChars = getSmallerChars(curChar, charCountArr);
			rank += (smallerChars * permutations(inCharArr.length-i-1, charCountArr)) % base;
			charCountArr[curChar]--;
		}
		
		return rank+1;
	}

}
