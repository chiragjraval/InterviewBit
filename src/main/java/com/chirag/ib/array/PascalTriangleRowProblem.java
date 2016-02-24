package com.chirag.ib.array;

import java.util.ArrayList;

import com.chirag.ib.util.ArrayUtil;

public class PascalTriangleRowProblem
{
	public ArrayList<Integer> getRow(int a)
	{
		if(a<0)
			return new ArrayList<Integer>();
			
		Integer row = a;
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		Integer curNumber = 1;
		for(int i=0; i<=row; i++)
		{
			output.add(curNumber);
			curNumber = curNumber * (row-i) / (i+1); 
		}
		
		return output;
	}
	
	public static void main(String[] args)
	{
		PascalTriangleRowProblem obj = new PascalTriangleRowProblem();
		
		ArrayList<Integer> output = obj.getRow(5);
		ArrayUtil.printList(output);
		
		output = obj.getRow(6);
		ArrayUtil.printList(output);
		
		output = obj.getRow(7);
		ArrayUtil.printList(output);
		
		output = obj.getRow(8);
		ArrayUtil.printList(output);
		
		output = obj.getRow(9);
		ArrayUtil.printList(output);
		
		output = obj.getRow(10);
		ArrayUtil.printList(output);
	}
}
