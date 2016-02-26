package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositiveNumProblem
{
	private void swap(ArrayList<Integer> input, int idx1, int idx2)
	{
		Integer temp = input.get(idx1);
		input.set(idx1, input.get(idx2));
		input.set(idx2, temp);
	}
	
	private int moveNegativeNumsToLeft(ArrayList<Integer> input)
	{
		int j=0;
		
		for(int i=0; i<input.size(); i++)
		{
			if(input.get(i) <= 0)
			{
				swap(input, i, j);
				j++;
			}
		}
		
		return j;
	}
	
	public int firstMissingPositive(ArrayList<Integer> a)
	{
		if(a==null || a.size()<=0)
			return 1;
		
		int positiveStartIndex = moveNegativeNumsToLeft(a);
		int remainingSize = a.size() - positiveStartIndex;
		
		for(int i=positiveStartIndex; i<a.size(); i++)
		{
			int curNum = Math.abs(a.get(i));
			if(curNum-1<remainingSize && curNum>0)
				a.set(positiveStartIndex+curNum-1, -a.get(positiveStartIndex+curNum-1));
		}
		
		for(int i=positiveStartIndex; i<a.size(); i++)
			if(a.get(i)>0)
				return i-positiveStartIndex+1;
		
		return remainingSize+1;
	}
	
	
	public static void main(String[] args)
	{
		FirstMissingPositiveNumProblem obj = new FirstMissingPositiveNumProblem();
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 0));
		System.out.println("Missing Num = " + obj.firstMissingPositive(input));
		
		input = new ArrayList<Integer>(Arrays.asList(3, 4, -1, 1));
		System.out.println("Missing Num = " + obj.firstMissingPositive(input));
		
		input = new ArrayList<Integer>(Arrays.asList(-8, -7, -6));
		System.out.println("Missing Num = " + obj.firstMissingPositive(input));
		
		input = new ArrayList<Integer>(Arrays.asList(3, 2, 6, 1, 7));
		System.out.println("Missing Num = " + obj.firstMissingPositive(input));
	}
}
