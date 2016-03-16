package com.chirag.ib.string.words;

public class ReverseTheString
{	
	private static void swap(String[] arr, int idx1, int idx2)
	{
		String temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	private static void reverseArray(String[] strArr)
	{
		for(int i=0; i<(strArr.length>>1); i++)
		{
			swap(strArr, i, strArr.length-i-1);
		}
	}
	
	public String reverseWords(String a)
	{
		if(a == null || a.isEmpty())
			return a;
		
		String[] strArr = a.split(" ");
		
		if(strArr.length > 0)
			reverseArray(strArr);
		
		StringBuilder resultBuilder = new StringBuilder();
		for (String str : strArr)
		{
			if(str==null || str.isEmpty()) continue;
			if(resultBuilder.length()>0) resultBuilder.append(" ");
			resultBuilder.append(str);
		}
		
		return resultBuilder.toString();
	}
}
