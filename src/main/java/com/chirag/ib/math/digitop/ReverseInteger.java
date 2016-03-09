package com.chirag.ib.math.digitop;

public class ReverseInteger
{
	private void swap(char[] arr, int idx1, int idx2)
	{
		char temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public int reverseInteger(int num)
	{
		int minusFlag = (num<0) ? -1 : 1;
		num = Math.abs(num);
		
		char[] numCharArray = String.valueOf(num).toCharArray();
		int arrLength = numCharArray.length;
		
		if(arrLength==0)
			return num;
		
		for(int i=0; i<(arrLength>>1); i++)
			swap(numCharArray, i, arrLength-i-1);
		
		try
		{
			return Integer.valueOf(String.valueOf(numCharArray)) * minusFlag;
		}
		catch (Exception ex)
		{
			return 0;
		}
	}
}
