package com.chirag.ib.array;

import java.util.ArrayList;

import com.chirag.ib.util.ArrayUtil;

public class SpiralOrderMatrix2
{
	private ArrayList<ArrayList<Integer>> getResultArrayList(int a)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(a);
		for(int i=0; i<a; i++)
		{
			ArrayList<Integer> row = new ArrayList<Integer>(a);
			for(int j=0; j<a; j++)
				row.add(0);
			result.add(row);
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> generateMatrix(int a)
	{
		int i=a-1, j=a-1;
		int k=0, l=0;
		
		ArrayList<ArrayList<Integer>> result = getResultArrayList(a);
		Integer val = 1;
		
		while(k<=i && l<=j)
		{
			for(int m=l; m<=j; m++)
				result.get(k).set(m, val++);
			
			k++;
			
			for(int m=k; m<=i; m++)
				result.get(m).set(j, val++);
			
			j--;
			
			for(int m=j; m>=l; m--)
				result.get(i).set(m, val++);
			
			i--;
			
			for(int m=i; m>=k; m--)
				result.get(m).set(l, val++);
			
			l++;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		SpiralOrderMatrix2 obj = new SpiralOrderMatrix2();
		
		ArrayList<ArrayList<Integer>> result = obj.generateMatrix(3);
		for (ArrayList<Integer> resultRow : result)
			ArrayUtil.printList(resultRow);
		
		result = obj.generateMatrix(4);
		for (ArrayList<Integer> resultRow : result)
			ArrayUtil.printList(resultRow);
	}

}
